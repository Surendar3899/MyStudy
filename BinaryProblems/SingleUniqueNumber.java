public class SingleUniqueNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,2,4,3,7,4,7,7};
        int result = 0;
        for(int a:arr){
            result = result^a;
            System.out.println(result);
        }
        System.out.println("result is "+result);
    }

}
