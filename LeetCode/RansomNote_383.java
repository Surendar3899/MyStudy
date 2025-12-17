package LeetCode;

import java.util.Arrays;

public class RansomNote_383 {
    public static void main(String[] args) {
        String ransomNote = "aab", magazine = "baa";
        boolean result = canConstruct(ransomNote,magazine);
        System.out.println("result is "+result);
    }

     public static boolean canConstruct(String ransomNote, String magazine) {

        int[] n = new int[26];

        for(char c:magazine.toCharArray()){
            n[c-'a']++;
        }

        for(char c:ransomNote.toCharArray()){
            if(n[c-'a'] == 0){
                return false;
            }
            n[c-'a']--;
        }


        return true;
    }

}
