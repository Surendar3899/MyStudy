package LeetCode;

public class ContainerWater_11 {
    public static void main(String[] args) {
        // int height[] = {1,8,6,2,5,4,8,3,8};
        int height[] = {1,1,1,1,99,99,1,1,1};
        int result = maxArea(height);
        System.out.println("result is "+result);
                
        
        
    }
        
    private static int maxArea(int[] height) {
        int i = 0 ;
        int j = height.length-1;
        int max = 0;
        while(i != j){
            if(height[i] <= height[j]){
               
                if(max<(j-i)*height[i]){
                    max = (j-i)*height[i];
                }
                System.out.println("max is "+max);
                i++;
                
            }else{
                if(max < (j-i)*height[j]){
                   max = (j-i)*height[j];
                }
                System.out.println("max1 is "+max);
                j--;
                
            }
        }
        
        return max;
    }
}
