package challenge.datastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 */
public class AnagramsList {
    public static void main(String[] args) {
        AnagramsList al = new AnagramsList();
        /*List<List<String>> finalList = al.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        for(List<String> list: finalList){
            for(String str: list){
                System.out.print(str+"\t");
            }
            System.out.println();
        }*/

        List<List<String>> finalList = al.groupAnagrams(new String[]{"", "b", ""});
        for(List<String> list: finalList){
            for(String str: list){
                System.out.print(str+"\t");
            }
            System.out.println();
        }
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> finalList = new ArrayList<List<String>>();
        for(int i = 0 ; i < strs.length ; i++){
            List<String> tempList = new ArrayList<String>();
            if(strs[i].equals("0")) continue;
            tempList.add(strs[i]);
            for(int j = i+1 ; j < strs.length ; j++){
                if(strs[j].equals("0")) continue;
                if(isAnagram(strs[i], strs[j])){
                    tempList.add(strs[j]);
                    strs[j] = "0";
                }
            }
            strs[i] = "0";
            finalList.add(tempList);
        }
        return finalList;
    }

    public boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length())
            return false;
        int[] count =  new int[26];
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        for(int i = 0 ; i < a1.length; i++){
            count[a1[i]-97]++;
            count[a2[i]-97]--;
        }
        for(int c:count){
            if( c!= 0)
                return false;
        }
        System.out.println("\t"+s1 +" and "+ s2 +" are anagrams");
        return true;
    }

}
