package LeetCode;

public class CountandSay_38 {
    public static void main(String[] args) {
        int n = 5;
        String result = countAndSay(n);
        System.out.println("result is "+result);
        
    }

    public static String countAndSay(int n) {
        StringBuilder s = new StringBuilder("1");

        for(int i=1;i<n;i++){
            int count = 1;
            StringBuilder temp = new StringBuilder();
            for(int j=1;j<s.length();j++){
                
                if(s.charAt(j) == s.charAt(j-1)){
                    count++;
                }else{
                    temp.append(count).append(s.charAt(j-1));
                    count = 1;
                }
            }
            temp.append(count).append(s.charAt(s.length()-1));
            s=temp;
        }

        


        return s.toString();
    }

}
