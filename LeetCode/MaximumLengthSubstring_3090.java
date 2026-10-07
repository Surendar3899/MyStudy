import java.util.HashMap;
import java.util.Map;

public class MaximumLengthSubstring_3090 {

    public static void main(String[] args) {
        String  s = "bcbbbcba";
        int result = maximumLengthSubstring(s);
        System.out.println("result is "+result);
    }

    public static int maximumLengthSubstring(String s) {
        int maxLength = 0;
        Map<Character,Integer> map = new HashMap<>();
        int left = 0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            while(map.get(s.charAt(i)) >= 3){
                
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0)-1);
                left++;
            }
            maxLength = Math.max(maxLength, i-left+1);

        }


        return maxLength;
    }

}
