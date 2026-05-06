import java.util.Arrays;

public class CoinChange_322 {
    public static void main(String[] args) {
        int[] coins = {2};
        int amount = 3;
        int result = coinChange(coins,amount);
        System.out.println("result is "+result);
    }

    public static int coinChange(int[] coins,int amount){
      int[] arr = new int[amount+1];
      for(int i=1;i<=amount;i++){
         int min = Integer.MAX_VALUE;
         for(int j=0;j<coins.length;j++){
            int n = i - coins[j];
            if(n >= 0 && min>arr[n]+1 && arr[n] != Integer.MAX_VALUE){
                min = arr[n]+1;
            }

         }

         arr[i] = min;
      }

      return arr[amount] == Integer.MAX_VALUE ? -1:arr[amount];
    }

}
