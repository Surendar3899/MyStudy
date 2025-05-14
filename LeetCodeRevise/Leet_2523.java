package LeetCodeRevise;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class Leet_2523 {
    public static void main(String[] args) {
        int left = 10;
        int right = 19;
        int[] result = closestPrimes(left,right);
        System.out.println("result is "+Arrays.toString(result));
        
    }
    public static int[] closestPrimes(int left, int right) {
        int[] result = null;
        boolean[] isPrimes = isPrimes(right+1);
        System.out.println("isPrimes "+Arrays.toString(isPrimes));
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isPrimes[i]){
                ans.add(i);
            }
        }

        if(ans.size()<2){
            return new int[]{-1,-1};
        }

        int num1 = -1;
        int num2 = -1;

        int diff = Integer.MAX_VALUE;

        for(int i=0;i<ans.size()-1;i++){
           int diff1 = ans.get(i+1)-ans.get(i);
           if(diff1<diff){
            diff = diff1;
            num1 = ans.get(i);
            num2 = ans.get(i+1);
           }

        }






        System.out.println("ans "+ans.toString());
        return new int[]{num1,num2};
    }
    private static boolean[] isPrimes(int n) {
        boolean[] result = new boolean[n];
        Arrays.fill(result,true);

        result[0] = false;
        result[1] = false;

        for(int i=2;i<n;i++){
            if (result[i]){
                for (int j = i+i ; j < n; j += i){
                    System.out.println("j value is "+j);
                    result[j] = false;
                }  
            }   
        }
        
        return result;
    }

}
