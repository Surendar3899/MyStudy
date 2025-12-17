package LeetCode;

import java.math.BigInteger;

public class AddBinary_67 {
    public static void main(String[] args) {
        String a = "11", b = "1";
        String result = addBinary(a,b);
        System.out.println("result is "+result);
    }

    public static String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a,2);
        BigInteger num2 = new BigInteger(b,2);


        System.out.println(num1);
        System.out.println(num2);

        BigInteger add = num1.add(num2);

        String binaryString = add.toString(2); 

        return binaryString;
    }

}
