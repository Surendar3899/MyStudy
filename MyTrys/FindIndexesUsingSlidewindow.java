package MyTrys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIndexesUsingSlidewindow {
    public static void main(String[] args) {
        String a = "abcekfglabcefbca";
        String b = "abc";
        List<Integer> result = findIndex(a,b);
        System.out.println("result is "+result);
    }

    private static List<Integer> findIndex1(String a, String b) {
        List<Integer> res = new ArrayList<>();
        String word = "";
        for(int i=0;i<a.length();i++){
            
            if(word.length() < 2){
                System.out.println("if");
                word = word+a.charAt(i);
                System.out.println(word);
            }else{
                System.out.println("else");
                word = word+a.charAt(i);
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String newword = new String(chars);
                System.out.println("newword is "+newword);
                if(b.equals(newword)){
                    res.add(i-2);
                }
                word = word.substring(1);
                

            }

        }
        return res;
    }

    private static List<Integer> findIndex(String s, String p) {
    List<Integer> res = new ArrayList<>();

    if (s.length() < p.length()) return res;

    int[] bFreq = new int[26];
    int[] windowFreq = new int[26];

    for (char c : p.toCharArray()) {
        bFreq[c - 'a']++;
    }

    int windowSize = p.length();

    for (int i = 0; i < s.length(); i++) {
        // add current char
        windowFreq[s.charAt(i) - 'a']++;

        // remove left char when window exceeds size
        if (i >= windowSize) {
            windowFreq[s.charAt(i - windowSize) - 'a']--;
        }

        // compare when window size matches
        if (i >= windowSize - 1 && Arrays.equals(bFreq, windowFreq)) {
            System.out.println(i);
            System.out.println(windowSize);
            res.add(i - windowSize + 1);
        }
    }

    return res;
}


}
