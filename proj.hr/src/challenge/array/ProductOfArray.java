package challenge.array;

/**
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 *
 * output[0] = input[1] * input[2] * input[3]
 * output[1] = input[0] * input[2] * input[3]
 * output[2] = input[0] * input[1] * input[3] etc
 */

public class ProductOfArray {
    public static void main(String[] args) {
        ProductOfArray pa= new ProductOfArray();
        pa.productExceptSelf(new int[]{1,2,3,4});
    }
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        for(int i = 0 ; i < res.length; i++){
            res[i] = 1;
        }
        int temp = 1;
        for(int i = 0; i < res.length; i++){
            res[i] = temp;
            temp = temp * nums[i];
        }
        temp = 1;
        for(int i = res.length-1; i >= 0; i--){
            res[i] = res[i] * temp;
            temp = temp * nums[i];
        }
        for(int i : res)
            System.out.print(i+"\t");
        return res;
    }

}

/**
 * O(n) Logic 1: Using Division
 * Product of all elements : 1*2*3*4 = 24
 * output[0] = 24/output[0] = 24
 * output[1] = 24/output[1] = 12
 * output[2] = 24/output[2] = 8 etc
 *
 */

/**
 *
 *
 */