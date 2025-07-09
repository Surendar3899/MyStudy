package LeetCodeRevise;

import java.util.Arrays;

public class Hindex {

    public static void main(String[] args) {
        int[] citations = {1,3,2};

       Arrays.sort(citations);
        int result =0;

        int j =0;

        for(int i=citations.length-1;i>=0;i--){
            if(j>=citations[i]){
               System.out.println("if" +" "+j);
               result = j;
               break;
            }

            j++;
          

        }

        System.out.println(result);
    }

}
