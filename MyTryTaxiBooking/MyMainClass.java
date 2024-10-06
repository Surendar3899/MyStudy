package MyTryTaxiBooking;

import java.util.Scanner;



public class MyMainClass {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        boolean next = true;
        while(next){
        System.out.println("1.Book Taxi \n2.See Details\n3.Exit");
        int a = obj.nextInt();
        if(a == 1){
            System.out.println("Enter Pickup location");
            char b = obj.next().charAt(0);
            System.out.println("Enter Drop location");
            char c = obj.next().charAt(0);
            System.out.println("Enter time for pickup");
            int d = obj.nextInt();
            MyTaxiBooking.booking(b,c,d);
        }
        else if(a==2){

        }else{
          next= false;  
        }
    }

    }
}
