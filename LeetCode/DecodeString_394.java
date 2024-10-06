package LeetCode;

import java.util.Stack;

/*Example 1:

Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Example 2:

Input: s = "3[a2[c]]"
Output: "accaccacc"
Example 3:

Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"*/


public class DecodeString_394 {

    public static void main(String[] args) {
        String s = "3[a2[c]]";
        String decodeString = decodeString(s);
        System.out.println("decodeString "+decodeString);
        
    }

    private static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        int num =0;
        StringBuilder ans = new StringBuilder();

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                System.out.println(c);
                num = (num*10)+(c - '0');
                
            }else if(c == '['){
                System.out.println("[");
                numStack.push(num);
                num = 0;
                stringStack.push(ans);
                ans = new StringBuilder();

            }else if(c == ']'){
                System.out.println("]");
                  
                  String str = ans.toString();
                  int popValue = numStack.pop();
                  System.out.println("popvalue is "+popValue);
                  for(int i=1;i<popValue;i++){
                    ans.append(str);
                  }
                  ans = stringStack.pop().append(ans);
                  System.out.println("ans is "+ans);

            }else{
                System.out.println("else");
                ans.append(c);
            }
        }
        return ans.toString();
    }
    
}
