package challenge.datastructure;

import java.util.Stack;

/**
 * Implement stack operations like push pop top_element, min_element
 * push 3, push 2, push 4, push 5, pop
 * 3, 2, 4
 * top : 4
 * min : 2
 */
public class StackOperations {
    public static void main(String[] args) {
        MyStack mystack = new MyStack();
        mystack.push(3);
        mystack.push(2);
        mystack.push(4);
        mystack.push(5);
        mystack.pop();
        System.out.println(mystack.getTop());
        System.out.println(mystack.getMin());
    }
}

class MyStack{
    Stack<Integer> permStack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    MyStack(){
        minStack.push(Integer.MAX_VALUE);
    }
    public void push(int x){
        permStack.push(x);
        if( x < minStack.peek() ) minStack.push(x);
    }
    public void pop(){
        int x = permStack.pop();
        if ( x == minStack.peek() ) minStack.pop();
    }
    public int getTop(){
        return permStack.peek();
    }
    public int getMin(){
        return minStack.peek();
    }
}
