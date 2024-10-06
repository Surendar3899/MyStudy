package MyPractice;

import java.util.Scanner;

public class Lastpyramid {
    public static void main(String[] args) {
        
        System.out.println("Enter input");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        char start = (char) ('A'+26-a);
        for(int i=1;i<=a;i++){
            
            for(int j=1;j<=i;j++){
                if(j==2){
                System.out.print(++start);
                }else{
                    System.out.print(start);

                }
            
            }
            System.err.println();
        }

        
    }
    
}
