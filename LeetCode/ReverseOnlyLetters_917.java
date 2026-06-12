import java.util.Arrays;

public class ReverseOnlyLetters_917 {
    public static void main(String[] args) {
       //String s = "a-bC-dEf-ghIj";
       String s = "7_28]";
       String result = reverseOnlyLetters(s);
       System.out.println("result is "+result); 
    }

    public static String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length-1;

        while(start < end){
            System.out.println("sta "+start);
            if(Character.isAlphabetic(ch[start]) && Character.isAlphabetic(ch[end])){
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }else if(Character.isAlphabetic(ch[start])){
                end--;
            }else if(Character.isAlphabetic(ch[end])){
                start++;
            }else{
                start++;
                end--;
            }
        }

        return new String(ch);
    }

}
