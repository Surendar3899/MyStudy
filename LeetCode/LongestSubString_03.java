package LeetCode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubString_03 {
    
    /*Example 1:

    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.
    Example 2:

    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.
    Example 3:

    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/

    public static void main(String[] args) {

        //String s = "abcdabcdeffffpoiuyrewffsbb";
        String s = "edvdef";
        String s1 = "edvd";
        int length = lengthOfLongestSubstring(s);
        System.out.println("length is "+length);
        
    }

    public static int lengthOfLongestSubstring(String s) {
        // int maxLength = 0;
        // Set<Character> chara = new HashSet<>();
        // for(int i=0;i<s.length();i++){
        //     StringBuilder str = new StringBuilder();
        //     if(chara.contains(s.charAt(i))){
        //         System.out.println("if");
        //          if(maxLength < chara.size()){
        //             maxLength = chara.size();
        //          }
        //          chara = new HashSet<>();
        //          chara.add(s.charAt(i));
        //     }else{
        //         chara.add(s.charAt(i));
        //     }
            
        // }

        // if(maxLength < chara.size()){
        //     maxLength = chara.size();
        //  }

        // return maxLength;



        int maxLength = 0;
        Set<Character> charSet = new LinkedHashSet<>();
        int left = 0;
        
        for (int i = 0; i < s.length(); i++) {
            System.out.println("left "+left);
            System.out.println("i  "+i);
            char currentChar = s.charAt(i);
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(left));
                left++;
                
            }
            charSet.add(currentChar);
            System.out.println(charSet.toString());
            maxLength = Math.max(maxLength, i - left + 1);
        }

        

        return maxLength;
    
        
    }
    
}
