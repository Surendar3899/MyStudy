package LeetCode;

public class RomanToInteger_13 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int result = romanToInt(s);
        System.out.println("result is "+result);
    }
        
    private static int romanToInt(String s) {

        int num = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'M'){
               num = num+1000;
            }
            if(s.charAt(i) == 'D'){
                num = num+500;
            }

            if(s.charAt(i) == 'C' && i+1 < s.length() && s.charAt(i+1) == 'D'){
                num = num+400;
                i++;
            }
            else if(s.charAt(i) == 'C' && i+1 < s.length() && s.charAt(i+1) == 'M'){
                num = num+900;
                i++;
            }
            else if(s.charAt(i) == 'C'){
                num = num+100;
            }

            if(s.charAt(i) == 'L'){
                num = num+50;
            }

            if(s.charAt(i) == 'X' && i+1 < s.length() && s.charAt(i+1) == 'L'){
                num = num+40;
                i++;
            }
            else if(s.charAt(i) == 'X' && i+1 < s.length() && s.charAt(i+1) == 'C'){
                num = num+90;
                i++;
            }
            else if(s.charAt(i) == 'X'){
                num = num+10;
            }

            if(s.charAt(i) == 'V'){
                num = num+5;
            }


            if(s.charAt(i) == 'I' && i+1 < s.length() && s.charAt(i+1) == 'V'){
                num = num+4;
                i++;
            }
            else if(s.charAt(i) == 'I' && i+1 < s.length() && s.charAt(i+1) == 'X'){
                num = num+9;
                i++;
            }
            else if(s.charAt(i) == 'I'){
                num = num+1;
            }
        }

        return num;
    }
}
