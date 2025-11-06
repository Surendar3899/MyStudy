package LeetCodeRevise;

import java.util.ArrayList;
import java.util.List;

public class Leetcodephonenumbers {
    public static void main(String[] args) {
        String digits = "234";
        List<String> result = letterCombinations(digits);
        System.out.println("result is "+(result));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        if(digits == null){
            System.out.println(" if passed");
            return result;
        }else if(digits.isEmpty()){
            System.out.println("else if passed");
            return result;
        }
        result.add("");
        for(char c:digits.toCharArray()){
            List<String> temp = new ArrayList<>();
            for(String s:result){
                for(char a:arr[c-'0'].toCharArray()){
                    temp.add(s+a);
                    result = temp;
                }
            }
        }

        

      return result;  
    }

}
