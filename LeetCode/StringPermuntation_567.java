package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class StringPermuntation_567 {

    public static void main(String[] args) {
        String s1 = "abc", s2 = "bdbccba";
        // boolean result = checkInclusion(s1, s2);
        boolean result = mapusingSolution(s1, s2);
        System.out.println("result is "+result);
    }

    public static boolean mapusingSolution(String s1, String s2) {
        Map<Character,Integer> havemap = new HashMap<Character,Integer>();
        Map<Character,Integer> needMap = new HashMap<Character,Integer>();
        for(char c:s1.toCharArray()){
            int count = havemap.getOrDefault(c,0);
            havemap.put(c,count+1);
        }

        int start =0;
        int end = 0;
        while(end<s2.length()){
          if(havemap.containsKey(s2.charAt(end))){
            int count = needMap.getOrDefault(s2.charAt(end),0);
            count = count+1;
            if(havemap.get(s2.charAt(end)) <= count){
               needMap = new HashMap<>();
            }
            needMap.put(s2.charAt(end),count);
          }else{
            start = end;
            needMap = new HashMap<>();
          }

          if(start-end+1 == s1.length()){
            
          }

          end++;
        }
        System.out.println(havemap);

        return true;
    }

    public static boolean checkInclusion(String s1, String s2) {
        boolean result = permunation(s1,s2,"");
        return result;
    }

    private static boolean permunation(String input, String s2, String output) {

        if(input.length() == 0){
            if(s2.contains(output)){
                System.out.println("output "+output);
                return true;
            }
        }

        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            String rem = input.substring(0, i)+input.substring(i+1, input.length());
            boolean res = permunation(rem, s2, output+ch);
            if(res){
                return true;
            }
        }
        return false;
    }

}
