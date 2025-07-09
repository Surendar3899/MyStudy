package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class FindOriginalTypedString_3330 {
    public static void main(String[] args) {
        String word = "aaaa";
        int result = possibleStringCount(word);
        System.out.println("result is "+result);
    }

    public static int possibleStringCount(String word) {
        int ans = 1;
        for (int i = 1; i < word.length(); ++i){
            if (word.charAt(i) == word.charAt(i - 1)){
                ans++;
            }    
        }
        return ans;
    }

    public static int possibleStringCountmytry(String word) {
        Map<Character,Integer> ma = new HashMap<>();
        int result = 0;
        char previous = '-';
        for(int i=0;i<=word.length()-1;i++){
            if(word.charAt(i) == previous){
                System.out.println(word.charAt(i));
                ma.put(word.charAt(i),ma.getOrDefault(word.charAt(i),-1)+1);
            }
        }
        System.out.println("aaa");
        for(char i:ma.keySet()){
            result+=ma.get(i);
        }
        System.out.println(ma);
        return result+1;
    }

}
