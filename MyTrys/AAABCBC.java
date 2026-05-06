import java.util.Stack;

public class AAABCBC {
    public static void main(String[] args) {
        //3[a]2[bc]
        //output aaabcbc
        String s = "3[a]2[bc]";
        Stack<Integer> numStack = new Stack<>(); 
        Stack<String> stringStack = new Stack<>();

        String curr = "";
        int num = 0;
        String ans = "";
        
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                num = num*10+(s.charAt(i) - '0');
            }

            if(s.charAt(i) == '['){
                numStack.push(num);
               stringStack.push(curr);
               num = 0;
               curr = "";
            }

            else if(s.charAt(i) == ']'){
               String str = curr;
               int num1 = numStack.pop();
               for(int j=1;j<num1;j++){
                 str = str+curr;
               }
               ans = ans+str;
               System.out.println("anssss "+ans);
            }else{
                curr = curr+s.charAt(i);
            }
        }

        System.out.println("anser is "+ans);
    }

}
