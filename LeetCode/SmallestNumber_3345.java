public class SmallestNumber_3345 {
    public static void main(String[] args) {
        int  n = 10, t = 2;
        int result = smallestNumber(n, t);
        System.out.println("result is "+result);

    }

    public static int smallestNumber(int n, int t) {
        while(true){
            if(productOfDigit(n) %t == 0){
                return n;
            }
            n++;
        }
    }


    public static int productOfDigit(int n){
      int product = 1;
      while(n != 0){
        int rem = n % 10;
        product = product * rem;
        n = n / 10;
      }
      return product;
    }

}
