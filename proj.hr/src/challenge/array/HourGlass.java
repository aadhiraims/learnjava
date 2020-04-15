package challenge.array;

public class HourGlass {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        /*
        arr[0] = new int[]{1, 1, 1, 0, 0, 0};
        arr[1] = new int[]{0, 1, 0, 0, 0, 0};
        arr[2] = new int[]{1, 1, 1, 0, 0, 0};
        arr[3] = new int[]{0, 0, 2, 4, 4, 0};
        arr[4] = new int[]{0, 0, 0, 2, 0, 0};
        arr[5] = new int[]{0, 0, 1, 2, 4, 0};
        */
        arr[0] = new int[]{-1, -1,  0, -9, -2, -2};
        arr[1] = new int[]{-2, -1, -6, -8, -2, -5};
        arr[2] = new int[]{-1, -1, -1, -2, -3, -4};
        arr[3] = new int[]{-1, -9, -2, -4, -4, -5};
        arr[4] = new int[]{-7, -3, -3, -2, -9, -9};
        arr[5] = new int[]{-1, -3, -1, -2, -4, -5};

        for (int i = 0; i < 6; i++) {
            System.out.println();
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j]+"\t");
            }
        }

        int sum = 0 ;
        int maxsum = 0;
        int count = 0;
        for(int i = arr.length-1; i > 1; i--){
            System.out.println();
            for(int j=arr[i].length-1; j > 1; j--){
                sum = 0;
                System.out.print(i+" "+j+" :");
                System.out.print(arr[i][j] +" + "+ arr[i][j-1] + " + "+ arr[i][j-2] + " + "+ arr[i-1][j-1] + " + "+ arr[i-2][j] + " + "+ arr[i-2][j-1] + " + "+ arr[i-2][j-2]);
                sum += arr[i][j] + arr[i][j-1] + arr[i][j-2] + arr[i-1][j-1] + arr[i-2][j] + arr[i-2][j-1] + arr[i-2][j-2];
                System.out.print(" = "+sum+"\n");
                if(count == 0){
                    maxsum = sum;
                }
                if (sum > maxsum)
                    maxsum = sum;
                count++;
            }
        }
        System.out.println(maxsum);
    }
}

