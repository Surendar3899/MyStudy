package LeetCode;

import java.util.Arrays;

public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","zzz","flight"};
        String result = longestCommonPrefix(strs);
        System.out.println("result is "+result);
    }
        
    private static String longestCommonPrefix(String[] strs) {
        String maxString = "";
        String minString = "";
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        /*for(int i=0;i<strs.length-1;i++){
             if(strs[i].length() > strs[i+1].length()){
                   String temp = strs[i+1];
                   strs[i+1] = strs[i];
                   strs[i] = temp;
             }
        }*/

        if(strs[0].length()>0){
            int maxLength = 0;
            int j =0;
            while((strs[0].length() > j) && (strs[0].charAt(j) == strs[strs.length-1].charAt(j))){
              minString += strs[0].charAt(j);                
              if(strs[strs.length-1].contains(minString)){
   
              }else{
                minString = "";
              }

              if(minString.length() > maxString.length()){
                System.out.println("assign fun called  "+minString);
                maxString = minString;
              }
              j++;
            }  
        }


        /*for(int i=0;i<strs.length;i++){
          String a = strs[0];
          for(int j=0;j<a.length();j++){
            if(strs[0].charAt(j) == strs[i+1].charAt(j)){
              minString += strs[0].charAt(j);
            }else{
              continue;
            }
          }
        }*/
        System.out.println(Arrays.toString(strs));
        return maxString;
    }
}
