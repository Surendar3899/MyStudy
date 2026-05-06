public class WaterBottles_1518 {

    public static void main(String[] args) {
       int numBottles = 9, numExchange = 3;
       int result = numWaterBottles(numBottles, numExchange);
       System.out.println("result is "+result); 
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int ans = 0;
        int fullBottles = numBottles;
        int emptyBottles = 0;

        while(fullBottles > 0){
            ans = ans+fullBottles;

            emptyBottles = emptyBottles+fullBottles;

            fullBottles = emptyBottles / numExchange;

            emptyBottles = emptyBottles%numExchange;
        }
        return ans;
    }

}
