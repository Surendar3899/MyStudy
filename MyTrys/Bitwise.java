package MyTrys;

public class Bitwise {

    // Leetcode _136 problem

    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        b ^= a;

        System.out.println(b);

        int[] nums = { 1, 1, 2, 2, 3, 3, 4, 5, 4 };
        int ans = 0;

        for (final int num : nums) {
            ans ^= num;
            System.out.println("num " + num + " ans " + ans);
        }

        System.out.println(ans);

    }

}
