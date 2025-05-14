package MyTrys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestPrimeNumbers {
   public static void main(String[] args) {
      int left = 4;
      int right = 6;
      int[] result = process(left,right);
      System.out.println("result is "+Arrays.toString(result));
   }
    
    private static int[] process(int left, int right) {
      final boolean[] isPrime = sieveEratosthenes(right+1);
      System.out.println(Arrays.toString(isPrime)); 
      int[] result = new int[2]; 
      List<Integer> resultList = new ArrayList<>();

      
      for(int i=left;i<=right;i++){
         if(isPrime[i]){
            resultList.add(i);
         }
      }

      System.out.println("primes.size is "+resultList.size());

      if(resultList.size() < 2){
         result[0] = -1;
         result[1] = -1;
         return result;
      }
      
      int min = Integer.MAX_VALUE;
      for(int i=0;i<resultList.size()-1;i++){
         int diff = resultList.get(i+1) - resultList.get(i);
         System.out.println("diff is "+diff);
         if(min > diff){
             result[0] = resultList.get(i);
             result[1] = resultList.get(i+1);
             min = diff;
         }


      }
      return result;
   }
      
   private static boolean[] sieveEratosthenes(int n) {
      boolean[] allTypes = new boolean[n];
      Arrays.fill(allTypes,true);

      allTypes[0] = false;
      allTypes[1] = false;

      for(int i=2;i*i<n;i++){
         System.out.println("i value is "+i);
         if(allTypes[i]){
            for(int j=i*i; j<n; j+=i){
               allTypes[j] = false;
            }
         }
      }
      return allTypes;
      
   }


}
