package LeetCodeRevise;

import java.util.Stack;

public class Leet_2375 {
    public static void main(String[] args) {
        String pattern = "IIIDIDDD";
        String result = smallestNumber(pattern);
        System.out.println("result is "+result);

    }

    public static String smallestNumber(String pattern) {
       StringBuilder result = new StringBuilder();
       Stack<Integer> stack = new Stack<>();
       int num =1 ;
       for(int i=0;i<=pattern.length();i++){
        stack.push(num);
        num++;
        if( i == pattern.length() || pattern.charAt(i) == 'I'){
           while(!stack.isEmpty()){
            result.append(stack.pop());
           }
        }
       }
       return result.toString();
    }
}
