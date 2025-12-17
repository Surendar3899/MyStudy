package LeetCode;

public class Pow_50 {
    public static void main(String[] args) {
       double x = 1.00000;
       int n = -2147483648;
       double result  = myPow(x,n);
       System.out.println("result is "+result);
    }

    public static double myPow(double x, long n) {
        if(n == 0){
            return 1;
        }

        if(n<0){
            return 1/myPow(x,-n);
        }

        if(n%2 == 1){
            return x*myPow(x,n-1);
        }

        return myPow((x*x),n/2);
    }

}
