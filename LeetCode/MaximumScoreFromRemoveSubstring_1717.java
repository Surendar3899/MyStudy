package LeetCode;

public class MaximumScoreFromRemoveSubstring_1717 {
    public static void main(String[] args) {
        String s = "cdbcbbaaabab";
        int x = 4;
        int y = 5;
        int result = maximumGain2(s, x, y);
        System.out.println("result is "+result);
    }

    public static int maximumGain(String s, int x, int y) {
      int ans =0;
      while(s.contains("ba") || s.contains("ab")){

      }
      return ans;  
    }

    public static int maximumGain2(String s, int x, int y) {
        int ans = 0;

        // Choose which to remove first based on the higher value
        if (x > y) {
            ans += removePattern(s, "ab", x,x,y);
        } else {
            ans += removePattern(s, "ba", y,x,y);
        }

        return ans;
    }

    public static int removePattern(String s, String pattern, int value ,int x, int y) {
        System.out.println("removePattern");
        StringBuilder stack = new StringBuilder();
        int gain = 0;

        char first = pattern.charAt(0);
        char second = pattern.charAt(1);

        for (char c : s.toCharArray()) {
            
            if (stack.length() > 0 && stack.charAt(stack.length() - 1) == first && c == second) {
                stack.deleteCharAt(stack.length() - 1); 
                gain += value;
            } else {
                stack.append(c);
            }
        }

        StringBuilder finalStack = new StringBuilder();
        String remaining = stack.toString();

        if (pattern.equals("ab")) {
            pattern = "ba";
            value = y;
        } else {
            pattern = "ab";
            value = x;
        }

        first = pattern.charAt(0);
        second = pattern.charAt(1);

        for (char c : remaining.toCharArray()) {
            if (finalStack.length() > 0 && finalStack.charAt(finalStack.length() - 1) == first && c == second) {
                finalStack.deleteCharAt(finalStack.length() - 1);
                gain += value;
            } else {
                finalStack.append(c);
            }
        }

        return gain;
    }


}
