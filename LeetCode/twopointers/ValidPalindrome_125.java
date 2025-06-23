package LeetCode.twopointers;

public class ValidPalindrome_125 {
     public static void main(String[] args) {
        //String s = "A man, a plan, a canal: Panamaa";
        String s = "0P";
        boolean result = isPalindrome(s);
        System.out.println("result is "+result);

     }

    public static boolean isPalindrome(String s) {
        boolean result = true;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<s.length();i++){
          if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))){
            str.append(s.charAt(i));
          }
        }
        

        System.out.println(str.toString().toLowerCase());
        String t = str.toString().toLowerCase();
        int left = 0;
        int right = t.length()-1;
        while(left<right){
            if(t.charAt(left) == t.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }

        return result;
    }
}
