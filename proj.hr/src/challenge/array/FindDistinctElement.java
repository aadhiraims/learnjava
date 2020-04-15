package challenge.array;

/**
 * Find the unique element in a given array
 * without using extra memory
 */
public class FindDistinctElement {
    public static void main(String[] args) {
        System.out.println("Unique element in {-1,-1,-2} is " +findUniqueElement(new int[]{-1,-1,-2}));
        System.out.println("Unique element in {4,3,1,3,4} is " +findUniqueElement(new int[]{4,3,1,3,4}));
        System.out.println("Unique element in {4,1,2,1,2} is " +findUniqueElement(new int[]{4,1,2,1,2}));
    }
    public static int findUniqueElement(int[] arr){
        int res = arr[0];
        for(int i = 1 ; i < arr.length; i++){
            res ^= arr[i];
        }
        return res;
    }

}
