import java.util.Arrays;
import java.util.List;

public class WordBreak_139 {

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet","code");
        boolean result = wordBreak(s, wordDict);
        System.out.println("result is "+result);
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] result = new boolean[n+1];

        result[0] = true;
        for(int i=1;i<=n;i++){
           for(int j=0;j<i;j++){
             if(result[j] && wordDict.contains(s.substring(j,i))){
                result[i] = true;
                break;
             }
           }
        }

        return result[n];
    }

}
