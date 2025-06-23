package LeetCode.arraystring;

public class IntegerToRoman_12 {
    public static void main(String[] args) {
        int num = 4000;
        String result = intToRoman(num);
        System.out.println("result is "+result);
    }
    
    private static String intToRoman(int num) {
        StringBuilder string = new StringBuilder();
        if(num >= 1000){
            int module = num/1000;
            int value = module*1000;
            for(int i=0;i<module;i++){
                string.append("M");
            }
            num = num - value;
        }
        if(num >= 500 && num < 1000){
            int module = num/100;
            if(module == 9){
                string.append("CM");
            }else{
                int value = module*100;
                int value1=value;
                System.out.println("value is "+value);
                value = value-500;
                value = value/100;
                string.append("D");
                for(int i=0;i<value;i++){
                    string.append("C");
                }
            }
            num = num-module*100;
        }else if(num > 99 && num < 500){
            int module = num/100;
            if(module == 4){
                string.append("CD");
            }else{
                int value = module*100;
                for(int i=0;i<module;i++){
                    string.append("C");
                }
            }
            num = num-module*100;

        }


        if(num >= 50 && num < 100){
            int module = num/10;
            if(module == 9){
                string.append("XC");
            }else{
                int value = module*10;
                int value1=value;
                System.out.println("value is "+value);
                value = value-50;
                value = value/10;
                string.append("L");
                for(int i=0;i<value;i++){
                    string.append("X");
                }
            }
            num = num-module*10;
        }else if(num > 9 && num < 50){
            int module = num/10;
            if(module == 4){
                string.append("XL");
            }else{
                int value = module*10;
                for(int i=0;i<module;i++){
                    string.append("X");
                }
            }
            num = num-module*10;

        }


        if(num >= 5 && num < 10){
            int module = num/1;
            if(module == 9){
                string.append("IX");
            }else{
                int value = module*1;
                int value1=value;
                System.out.println("value is "+value);
                value = value-5;
                value = value/1;
                string.append("V");
                for(int i=0;i<value;i++){
                    string.append("I");
                }
            }
            num = num-module*1;
        }else if(num > 0 && num < 5){
            int module = num/1;
            if(module == 4){
                string.append("IV");
            }else{
                int value = module*1;
                for(int i=0;i<module;i++){
                    string.append("I");
                }
            }
            num = num-module*1;

        }
        

        
        return string.toString();
    }
}
