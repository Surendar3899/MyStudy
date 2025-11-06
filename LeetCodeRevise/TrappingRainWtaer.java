package LeetCodeRevise;

import java.util.Arrays;

public class TrappingRainWtaer {
    public static void main(String[] args) {
        System.out.println("hello");
        //int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] height = {4,2,0,3,2,5,0,1,2};
        int ans= 0;

        
        int[] l = new int[height.length];
        int[] r = new int[height.length];

        for(int i=0;i<height.length;i++){
            l[i] = (i==0)?height[0]:Math.max(height[i],l[i-1]);
        }

        for(int i=height.length-1;i>=0;i--){
            r[i] = (i==height.length-1)?height[i]:Math.max(height[i],r[i+1]);
        }

        for (int i = 0; i < height.length; i++){
            ans += Math.min(l[i], r[i]) - height[i];
        }

        System.out.println(Arrays.toString(l));
        System.out.println(Arrays.toString(r));
        System.out.println(ans);

    }
}
