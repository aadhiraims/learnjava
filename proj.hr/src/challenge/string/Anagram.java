package challenge.string;

public class Anagram {

    public static void main(String[] args) {
        System.out.println("Listen, Silent are Anagrams ? : "+isAnagram("Listen", "Silent"));
        System.out.println("Elbow, Below are Anagrams ? : "+isAnagram("Elbow", "Below"));
        System.out.println("Stressed, Desserts are Anagrams ? : "+isAnagram("Stressed", "Desserts"));
        System.out.println("apple, banana are Anagrams ? : "+isAnagram("apple", "banana"));
    }

    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() == str2.length()) {
            char[] arr1 = str1.toLowerCase().toCharArray();
            char[] arr2 = str2.toLowerCase().toCharArray();
            int[] count =  new int[26];
            for(int i = 0 ; i < arr1.length; i++){
                count[arr1[i]-97]++;
                count[arr2[i]-97]--;
            }
            for(int c:count){
                if( c!= 0)
                    return false;
            }
            return true;
        }
        else{
            return false;
        }
    }
}
