public class AddDigits_258 {
    public static void main(String[] args) {
        int num = 38;
        int result = addDigits(num);
        System.out.println("result is "+result);

    }
    public static int addDigits(int num) {
        if(num < 9){
            return num;
        }else if(num%9 == 0){
            return 9;
        }else{
            return num%9;
        }
    }

}
