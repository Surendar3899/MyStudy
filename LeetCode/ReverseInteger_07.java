package LeetCode;

public class ReverseInteger_07 {
   int x = 1534236462;

   public static void main(String[] args) {
    ReverseInteger_07 obj = new ReverseInteger_07();
    int result = reverse(obj.x);
    System.out.println("result is "+result);

   }




   public static int reverse(int x) {
        int value = 0;
        while(x != 0){
           int module = x%10;

            if (value > Integer.MAX_VALUE / 10 || (value == Integer.MAX_VALUE / 10 && module > 7)) {
              return 0; 
            }
            if (value < Integer.MIN_VALUE / 10 || (value == Integer.MIN_VALUE / 10 && module < -8)) {
               return 0; 
            }
           value = value*10+module;
           x = x/10;
        }
        
        return value;
   }
}
