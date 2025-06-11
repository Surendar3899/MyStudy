package LeetCode;

public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        String s = "Hello World";
        int result = lengthOfLastWord(s);
    }

    public static int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        return strArr[strArr.length-1].length();
        
    }
}
