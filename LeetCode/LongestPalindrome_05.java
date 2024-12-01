package LeetCode;

public class LongestPalindrome_05 {
    public static void main(String[] args) {
        String s = "babad";
        //String s = "acdxbzbx";
        String longPalindrome = longestPalindrome(s);
        System.out.println(longPalindrome);
                 
    }
        
    private static String longestPalindrome(String s) {
        if (s == null || s.length() < 1){
            return "";
        }

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            System.out.println("character is                 "+s.charAt(i));
            int len1 = expandAroundCenter(s, i, i); 
            int len2 = expandAroundCenter(s, i, i + 1); 
            
            System.out.println("len1                         "+len1);
            System.out.println("len 2                        "+len2);
            int len = Math.max(len1, len2);

            if (len > end+1 - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
            System.out.println("start "+start);
            System.out.println("end "+end);
        }
        // System.out.println("start "+start);
        // System.out.println("end "+end);
        return s.substring(start, end + 1);
    }


    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        System.out.println("left " +left);
        System.out.println("right " +right);
        return right - left - 1;
    }
}
