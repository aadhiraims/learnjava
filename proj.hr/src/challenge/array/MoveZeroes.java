package challenge.array;

/**
 * In a given array, move all the zeroes at the end of the array without changing the order of other elements
 * Best effort: Use the same array (without extra memory)
 */

public class MoveZeroes {
    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
        moveZeroes(new int[]{4, 0, 3, 0, 5});
    }
    public static void moveZeroes(int[] nums) {
        int temp = 0;
        int i = 0;
        while(i < nums.length){
            //System.out.println(i+" "+nums[i]);
            if(nums[i] == 0){
                int j = i+1;
                while( j < nums.length){
                    //System.out.println(j+" "+nums[j]);
                    if(nums[j] != 0){
                        temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                    j++;

                }
                i++;
            }
            else{
                i++;
            }
        }
        System.out.println();
        for(int c: nums)
            System.out.print(c+"\t");
    }
}
