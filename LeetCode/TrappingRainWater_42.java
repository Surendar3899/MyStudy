package LeetCode;

public class TrappingRainWater_42 {
    public static void main(String[] args) {
       int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
       int result = trap2(height);
       System.out.println("result is "+result);
    }
    public static int trap(int[] height) {
        final int n = height.length;
        int ans = 0;
        int[] l = new int[n]; // l[i] := max(height[0..i])
        int[] r = new int[n]; // r[i] := max(height[i..n))

        for (int i = 0; i < n; i++){
            l[i] = i == 0 ? height[i] : Math.max(height[i], l[i - 1]);
        }

        for (int i = n - 1; i >= 0; i--){
            r[i] = i == n - 1 ? height[i] : Math.max(height[i], r[i + 1]);
        }

        for (int i = 0; i < n; i++){
            ans += Math.min(l[i], r[i]) - height[i];
        }

        return ans;
    }


    public static int trap2(int[] height) {
        int left = 0, right = height.length - 1;
        int water = 0;
        int maxLeft = height[left], maxRight = height[right];

        while (left < right) {
            if (maxLeft > maxRight) {
                right--;
                if (height[right] < maxRight) {
                    water += maxRight - height[right];
                } else {
                    maxRight = height[right];
                }
            } else {
                left++;
                if (height[left] < maxLeft) {
                    water += maxLeft - height[left];
                } else {
                    maxLeft = height[left];
                }
            }
        }

        return water;
    }
}
