import java.util.Arrays;

public class MaximizeHappinessOfSelectedChildren_3075 {
    public static void main(String[] args) {
        int[] happiness = {12,1,42};
        int k = 3;
        long result = maximumHappinessSum(happiness, k);
        System.out.println("result is "+result);
    }

    public static long maximumHappinessSum(int[] happiness, int k) {
        long ans = 0;
        Arrays.sort(happiness);
        int turn = 0;

        int e = happiness.length-1;

        while(turn < k && e >= 0){
           int value = happiness[e] - turn;
           if(value < 0){
            break;
           }
           ans = ans + value;
           turn++;
           e--;
        }
        return ans;
    }

}
