package LeetCode;
import java.util.*;
import java.util.function.BinaryOperator;

public class EvaluateReversePolishNotation_150 {

    public static void main(String[] args) {
       String[] tokens = {"2","1","+","3","*"};
       int result = evalRPN(tokens);
       System.out.println("result is "+result);
    }

    public static int evalRPN(String[] tokens) {
        int ans = 0;
        Map<String,BinaryOperator<Long>> ma = new HashMap<>();
        ma.put("+",(a,b)->a+b);
        ma.put("-",(a,b)->a-b);
        ma.put("*",(a,b)->a*b);
        ma.put("/",(a,b)->a/b);
        Stack<Long> stack = new Stack<>();
        for(String s:tokens){
            if(ma.containsKey(s)){
              long b = stack.pop();
              long a = stack.pop();
              stack.push(ma.get(s).apply(a,b));
            }else{
              stack.push(Long.parseLong(s));
            }
        }

        return stack.pop().intValue();
    }

}
