package challenge.string;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("madam is a palindrome: "+isPalindrome("madame"));
    }

    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        for(; i < str.length()/2; i++){
            if( str.charAt(i) == str.charAt(j) ){
                j--;
                continue;
            }
            else{
                return false;
            }

        }
        return true;
    }
}
