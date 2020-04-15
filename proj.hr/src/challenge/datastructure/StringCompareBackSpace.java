package challenge.datastructure;

import java.util.Stack;

/**
 * # means backspace
 * O(N) Time Complexity
 * Using Stack
 */
public class StringCompareBackSpace {
    public static void main(String[] args) {
        StringCompareBackSpace sb = new StringCompareBackSpace();
        System.out.println(" ab#c and ad#c are same? "+ sb.backspaceCompare("ab#c", "ad#c"));
        System.out.println(" ab## and c#d# are same? "+ sb.backspaceCompare("ab##", "c#d#"));
        System.out.println(" a##c and #a#c are same? "+ sb.backspaceCompare("a##c", "#a#c"));
        System.out.println(" a#c  and b    are same? "+ sb.backspaceCompare("a#c", "b"));

    }
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == '#'){
                if(stack1.size() !=0)
                stack1.pop();
            }
            else {
                stack1.push(S.charAt(i));
            }
        }
        //System.out.println(stack1.toString());

        for(int i = 0; i < T.length(); i++){
            if(T.charAt(i) == '#'){
                if(stack2.size() != 0)
                stack2.pop();
            }
            else {
                stack2.push(T.charAt(i));
            }
        }
        //System.out.println(stack2.toString());
        if( stack1.size() != stack2.size()){
            return false;
        }
        if(stack1.toString().equals(stack2.toString()))
            return true;
        else
            return false;
    }
}
