public class ReverseVowels_345 {
    public static void main(String[] args) {
        String s = "leetcode";
        String result = reverseVowels(s);
        System.out.println("result is "+result);
    }

    public static String reverseVowels(String s) {
        char[] ch = s.toCharArray();

        int start = 0;
        int end = s.length()-1;
        while(start<end){
            System.out.println("start "+start);
            System.out.println("end "+end);
            while(start < end && !isVowel(ch[start])){
                start++;
            }
            while(start < end && !isVowel(ch[end])){
                end--;
            }

            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }
        return  String.valueOf(ch);
    }

    public static String reverseVowels2(String s) {
    StringBuilder sb = new StringBuilder(s);
    int l = 0;
    int r = s.length() - 1;

    while (l < r) {
      while (l < r && !isVowel(sb.charAt(l)))
        ++l;
      while (l < r && !isVowel(sb.charAt(r)))
        --r;
      sb.setCharAt(l, s.charAt(r));
      sb.setCharAt(r, s.charAt(l));
      ++l;
      --r;
    }

    return sb.toString();
  }

    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
