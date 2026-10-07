public class ProcessStringSpecialOperationsII_3614 {
    public static void main(String[] args) {
        String s = "bz%a*";
        long k = 2;
        char result = processStr(s, k);
        System.out.println("result is  "+result);
    }


    public static char processStr(String s, long k) {
        int n = s.length();

        long[] len = new long[n + 1];
        len[0] = 0;

        // Calculate resulting length after each operation
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                len[i + 1] = len[i] + 1;
            } else if (c == '#') {
                len[i + 1] = Math.min(len[i] * 2, Long.MAX_VALUE);
            } else if (c == '*') {
                len[i + 1] = Math.max(0, len[i] - 1);
            } else if (c == '%') {
                len[i + 1] = len[i];
            }
        }

        if (k >= len[n]) {
            return '.';
        }

        // Work backwards
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            long prevLen = len[i];
            long currLen = len[i + 1];

            if (c >= 'a' && c <= 'z') {

                if (k == currLen - 1) {
                    return c;
                }

            } else if (c == '#') {

                if (k >= prevLen) {
                    k -= prevLen;
                }

            } else if (c == '*') {

                // If deleted character was after k, no change

            } else if (c == '%') {

                k = currLen - 1 - k;   // index change EX(0 -> 3, 3->0)
            }
        }

        return '.';

        
    }

}
