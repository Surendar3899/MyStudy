package Interview_problems;

import java.util.*;


//Capgemini question
public class LongestSubStringWithoutDup {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        // Use two pointers and a set to track characters in the current window
        int left = 0, right = 0;
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                System.out.println(set.toString());
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input = "bcadaxyz";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Longest substring without repeating characters: " + result);
    }
}
