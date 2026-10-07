import java.util.Arrays;

public class MaximumIceCreamBars_1833 {

    public static void main(String[] args) {
        int[] costs = {1,3,2,4,1};
        int coins = 7;
        int result = maxIceCream(costs, coins);
        System.out.println("result is "+result);
    }


    /*public static int maxIceCream(int[] costs, int coins) {
        int ans = 0;
        Arrays.sort(costs);
        if(costs[0] > coins){
            return 0;
        }
        int i =0;
        while(coins > 0 && i<costs.length){
            coins = coins - costs[i];
            if(coins>=0){
                ans++;
            }else{
                break;
            }
            i++;
        }


        return ans;
    }*/


      //counting sort method  
     public static int maxIceCream(int[] costs, int coins) {
        

        int max =0;
        for(int cost:costs){
            max = Math.max(cost,max);
        }

        int[] freq = new int[max+1];

        for(int cost:costs){
            freq[cost]++;
        }

        int ans = 0;

        for(int i=0;i<=max;i++){
            while(freq[i] > 0 && coins >= i){
                coins = coins - i;
                ans++;
                freq[i]--;
            }
        }


        return ans;
    }
}
