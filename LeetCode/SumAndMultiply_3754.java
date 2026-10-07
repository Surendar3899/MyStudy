public class SumAndMultiply_3754 {

    public static void main(String[] args) {
        int n = 0;
        long result = sumAndMultiply(n);
        System.out.println("result is "+result);
    }

    public static long sumAndMultiply(int n) {
        long ans = 0l;
        StringBuilder str = new StringBuilder();
        int sum = 0;
        if(n <= 0){
            return 0l;
        }
        while(n > 0){
            int rem = n % 10;
            if(rem > 0){
                sum = sum + rem;
                str.append(rem);
            }
            n = n/10;

        }

        System.out.println("sum is "+sum);
        System.out.println("str is "+str.reverse());

        ans = Long.parseLong(str.toString()) * (long)sum;

        return ans;
    }

}
