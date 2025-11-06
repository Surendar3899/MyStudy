package MyTrys;
import java.util.ArrayList;
import java.util.List;
public class StringPermutationMyTry {
    static int it = 0;
    public static void main(String[] args){
        String str = "abc";
        List<String> res;
        List<String> result  = permutation(str,"",res = new ArrayList<>());  
        System.out.println("result is "+result);  
    }

    private static List<String> permutation(String input, String output,List<String> result) {
        it++;
        System.out.println("it is "+it);

        if (input.length() == 0){
            System.out.println(output+"  ");  
            result.add(output);     
        } 
        
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            System.out.println(input.substring(0,i));
            System.out.println(input.substring(i+1,input.length()));
            String rem=input.substring(0,i)+input.substring(i+1,input.length());
            permutation(rem,output+ch,result); 

        }
        return result;
    }

   
}
