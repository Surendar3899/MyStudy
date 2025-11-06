package MyTrys;

public class FindGCD {
    public static void main(String[] args) {
        int a = 12;
        int b = 10;

        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }

        System.out.println("a is "+a);

    }

}
