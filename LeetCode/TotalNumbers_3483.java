import java.util.HashSet;
import java.util.Set;

public class TotalNumbers_3483 {

    public static void main(String[] args) {
        int[] digits = {1,2,3,4};
        int result = totalNumbers(digits);
        System.out.println("result is  "+result);
    }


    public static int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        int ans  = 0 ;

        for(int i=0;i<digits.length;i++){
            if(digits[i] == 0){
                continue;
            }
            for(int j=0;j<digits.length;j++){
                if(i == j){
                    continue;
                }

                for(int k=0;k<digits.length;k++){
                   if(i == k || j == k){
                    continue;
                   }

                   if (digits[k] % 2 != 0){
                     continue;
                   } 
                   int num = digits[i]*100+digits[j]*10+digits[k];
                   if(set.add(num)){
                    ans++;
                   }
                }
            }
        }


        return  ans;
    }

}
