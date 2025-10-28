import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LongestSubString_03 {
    public static void main(String[] args) {
        String s = "abcabcdeabcdfghbb";
        int maxlength = 0;

        //Stack<Character> st = new Stack<>();
        Queue<Character> st = new LinkedList<>();


        for(int i =0;i<s.length();i++){
            if(st.contains(s.charAt(i))){
               st.remove();
               st.add(s.charAt(i));
            }else{
                st.add(s.charAt(i));
            }

            System.out.println(st);

            if(st.size() > maxlength){
                maxlength = st.size();
            }
        }

        System.out.println("maxlength is "+maxlength);
    }

}
