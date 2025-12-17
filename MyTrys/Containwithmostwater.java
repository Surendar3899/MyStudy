package MyTrys;

public class Containwithmostwater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);
        System.out.println("result is "+result);
    }

    public static int maxArea(int[] height) {
       int ans  = 0;
       int s = 0;
       int e = height.length-1;

       while(s<e){
          int min = Math.min(height[s],height[e]);
          int a = (e-s)*min;
          if(ans < a){
            ans = a;
          }
          if(height[s] < height[e]){
            s++;
          }else{
            e--;
          }
          

       }
       return ans;
    }

}
