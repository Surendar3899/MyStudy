package LeetCode;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        boolean result = isAnagram(s,t);
        System.out.println("result is "+result);
    }

    public static boolean isAnagram(String s, String t) {
        int[] i = new int[26];

        if(s.length() != t.length()){
            return false;
        }

        for(char c:s.toCharArray()){
            i[c-'a']++;
        }

        for(char c:t.toCharArray()){
            if(i[c-'a'] == 0){
                return false;
            }
            i[c-'a']--;
        }
        return true;
    }

}
