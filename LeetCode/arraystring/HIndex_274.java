package LeetCode.arraystring;

import java.util.Arrays;

public class HIndex_274 {
    public static void main(String[] args) {
        int[] citations = {1};
        int result = hIndex(citations);
        System.out.println("result of "+result);
    }
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int j = 0;
        int result = 1;
        for(int i=citations.length-1;i >= 0;i--){  
            System.out.println("citaions "+citations[i] +" "+ j);         
           if(citations[i] <= j){
            return j;
           }
           j++;
           

        }
        result = j;
        
        return result;
    }
}
