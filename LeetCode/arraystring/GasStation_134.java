package LeetCode.arraystring;

import java.util.Arrays;

public class GasStation_134 {
    public static void main(String[] args) {
        int[] gas = {3,3,4};
        int[] cost = {3,4,4};
        int result = canCompleteCircuit(gas,cost);
        System.out.println("result is "+result);

    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
      /*int current = 0;
      int startIndex = 0;
      boolean startIndexFind = false;
      int j = 0;
      while(true){
          for(int i=0;i<=gas.length-1;i++){
              System.out.println("iiiiiiiiiii "+ i);
              if(i != gas.length-1){
                  if(cost[i]<=(current+gas[i])){
                    System.out.println("if passed "+cost[i]);
                    current += gas[i];
                    current -= cost[i];
                    if(startIndexFind && startIndex == i){
                      return startIndex;
                    }
                    if(!startIndexFind){
                      startIndex = i;
                      startIndexFind = true;
                    }
                    
                  }
                  
              }else{
                System.out.println("else "+ startIndexFind);
                if(!startIndexFind){
                  if(cost[i]<=(current+gas[i])){
                    current += gas[i];
                    current -= cost[i];
                    if(startIndexFind && startIndex == i){
                      return startIndex;
                    }
                    if(!startIndexFind){
                      startIndex = i;
                      startIndexFind = true;
                    }
                  }
                }  
                  if(!startIndexFind){
                    System.out.println("!startIndexFind");
                      return -1;
                  }
                  
              }

              if(startIndexFind && current == 0 && i < startIndex-1){
                  return -1;
              }
              System.out.println("i value is       "+i);
              System.out.println("current value is "+current);
              
              
          }
          System.out.println("startIndex is "+startIndex);
          j++;
          if(j==20){
              return 0;
          }
          
      }*/


      final int gasSum = Arrays.stream(gas).sum();
      final int costSum = Arrays.stream(cost).sum();
      if (gasSum - costSum < 0){
        return -1;
      }
      int ans = 0;
      int sum = 0;
      for (int i = 0; i < gas.length; ++i) {
        sum += gas[i] - cost[i];
        if (sum < 0) {
          sum = 0;
          ans = i + 1;
        }
      }

      return ans;

    }

}
