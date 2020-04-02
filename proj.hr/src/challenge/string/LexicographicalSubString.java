package challenge.string;

import java.util.Set;
import java.util.TreeSet;

public class LexicographicalSubString {

    /**
     *
     * Give a String str, find the substring of length of k
     * sort it in lexicographical order
     * Should be able to return the requested substring in the array.
     * Print first element in the sorted lexi array
     *
     * Input:
     * Ex:- str = ilovejava
     * k = 3
     *
     * possible lexi strings = { ilo, vej, ava, lov, eja, ove, jav } ilo-vej-ava  lov-eja  ove-jav
     * sorted lexi array     = { ava, eja, ilo, jav, ove, lov, vej }
     *
     *
     */

    public static void main(String[] args) {
        LexicographicalSubString.getSmallestAndLargest("welcometojava", 3);
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        Set<String> elements = new TreeSet<String>();
        for(int i = 0 ; i < k ; i++){
            for(int j = i ; j < s.length() && (j+3) <= s.length(); j = j+3){
                elements.add(s.substring(j,(j+3) ));
                //System.out.println("Element added was "+s.substring(j, (j+3)));
            }
        }

        //elements.stream().forEach(System.out::println);
        Object strArray[] = elements.toArray();
        smallest = strArray[0].toString();
        largest = strArray[strArray.length-1].toString();

        return smallest + "\n" + largest;
    }
}