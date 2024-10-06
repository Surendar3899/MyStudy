package MyTryTaxiBooking;

public class Tricky2 {
    public static void main(String[] args) {
        String s = "PROGRAM";
        
        String s2 = s.substring(0,3);
        String s3 = s.substring(3);

        s = s3+s2;

        for(int i =1;i<=s.length();i++){
            int startPoint = s.length()-i;
            for(int j=0;j<s.length();j++){
                 if(j>=startPoint){
                    System.out.print(s.charAt(j));
                 }else{
                    System.out.print(" ");
                 }
            }
            System.err.println();
        }
        


    }
    
}
