package LeetCode.arraystring;

public class BestTimeBuySellStock_121 {
    public static void main(String[] args) {
        int[] prices = {7,3,5,1,6,4,10};
        int result = maxProfit2(prices);
        System.out.println("result is "+result);

    }

    public static int maxProfit2(int[] prices) {
        int sellOne = 0;
        int holdOne = Integer.MIN_VALUE;

        for (final int price : prices) {
            sellOne = Math.max(sellOne, holdOne + price);
            holdOne = Math.max(holdOne, -price);
            System.out.println("sellOne is "+sellOne);
            System.out.println("holdOne is "+holdOne);
        }

        return sellOne;
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int buy = prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy = prices[i];
            }
            int currentProfit = prices[i]-buy;
            max = Math.max(currentProfit,max);
            
        }
        return max;
    }

   
}
