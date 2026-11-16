public class RemoveOuterParentheses_1021 {

    public static void main(String[] args) {
        String  s = "(()())(())";
        String result = removeOuterParentheses(s);
        System.out.println("result is "+result);
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (depth > 0) {
                    result.append(c);
                }
                depth++;
            } else {
                depth--;

                if (depth > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }

}
