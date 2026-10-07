public class MaxDepth_1614 {

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int result = maxDepth(s);
        System.out.println("result is "+result);
    }

    public static int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            } 
            else if (ch == ')') {
                depth--;
            }
        }

        return maxDepth;
    }

}
