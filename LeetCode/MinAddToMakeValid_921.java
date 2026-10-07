public class MinAddToMakeValid_921 {

    public static void main(String[] args) {
       String s = "())";
       int result = minAddToMakeValid(s);
       System.out.println("result is  "+result); 
    }

    public static int minAddToMakeValid(String s) {
        int open = 0;
        int close = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == '('){
               open++;
            }else{
                if(open > 0){
                    open--;
                }else{
                    close++;
                }
            }
        }
        return open+close;
    }

}
