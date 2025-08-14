public class PowerOfTwo_231 {
    public static void main(String[] args) {
        int n = 2;
        boolean result = isPowerOfTwo(n);
        System.out.println("result is "+result);
    }

    public static boolean isPowerOfTwo(int n) {
        return n >= 0 && Integer.bitCount(n) == 1;   
    }

}
