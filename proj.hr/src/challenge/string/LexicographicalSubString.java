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
        System.out.println("First and Last Lexi substring of ilovejava - 3 are "+LexicographicalSubString.getFirstAndLast("ilovejava", 3));
        System.out.println("First and Last Lexi substring of ilovejava - 4 are "+LexicographicalSubString.getFirstAndLast("ilovejava", 4));
    }

    public static String getFirstAndLast(String s, int k) {
        String smallest = "";
        String largest = "";

        Set<String> elements = new TreeSet<String>();
        for(int i = 0 ; i < k ; i++){
            for(int j = i ; j < s.length()-k+1 ; j = j+k){
                elements.add(s.substring(j,(j+k) ));
                //System.out.println("Element added was "+s.substring(j, (j+k)));
            }
        }

        //elements.stream().forEach(System.out::println);
        Object strArray[] = elements.toArray();
        smallest = strArray[0].toString();
        largest = strArray[strArray.length-1].toString();


        return smallest + ", " + largest;
    }
}