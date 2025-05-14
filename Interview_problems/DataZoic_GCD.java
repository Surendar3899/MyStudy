package Interview_problems;

public class DataZoic_GCD {
    /*public static void main(String[] args) {
        

    }*/

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;

        int[] arr = {1,2,3,4,5,6};
        int length = 6;

        for(int i=0;i<length;i++){
            for(int j = i+1;j<length;j++){
                int result = gcd(arr[i], arr[j]);
                if(result == 1){
                    System.out.println("success");
                }else{
                    System.out.println("not success");
                }
            }
        }

        
        //int result = gcd(num1, num2);
        //System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);

        //If the GCD is 1, they are coprime
        //if (result == 1) {
           // System.out.println(num1 + " and " + num2 + " are coprime.");
        //} else {
            //System.out.println(num1 + " and " + num2 + " are not coprime.");
        //}
    }


    public static int gcd(int a, int b) {
        // Method to calculate GCD using the Euclidean algorithm
        while (b != 0) {
            System.out.println("b value is "+ b +"  a = "+ a);
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
