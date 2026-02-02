package LeetCode;

public class HappyNumber_202 {
    public static void main(String[] args) {

        double a = Math.pow(9,2);
        System.out.println("a "+a);
        int n = 19;
        boolean result = isHappy(n);
        System.out.println("result is "+result);
    }

    public static boolean isHappy(int n) {
        int slow = squaredSum(n);
        int fast = squaredSum(slow);

        while (slow != fast) {
            slow = squaredSum(slow);
            fast = squaredSum(squaredSum(fast));
        }

        return slow == 1;
    }

    private static int squaredSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n = n/10;
        }
        return sum;
    }

}
