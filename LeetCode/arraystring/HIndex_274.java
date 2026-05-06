package LeetCode.arraystring;

import java.util.Arrays;

public class HIndex_274 {
    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        int result = hIndexWithLinearTime(citations);
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

    public static int hIndexWithLinearTime(int[] citations) {
      int[] count = new int[citations.length+1];
      for(int i=0;i<citations.length;i++){
        if(citations[i] >= citations.length){
          count[citations.length] += 1;
        }else{
            count[citations[i]] += 1;
        }
      }

      System.out.println(Arrays.toString(count));

      int papersWithAtleastHcitations = 0;
      for(int h=citations.length;h>=0;h--){
        papersWithAtleastHcitations += count[h];
        if(papersWithAtleastHcitations >= h){
            return h;
        }
      }
      return 0;
    }
}
