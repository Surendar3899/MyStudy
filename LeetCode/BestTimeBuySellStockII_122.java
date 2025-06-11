package LeetCode;

public class BestTimeBuySellStockII_122 {
     public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        int result = maxProfit(prices);
        System.out.println("result is "+result);
     }

     public static int maxProfit(int[] prices) {
        int max = 0;
        int buy = prices[0];
        for(int i = 1;i<prices.length;i++){
            max = Integer.max(max,max+prices[i]-buy);
            System.out.println("max is "+max);
            buy = prices[i];
        }
        return max;
    }
}
