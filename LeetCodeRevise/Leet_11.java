package LeetCodeRevise;

public class Leet_11 {
     public static void main(String[] args) {
        int[] height = {1,8,9};
        int result = maxArea(height);
        System.out.println("result is "+result);

     }

     public static int maxArea(int[] height) {
        int result=0;

        int i =0;
        int j = height.length-1;
        
        while(i != j){
          int min = Math.min(height[i],height[j]);
          int maxArea = (j-i)*min;
          if(maxArea > result){
            result = maxArea;
          }

          if(height[i]>height[j]){
            j--;
          }else{
            i++;
          }
        }


        return result;
     }
}
