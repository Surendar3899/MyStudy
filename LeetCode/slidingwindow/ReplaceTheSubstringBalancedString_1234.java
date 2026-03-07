import java.util.Arrays;

public class ReplaceTheSubstringBalancedString_1234 {

    public static void main(String[] args) {
        String s = "QQQWQQQQQWER";
        int result = balancedString(s);
        System.out.println("result is "+result);
    }

    public static int balancedString(String s) {
        int [] count = new int[26];
        int target = s.length()/4;
        int n = s.length();
        for(char c:s.toCharArray()){
            System.out.println(c);
            count[c-'A']++;
        }

        if(count['Q'-'A'] == target &&count['W'-'A'] == target && count['E'-'A'] == target && count['R'-'A'] == target){
            return 0;
        }
         
        int left = 0;
        int minlength = n;
        for(int right =0;right<n;right++){
            count[s.charAt(right)-'A']--;
            while(right < n && count['Q'-'A'] <= target &&count['W'-'A'] <= target && count['E'-'A'] <= target && count['R'-'A'] <= target){
                minlength = Math.min(minlength,right-left+1);
                count[s.charAt(left)-'A']++;
                left++; 
            }
        }





        return minlength; 
    }

}
