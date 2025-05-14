package MyTrys;

public class StringToINtegerMyTry {
    public static void main(String[] args) {
        String s = "465489485";
        int result = myAtoi(s);
        System.out.println("result is "+result);
    }
        
    private static int myAtoi(String s) {
        System.out.println(s);
        int i =0;
        s =s.trim();
        System.out.println(s);

        if(s.length() == 0){
            return 0;
        }

        boolean isNegative = false;
        if(s.charAt(i) == '+'){
          i++;
        }else if(s.charAt(i) == '-'){
            isNegative = true;
            i++;
        }
        long number = 0l;
        for(int j=i;j<s.length();j++){
            if(Character.isDigit(s.charAt(j))){
               number = number * 10+(s.charAt(j)-'0');
            }else{
                break;
            }
            if(number > Integer.MAX_VALUE){
                return isNegative?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
        }

        if(isNegative){
            number = -number;
        }

        System.out.println("number is "+number);
        if(number > Integer.MAX_VALUE){
            System.err.println("iff");
            return Integer.MAX_VALUE;
        }else if(number<Integer.MIN_VALUE){
            System.out.println("else ifff");
            return Integer.MIN_VALUE;
        }
        return (int) number;
    }
}
