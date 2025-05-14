package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class NoOfSubArraysOddSum_1524 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7};
        int result = numOfSubarrays(arr);
        System.out.println("result is "+result);
    }


    public static int numOfSubarrays(int[] arr) {
        int oddCount = 0;
        int evenCount = 1; // to handle the case when prefix sum itself is odd
        int result = 0;
        int prefixSum = 0;
        
        for (int num : arr) {
            prefixSum += num;
            
            if (prefixSum % 2 == 0) {
                result += oddCount; // Adding subarrays with odd sums
                evenCount++;
            } else {
                result += evenCount; // Adding subarrays with odd sums
                oddCount++;
            }
        }
        
        return result;
    }

    /*public static int numOfSubarrays(int[] arr) {
        List<List<Integer>> subArray = new ArrayList<>();
        int result = 0;
        for(int i =0;i<arr.length;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(arr[i]);
            //subArray.add(temp);
            subArray.add(new ArrayList<>(temp));
            for(int j=i+1;j<arr.length;j++){
               temp.add(arr[j]);
               //subArray.add(temp);
               subArray.add(new ArrayList<>(temp));
            }
            //subArray.add(temp);
        }

        for(int k=0;k<subArray.size();k++){
            int temp = 0;
            for(Integer s : subArray.get(k)){
                  temp += s;
            }

            if(temp%2 != 0){
                result++;
            }
        }

        System.out.println("subArray is "+subArray);
        return result;
    }*/
}
