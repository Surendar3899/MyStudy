public class DigitSum_2243 {

    public static void main(String[] args) {
        String s = "11111222223";
        int k = 3;
        String result = digitSum(s, k);
        System.out.println("result is  "+result);
    }

    public static String digitSum(String s, int k) {

        while(s.length() > k){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<s.length();i=i+k){
                int sum = 0;
                for(int j=i;j<Math.min(i+k, s.length());j++){
                    sum = sum + (s.charAt(j) - '0');
                }
                sb.append(sum);
            }
            s = sb.toString();
        }

       return s;
    }

}
