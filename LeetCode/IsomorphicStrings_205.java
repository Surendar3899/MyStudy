package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsomorphicStrings_205 {
    public static void main(String[] args) {
        String s = "eggg", t = "adde";
        boolean result = isIsomorphic(s,t);
        System.out.println("result is "+result);
    }

    public static boolean isIsomorphic(String s, String t) {

        Map<Character, Integer> charToIndex_s = new HashMap<>();
        Map<Character, Integer> charToIndex_t = new HashMap<>();

        for (Integer i = 0; i < s.length(); ++i){
            if (charToIndex_s.put(s.charAt(i), i) != charToIndex_t.put(t.charAt(i), i)){
                return false;
            }
        }

        return true;

        
    }

}
