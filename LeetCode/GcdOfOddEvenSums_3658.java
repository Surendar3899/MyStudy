public class GcdOfOddEvenSums_3658 {

    public static void main(String[] args) {
        int n = 4;
        int result = gcdOfOddEvenSums(n);
        System.out.println("result is "+result);
    }

    public static int gcdOfOddEvenSums(int n) {
        int ans = 0 ;
        int oddSum = n * n;
        int evenSum = n * (n+1);
        ans = findGcd(oddSum, evenSum);
        return ans;
    }


    public static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
