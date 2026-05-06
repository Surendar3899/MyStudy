import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DividePlayersIntoTeamsOfSameEqual_2491 {

    public static void main(String[] args) {
        int[] skill = {3,2,5,1,3,4};
        // int[] skill = {1,1,2,3};
        long result = dividePlayersMyTry(skill);
        System.out.println("result is "+result);
        
    }

    private static long dividePlayersMyTry(int[] skill) {
        long ans = 0;
        int sum = Arrays.stream(skill).sum();
        int need = sum / (skill.length/2);

        Arrays.sort(skill);

        int start = 0;
        int end = skill.length-1;

        while(start < end){
            if(skill[start] + skill[end] == need){
                ans = ans + (skill[start] * skill[end]);
                start++;
                end--;
            }else{
                return -1;
            }
        }


        return ans;
    }

    public static long dividePlayers(int[] skill) {
        long ans  = 0;
        int sum = Arrays.stream(skill).sum();
        int need = sum/(skill.length/2);

        System.out.println("need is "+need);

        Map<Integer,Integer> map = new HashMap<>();
        for(int a:skill){
            int count = map.getOrDefault(a,0);
            map.put(a,count+1);
        }

        for(int i=0;i<skill.length;i++){
            int a = skill[i];
            if(map.get(a) > 0){
                map.put(a,map.get(a)-1);
                int remaining = need - a;
                if(map.getOrDefault(remaining,0) > 0){
                    ans = ans + (a*remaining);
                    map.put(remaining,map.get(remaining)-1);
                }else{
                    return -1;
                }
            }
        }

        return ans;
    }

}
