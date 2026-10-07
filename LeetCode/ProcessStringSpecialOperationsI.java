public class ProcessStringSpecialOperationsI {
    public static void main(String[] args) {
        String s = "*%";
        String result = processStr(s);
        System.out.println("result is "+result);
    }

    public static String processStr(String s) {
        char[] ch = s.toCharArray();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<ch.length;i++){
            if(ch[i] == '#'){
                str = str.append(str);
            }else if(ch[i] == '*'){
                if(str.length() > 0){
                    str = str.deleteCharAt(str.length()-1);
                }
            }else if(ch[i] == '%'){
                str = str.reverse();
            }else{
                str = str.append(ch[i]);
            }
        }

        return str.toString();
    }

}
