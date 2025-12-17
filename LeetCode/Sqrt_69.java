package LeetCode;

public class Sqrt_69 {
    public static void main(String[] args) {
        int x= 10;
        int result = mySqrt2(x);
        System.out.println("result is "+result);
        
    }

    public static int mySqrt(int x) {
       if (x < 2) return x;

        int left = 1;
        int right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long sq = (long) mid * mid;

            if (sq == x) {
                return mid;
            } else if (sq < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static int mySqrt2(int x) {
        return (int)Math.sqrt(x);
        
    }

}
