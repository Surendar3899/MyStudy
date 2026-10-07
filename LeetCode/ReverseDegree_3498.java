public class ReverseDegree_3498 {

    public static void main(String[] args) {
       String s = "abc";
       int result = reverseDegree(s);
       System.out.println("result is  "+result);
        
    }

    public static int reverseDegree(String s) {
        int ans  = 0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int num = 'z'-ch+1;
            ans = ans + (num*(i+1));
        }


        return ans;
    }

}
