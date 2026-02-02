package Interview_problems.gavstechnologies;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "knee";
        String word2 = "keene";

        boolean result = compare(word1,word2);
        System.out.println("result is "+result);
    }

    private static boolean compare(String word1, String word2) {

        Map<Character,Integer> map = new HashMap<>();

        for(int i =0;i<word1.length();i++){
            int c = map.getOrDefault(word1.charAt(i),0);
            map.put(word1.charAt(i),c+1);
        }

        System.out.println(map);

        for(int i =0;i<word2.length();i++){
            int c = map.getOrDefault(word2.charAt(i),0);
            c = c-1;
            map.put(word2.charAt(i),c);
        }

        for(Integer i:map.values()){
            if(i != 0){
                return false;
            }
        }

        System.out.println(map);




        
        
       return true;
    }

}
