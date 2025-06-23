package LeetCode.twopointers;

public class IsSubSequence_392 {
    public static void main(String[] args) {
       String s = "b", t = "c";
       boolean result = isSubsequence(s,t);
       System.out.println("result is "+result);
    }

    public static boolean isSubsequence(String s, String t) {
        boolean result = true;
        int i =s.length()-1;
        int j = t.length()-1;
        while(0<=j && 0<=i){
          if(t.charAt(j) == s.charAt(i)){
            i--;
          }
          j--;

        }

        if(i>=0){
            return false;
        }
        return result;
    }
}
