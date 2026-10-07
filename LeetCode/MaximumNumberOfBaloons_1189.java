import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBaloons_1189 {

    public static void main(String[] args) {
        String text = "nlaebolko";
        int result = maxNumberOfBalloons(text);
        System.out.println("result is "+result);
    }

    public static int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map = new HashMap<>();
        char[] ch = text.toCharArray();
        int ans = 0;

        for(int i=0;i<ch.length;i++){
            if(ch[i] == 'b' || ch[i] == 'a' || ch[i] == 'l' || ch[i] == 'o' || ch[i] == 'n'){
                map.put(ch[i],map.getOrDefault(ch[i], 0)+1);
            }
        }

        int b = map.getOrDefault('b',0);
        int a = map.getOrDefault('a',0);
        int l = map.getOrDefault('l',0)/2;
        int o = map.getOrDefault('o',0)/2;
        int n = map.getOrDefault('n',0);

        ans = Math.min(b,Math.min(a,Math.min(l,Math.min(l,Math.min(o, n)))));

        return ans;

    }

}
