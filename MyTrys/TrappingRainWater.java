package MyTrys;

import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};



        int[] l = new int[arr.length];
        int[] r = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            l[i] = i==0?arr[i]:Math.max(arr[i],l[i-1]);
        }

        for(int i=arr.length-1;i>=0;i--){
            r[i] = i==arr.length-1?arr[i]:Math.max(arr[i],r[i+1]);
        }

        int ans = 0;

        for(int i=0;i<arr.length;i++){
            ans += Math.min(l[i],r[i])-arr[i];
        }

        System.out.println(Arrays.toString(l));
        System.out.println(Arrays.toString(r));

        System.out.println(ans);

    }

}
