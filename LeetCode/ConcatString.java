package LeetCode;

import java.util.Stack;

public class ConcatString {

    public static void main(String[] args) {
        
        String str = "3[a2[bc]]";
        String result = concatString(str);
        System.out.println("result is "+result);
    }

    private static String concatString(String str) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String current = "";
        int num = 0;

        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
               num = (num*10)+str.charAt(i)-'0';
            }
            else if(str.charAt(i) == '['){
                numStack.push(num);
                strStack.push(current);
                num = 0;
                current = "";
            }
            else if(str.charAt(i) == ']'){
                String s = strStack.pop();
                System.out.println(" s is "+s);
                int n = numStack.pop();
                System.out.println("n is "+n);
                System.out.println("current before "+current);
                String appendString = current;
                for(int j=1;j<n;j++){
                  current += appendString;
                }
                System.out.println("current "+current);
                current = s+current;
                System.out.println("current1 "+current);
                
            }else{
                current = current+str.charAt(i);
            }
        }


        return current;
    }

}
