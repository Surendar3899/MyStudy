public class PowerOfThree_326 {
    public static void main(String[] args) {
        int n = 27;
        boolean result = isPowerOfThree(n);
    }

    public static boolean isPowerOfThree(int n) {
        return n > 0 && Math.pow(3, 19) % n == 0;
    }

}
