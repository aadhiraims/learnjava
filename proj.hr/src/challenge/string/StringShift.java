package challenge.string;

/**
 * Input: s = "abcdefg", shift = [[1,1],[1,1],[0,2],[1,3]]
 * Output: "efgabcd"
 * Explanation:
 * [1,1] means shift to right by 1. "abcdefg" -> "gabcdef"
 * [1,1] means shift to right by 1. "gabcdef" -> "fgabcde"
 * [0,2] means shift to left by 2. "fgabcde" -> "abcdefg"
 * [1,3] means shift to right by 3. "abcdefg" -> "efgabcd"
 *
 * sample 2:
 * "yisxjwry"
 * [[1,8],[1,4],[1,3],[1,6],[0,6],[1,4],[0,2],[0,1]]
 * left: 9, right: 25
 * 16 right shift
 *
 * sample 3:
 * "yqjngrtykwo"
 * [[0,11],[1,9],[0,1],[1,6],[0,2],[0,5],[0,9],[0,10],[0,10],[0,0],[1,9]]
 * Expected: "jngrtykwoyq"
 */
public class StringShift {

    public static void main(String[] args) {
        StringShift ss = new StringShift();
        int[][] arr = new int[11][];
        arr[0] = new int[]{0,11};
        arr[1] = new int[]{1,9};
        arr[2] = new int[]{0,1};
        arr[3] = new int[]{1,6};
        arr[4] = new int[]{0,2};
        arr[5] = new int[]{0,5};
        arr[6] = new int[]{0,9};
        arr[7] = new int[]{0,10};
        arr[8] = new int[]{0,10};
        arr[9] = new int[]{0,0};
        arr[10] = new int[]{1,9};
        System.out.println(ss.stringShift("yqjngrtykwo", arr));
    }
    public String stringShift(String s, int[][] shift) {
        int left = 0;
        int right = 0;
        for(int i = 0 ; i < shift.length; i++){
            if(shift[i][0] == 0){
                left += shift[i][1];
            }
            if(shift[i][0] == 1){
                right += shift[i][1];
            }
        }
        System.out.println("Left : "+left+" Right: "+right);
        if( right > left ){
            int numShift = right - left;
            //System.out.println("Right Shift "+numShift+" times");
            if(numShift > s.length()){
                numShift = numShift % s.length();
            }
            //System.out.println("Left Rotate by "+ (s.length()-numShift));
            return leftRotate(s, s.length()-numShift);
        }
        else if (left > right) {
            int numShift = left - right;
            if(numShift > s.length()){
                numShift = numShift % s.length();
            }
            //System.out.println("Left Shift " + numShift + " times");
            return leftRotate(s, numShift);
        }
        else if(left == right){
            return s;
        }
        return "";
    }

    public String leftRotate(String s, int n){
        if( n == 0)
            return s;
        else {
            String ans = s.substring(n) + s.substring(0, n);
            return ans;
        }
    }
}

    /**
     *  Logic behind the implementation is
     *  string: bear
     *  Logic 1:
     *  left rotate by 1 => earb
     *  right rotate by 3 => earb
     *  if the length is 4, then 1 left rotated string is equal to 3 right rotate string
     *  len = 4; if left=3 equivalent to right=len-left=1
     *
     *  Logic 2:
     *  len:4
     *  rotate 15 times
     *  rotate%len = 15 % 4 = 3 i.e rotate 3 times to achieve result of rotating 16 times
     */



