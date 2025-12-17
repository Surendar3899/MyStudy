package LeetCode;

import java.util.*;

public class WordPattern_290 {
    public static void main(String[] args) {
        String pattern = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd", s = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
        boolean result = wordPattern(pattern,s);
        System.out.println("result is "+result);
    }

    public static boolean wordPattern(String pattern, String s) {
        Map<Character,Integer> m1 = new HashMap<>();
        Map<String,Integer> m2 = new HashMap<>();

        String[] sarr = s.split(" ");

        if(pattern.length() != sarr.length){
            return false;
        }

        for(Integer i=0;i<pattern.length();i++){
            if(m1.put(pattern.charAt(i),i) != m2.put(sarr[i],i)){
                return false;
            }
        }
        return true;
    }

}
