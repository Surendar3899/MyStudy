package LeetCode;

import java.util.Arrays;

public class ValidateIPAddress_468 {

   static String  validIPv6Chars = "0123456789abcdefABCDEF";

    public static void main(String[] args) {
        String queryIP = "1.0.1.";
        String result = validIPAddress(queryIP);
        System.out.println("result is "+result);
    }
    public static String validIPAddress(String queryIP) {
        

        if(queryIP.chars().filter(n->n=='.').count() == 3){
            String[] a = queryIP.split("\\.",-1);
            System.out.println("if");
           for(int i =0;i<a.length;i++){
            if(!isIPV4(a[i])){
                return "Neither";
            }
           }
           return "IPv4";
        }else if(queryIP.chars().filter(n->n==':').count() == 7){
          String[] b = queryIP.split(":");
          if(b.length == 8){
            for(int i =0;i<b.length;i++){
                if(!isIPV6(b[i])){
                    return "Neither";
                }
           }
           return "IPv6";
          }else{
            return "Neither";
          }


        }
        return "Neither";
    }
    private static boolean isIPV6(String str) {
       if(str.isEmpty() || str.length() > 4){
        return false;
       }

       for(int i=0;i<str.length();i++){
        if(!validIPv6Chars.contains(""+str.charAt(i))){
           return false;
        }
       }

       return true;
    }
    private static boolean isIPV4(String str) {
        System.out.println("isIPV4 "+str);
        if (str.isEmpty() || str.length() > 3){
            return false;
        }
        if(str.length() > 1 && str.startsWith("0")){
            return false;
        }
        int num = -1;
        try{
          num = Integer.parseInt(str);
        }catch(Exception e){
          return false;
        }

        if(num == -1 || num > 255){
          return false;
        }

        return true;
    }

}
