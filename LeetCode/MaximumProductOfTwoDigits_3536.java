public class MaximumProductOfTwoDigits_3536 {

    public static void main(String[] args) {
        int n = 31;
        int result = maxProduct(n);
        System.out.println("result is "+result);
    }

    public static int maxProduct(int n) {
        int max1 = 0;
        int max2 = 0;

        while(n > 0){
           int digit = n % 10;

           if(digit > max1){
                max2 = max1;
                max1 = digit;
           }else if(digit > max2){
                max2 = digit;
           }


           n = n / 10;
        }
        return max1 * max2;
    }

}
