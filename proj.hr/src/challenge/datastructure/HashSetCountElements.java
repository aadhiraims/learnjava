package challenge.datastructure;

import java.util.HashSet;
import java.util.Iterator;

/**
 * in a given array, count each elements' presence
 * if x is the element, do count++ if x+1 is available in the array
 * [ 1, 2, 1 ]
 * x=1 => count++ as 2 (x+1) is there
 * x=2 => 3(x+1) is not there
 * x=1 => count++ as 2(x+1) is there
 */
public class HashSetCountElements {
    public static void main(String[] args) {
        HashSetCountElements hc = new HashSetCountElements();
        System.out.println("[1,2,1] :"+hc.countElements(new int[]{1,2,1})); //2
        System.out.println("[1,2,1,3] :"+hc.countElements(new int[]{1,2,1,3})); //3
    }
    public int countElements(int[] arr) {
        HashSet hs = new HashSet<>();
        for(int i = 0 ; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        //System.out.println(hs);
        Iterator itr = hs.iterator();
        int count = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(hs.contains(arr[i]+1)) count++;
        }
        return count;
    }
}
