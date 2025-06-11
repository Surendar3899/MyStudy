package LeetCode;

public class ReverseWordsString_151 {
    public static void main(String[] args) {
        String s = "the sky is     blue     ";
        String result = reverseWords(s);
        System.out.println("result is \n"+result);
    }

    public static String reverseWords2(String s) {
        s = s.trim();

        String[] words = s.split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) {
              sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s).reverse(); // Reverse the whole string.
        System.out.println("sb is "+sb);
        reverseWords(sb, sb.length());                     // Reverse each word.
        return cleanSpaces(sb, sb.length()); 
    }

    private static void reverseWords(StringBuilder sb, int n) {
      System.out.println("n value "+n);
        int i = 0;
        int j = 0;

        while (i < n) {
            System.out.println("first while");
            while (i < j || i < n && sb.charAt(i) == ' '){ // Skip the spaces.
                System.out.println("second  while "+i+" "+j+" "+n);
                i++;
            }
            while (j < i || j < n && sb.charAt(j) != ' '){ // Skip the spaces.
                System.out.println("third while "+i+" "+j+" "+n);
                j++;
            }    
            reverse(sb, i, j - 1); // Reverse the word.
        }
    }

     // Trim leading, trailing, and middle spaces
  private static String cleanSpaces(StringBuilder sb, int n) {
    System.out.println("cleanspace called");
    System.out.println(sb.toString() );
    System.out.println(n);
    int i = 0;
    int j = 0;

    while (j < n) {
      while (j < n && sb.charAt(j) == ' ') // Skip the spaces.
        j++;
      while (j < n && sb.charAt(j) != ' ') // Keep non spaces
        sb.setCharAt(i++, sb.charAt(j++));
      while (j < n && sb.charAt(j) == ' ') // Skip the spaces.
        j++;
      if (j < n) // Keep only one space.
        sb.setCharAt(i++, ' ');
    }

    return sb.substring(0, i).toString();
  }

  private static void reverse(StringBuilder sb, int l, int r) {
    System.out.println("reverse called "+l +"  "+r);
    System.out.println("str "+sb.toString());
    while (l < r) {
      final char temp = sb.charAt(l);
      sb.setCharAt(l++, sb.charAt(r));
      sb.setCharAt(r--, temp);
    }
  }
}
