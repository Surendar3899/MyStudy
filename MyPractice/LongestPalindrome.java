package MyPractice;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "aaaaaa";
        String longpal = longestPalindrome(s);
        System.out.println("longest palindrome is "+longpal);
    }
        
    private static String longestPalindrome(String s) {
        
        int start = 0;
        int end = 0;
        for(int i=0;i<s.length();i++){
            int len1 = concad(s,i,i);
            int len2 = concad(s,i,i+1);
            int len = Math.max(len1,len2);

            if(len > end-start){
                start = i-(len-1)/2;
                end = i+len/2;
            }

        }
        
        return s.substring(start,end+1);
    }

    private static int concad(String s, int left, int right) {
        
        while(left >= 0 && right <s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }

        return right-left-1;
    }
}
