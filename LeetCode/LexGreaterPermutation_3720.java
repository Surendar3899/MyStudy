public class LexGreaterPermutation_3720 {

    public static void main(String[] args) {
        String s = "abc", target = "bba";
        String result = lexGreaterPermutation(s, target);
        System.out.println("result is "+result);
    }


    public static String lexGreaterPermutation(String s, String target) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < target.length(); i++) {

            int idx = target.charAt(i) - 'a';

            // Try to keep target[i] equal
            if (count[idx] > 0) {

                prefix.append(target.charAt(i));
                count[idx]--;

            } else {

                // Cannot match target[i].
                // Go backward and find a position to increase.
                return build(prefix, target, i - 1, count);
            }
        }

        // target itself was possible.
        // Need strictly greater permutation.
        return build(prefix, target, target.length() - 1, count);
    }

    private static String build(StringBuilder prefix,String target,int pos,int[] count) {

        while (pos >= 0) {

            // Restore characters from the prefix after pos
            for (int i = prefix.length() - 1; i > pos; i--) {
                count[prefix.charAt(i) - 'a']++;
            }

            char targetChar = prefix.charAt(pos);
            int targetIndex = targetChar - 'a';

            // Restore target[pos] also
            count[targetIndex]++;

            // Find smallest character greater than target[pos]
            for (int c = targetIndex + 1; c < 26; c++) {

                if (count[c] > 0) {

                    StringBuilder ans = new StringBuilder();

                    // Prefix before pos
                    ans.append(prefix.substring(0, pos));

                    // First character that makes it greater
                    ans.append((char) ('a' + c));

                    count[c]--;

                    // Remaining characters smallest first
                    for (int j = 0; j < 26; j++) {
                        while (count[j] > 0) {
                            ans.append((char) ('a' + j));
                            count[j]--;
                        }
                    }

                    return ans.toString();
                }
            }

            pos--;
        }

        return "";
    }

}
