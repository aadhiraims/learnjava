package challenge.array;

/**
 * In a given string, traverse the subarray to find maximum sum
 * Kandane's Algorithm - Revise
 */
public class MaximumSumSubArray {
    public static void main(String[] args) {
        System.out.println("Max Sum in the array {-2,1,-3,4,-1,2,1,-5,4} is "+maxSum(new int[]{-2,1,-3,4,-1,2,1,-5,4})+"\n\n");
        System.out.println("Max Sum in the array {1, 7, 4, 11} is "+maxSum(new int[]{1, 7, 4, 11})+"\n\n");
        System.out.println("Max Sum in the array {1, 17, 20, -1, 1} is "+maxSum(new int[]{1, 17, 20, 1})+"\n\n");
        System.out.println("Max Sum in the array {-1, -2, -3, -1, -4} is "+maxSum(new int[]{-1, -2, -3, -1, -4})+"\n\n");
        System.out.println("Max Sum in the array {-2, -1, -1, 0} is "+maxSum(new int[]{-2, -1, -1, 0})+"\n\n");
    }

    public static int maxSum(int[] arr){
        int max = arr[0];
        int currMax = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            //System.out.print("curr + arr : "+(currMax+arr[i]));
            currMax = Math.max(arr[i], currMax+arr[i]);
            //System.out.print("\t Cmax : "+currMax);
            max = Math.max(max, currMax);
            //System.out.println("\t SMax : "+max);
        }
        return max;
    }
}
