package challenge.array;

/**
 * HappyNumber is a number which the sum of the square individual digit is equal to 1
 * i.e: 19
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * 19 is a happy number.
 *
 * i.e : 7
 * 7^2 = 49
 * 4^2 + 9^2 = 97
 * 9^2 + 7^2 = 130
 * 1^2 + 3^2 + 0^2 = 1
 */
public class HappyNumber {
    public static void main(String[] args) {
        System.out.println("Is 19 a Happy number? "+isHappyNumber(19));
        System.out.println("Is 35 a Happy number? "+isHappyNumber(35));
        System.out.println("Is 49 a Happy number? "+isHappyNumber(49));
    }
    public static boolean isHappyNumber(int n){
        if( n == 1 || n == 7){
            return true;
        }
        else if (n < 10){
            return false;
        }
        else{
            int sum = n;
            int copy = n;
            while(sum > 9){
                copy = sum;
                sum = 0;
                while(copy > 0) {
                    int d = copy % 10; //1%10= 1
                    sum += d * d;      //1
                    copy = copy / 10;  //1/10 = 0
                }
                if( sum == 1 || sum == 7)
                    return true;
                else if(sum < 10){
                    return false;
                }
            }
            if(sum == 1 || sum == 7){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
