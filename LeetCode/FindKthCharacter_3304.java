package LeetCode;

public class FindKthCharacter_3304 {
    public static void main(String[] args) {
        String word = "a";
        int k =5;
        char result = kthCharacter(k);
        System.out.println("result is "+result);

    }

    public static char kthCharacterOptimize(int k) {
        StringBuilder s = new StringBuilder("a");

        while (s.length() < k) {
            int currentLength = s.length();
            for (int i = 0; i < currentLength; i++) {
                char ch = s.charAt(i);
                char next = (char) ((ch - 'a' + 1) % 26 + 'a');
                s.append(next);
                if (s.length() >= k) {
                    break;
                }
            }
        }

        return s.charAt(k - 1);
    }

    public static char kthCharacter(int k) {
        StringBuilder s = new StringBuilder();
        s.append("a");

        if(s.length() >= k){
            return s.charAt(k);
        }

        return process(k,s);
    }

    private static char process(int k, StringBuilder s) {
        System.out.println("s is "+s);
        if(s.length() >= k){
            return s.charAt(k-1);
        }
        String word = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
           if (ch >= 'a' && ch <= 'z') {
                char next = (char)((ch - 'a' + 1) % 26 + 'a');
                word += next;
            } else {
                word += ch;
            }
        }
        s.append(word);
        return process(k,s);
    }

}
