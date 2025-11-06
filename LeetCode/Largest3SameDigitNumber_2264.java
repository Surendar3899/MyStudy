package LeetCode;

public class Largest3SameDigitNumber_2264 {
    public static void main(String[] args) {
        String num = "6777133339";
        String result = largestGoodInteger(num);
        System.out.println("result is "+result);

    }

    public static String largestGoodInteger(String num) {
        String ans = "";
        if(num.contains("999")){
            return "999";
        }else if(num.contains("888")){
            return "888";
        }else if(num.contains("888")){
            return "888";
        }else if(num.contains("777")){
            return "777";
        }else if(num.contains("666")){
            return "666";
        }else if(num.contains("555")){
            return "555";
        }else if(num.contains("444")){
            return "444";
        }else if(num.contains("333")){
            return "333";
        }else if(num.contains("222")){
            return "222";
        }else if(num.contains("111")){
            return "111";
        }else if(num.contains("000")){
            return "000";
        }
        return ans;
    }

}
