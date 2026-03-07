package LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class MinStack_155 {

    public static void main(String[] args) {
        
    }

}

class MinStack {

    Stack<int[]> stack = null;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(new int[]{val,val});
        }else{
            stack.push(new int[]{val,Math.min(val,stack.peek()[1])});
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek()[0];
    }
    
    public int getMin() {
        return stack.peek()[1];
        
    }
}

