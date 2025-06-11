package MyTrys;

import java.util.Stack;

public class ConstructEagleSOftware {
    public static void main(String[] args) {
        //String input = "3[a]2[bc]";
        String input = "3[a2[c]]";
        Stack<Integer> stInt = new Stack<>();
        Stack<StringBuilder> stStr = new Stack<>();
        StringBuilder str = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int num = 0;
        for(int i=0;i<input.length();i++){
            if(Character.isDigit(input.charAt(i))){
                num = (num*10)+(input.charAt(i)-'0');
            }

            else if(input.charAt(i) == '['){               
               stInt.push(num);
               stStr.push(str);
               num = 0;
               str = new StringBuilder();
            }

            else if(input.charAt(i) == ']'){
                int num1 = stInt.pop();
                StringBuilder a = stStr.pop();
                StringBuilder temp = new StringBuilder();
                for(int j=0;j<num1;j++){
                    temp = temp.append(str);
                }

                str = a.append(temp);
            }
            else{
                str.append(input.charAt(i));
            }
        
        }

        System.out.println("str is "+str.toString());
    }
}
