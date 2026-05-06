public class RotateString_796 {
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        boolean result = rotateString(s,goal);
        System.out.println("result is "+result);
    }

     public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        s = s+s;
        return s.contains(goal);
    }

}
