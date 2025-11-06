package LeetCode;

import java.util.Stack;

public class ValidParentheses_20 {
    public static void main(String[] args) {
        String s = "]";
        boolean result = isValid(s);
        System.out.println("Result "+result);

        
    }
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()){
          if(c == '{' || c == '[' || c == '('){
            st.push(c);
          }else{
            if (st.isEmpty()) {  // ✅ safeguard
                return false;
            }
            if(c == ')'){
                char a = st.pop();
                if(a != '('){
                    return false;
                }
            }else if(c == '}'){
                char a = st.pop();
                if(a != '{'){
                    return false;
                }
            }else if(c == ']'){
                char a = st.pop();
                if(a != '['){
                    return false;
                }
            }
          }
        }

        if(st.size() > 0){
            return false;
        }
        return true;
    }

}
