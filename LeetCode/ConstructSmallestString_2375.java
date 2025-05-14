package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

public class ConstructSmallestString_2375 {
    public static void main(String[] args) {
        String pattern = "DII";
        String result = smallestNumber(pattern);
        System.out.println("result is "+result);
    }
        
    public static String smallestNumber(String pattern) {
        StringBuilder sb = new StringBuilder();
        //Deque<Integer> stack = new ArrayDeque<>();
        Stack<Integer> stack = new Stack<>();
        
        int num = 1;
        
        for (int i = 0; i <= pattern.length(); i++) {
            stack.push(num++);
            System.out.println("stack "+stack.toString());
            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
            }
        }

        return sb.toString();
    }
}
