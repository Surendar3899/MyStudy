import java.util.Stack;

public class ScoreOfParentheses_856 {
    public static void main(String[] args) {
        String s = "(()(()))";
        int result  = scoreOfParentheses(s);
        System.out.println("result is  "+result);

        /*

        stack   [0, 0]
        stack   [0, 0, 0]
        stack   [0, 1]
        stack   [0, 1, 0]
        stack   [0, 1, 0, 0]
        stack   [0, 1, 1]
        stack   [0, 3]
        stack   [6]
        result is  6
        
        */



    }


    public static int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(0);
            } else {
                int inner = stack.pop();
                int score = inner == 0 ? 1 : 2 * inner;

                stack.push(stack.pop() + score);
            }

            System.out.println("stack   "+stack);
        }

        return stack.pop();
    }

}
