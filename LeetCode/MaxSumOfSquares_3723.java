public class MaxSumOfSquares_3723 {

    public static void main(String[] args) {
      int num = 2, sum = 3;
      String result  = maxSumOfSquares(num, sum);
      System.out.println("result is  "+result);  
    }

    public static String maxSumOfSquares(int num, int sum) {

        if(sum > num * 9){
           return "";
        }

        StringBuilder result = new StringBuilder();

        while(sum >= 9){
            result.append("9");
            sum = sum - 9;
        }

        if(sum > 0){
            result.append(sum);
        }

        while(result.length() < num){
            result.append("0");
        }

        return result.toString();
    }

}
