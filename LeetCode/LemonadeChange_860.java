import java.util.HashMap;
import java.util.Map;

public class LemonadeChange_860 {

    // greedy problem
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};
        boolean result = lemonadeChangeGreedyApproach(bills);
        System.out.println("result is "+result);
    }

    public static boolean lemonadeChangeGreedyApproach(int[] bills) {

          int tenDollars = 0;
          int fiveDollars = 0;

          for(int bill:bills){
            int amount = bill - 5;

            int tenDollarCount = Math.min(tenDollars, amount/10);
            amount = amount - (tenDollarCount*10);
            tenDollars = tenDollars - tenDollarCount;

            int fiveDollarCount = Math.min(fiveDollars, amount/5);
            amount = amount - (fiveDollarCount*5);
            fiveDollars = fiveDollars - fiveDollarCount;

            if(amount > 0){
                return false;
            }

            if(bill == 10){
                tenDollars += 1;
            }else if(bill == 5){
                fiveDollars += 1;
            }

            
          }
          return true;

    }

    public static boolean lemonadeChange(int[] bills) {
        Map<Integer,Integer> countMap = new HashMap<>();

        for(int i=0;i<bills.length;i++){

            if(!checkResult(bills[i]-5,countMap)){
                return false;
            }
            int count = countMap.getOrDefault(bills[i], 0);
            countMap.put(bills[i], count+1);

        }
        return true;
    }

    static boolean checkResult(int value,Map<Integer,Integer> countMap){
        if(value == 0){
            return true;
        }

        while (value >= 10 && countMap.getOrDefault(10,0) > 0) {
            value = value - 10;
            countMap.put(10, countMap.get(10)-1);
        }
        while (value >= 5 && countMap.getOrDefault(5,0) > 0) {
            value = value - 5;
            countMap.put(5, countMap.get(5)-1);
        }
    
      
        return value == 0 ? true:false;
    }

}
