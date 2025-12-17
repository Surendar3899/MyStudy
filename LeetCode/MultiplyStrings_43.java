package LeetCode;

import java.util.Arrays;

public class MultiplyStrings_43 {
    public static void main(String[] args) {
        String num1 = "0", num2 = "0";
        System.out.println(7/10);
        String result = multiply(num1,num2);
        System.out.println("result is "+result);
        
    }

    public static String multiply(String num1, String num2) {

        
        if(num1 == "0" || num2 == "0"){
            return "0";
        }
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int a = num1.length();
        int b = num2.length();
        int[] arr = new int[a+b];

        for(int i=a-1;i>=0;i--){
            for(int j=b-1;j>=0;j--){
               int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
               int sum = mul+arr[i+j+1];

               arr[i+j]   = arr[i+j]+sum/10;
               arr[i+j+1] = sum%10; 
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<arr.length;i++){
           if((sb.length() == 0) && arr[i] == 0){
            continue;
           }
           sb.append(arr[i]); 
        }


        return sb.toString();
       
    }

}
