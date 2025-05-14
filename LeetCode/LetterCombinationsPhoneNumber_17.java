package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinationsPhoneNumber_17 {
   public static void main(String[] args) {
      String digits = "234";
      List<String> result = letterCombinations(digits);
      System.out.println((result));
   }

   public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        /*if(digits.length() > 0){
            if(digits.length() == 1){
                if(Character.isDigit(digits.charAt(0))){
                    int index = Integer.parseInt(digits);
                    result.add(arr[index]);
                }
            }else if(digits.length() > 1){
                try{
                    int number = Integer.parseInt(digits);
                    for(int i=0;i<digits.length();i++){
                        
                    }


                }catch(Exception e){
                   return new ArrayList<>();
                }
            }
        }*/

        if (digits == null || digits.isEmpty()) {
            return result;
        }

        result.add(""); 

        for (char d : digits.toCharArray()) {
            //System.out.println("1 for "+d);
            List<String> temp = new ArrayList<>();
            for (String s : result){
                //System.out.println("2 for "+s );
              for (char c : arr[d - '0'].toCharArray()){
                //System.out.println("3 for "+c);
                temp.add(s + c);
                result = temp;
                //System.out.println("result is "+result);
              } 
            }    
        }
        return result;
    }
}
