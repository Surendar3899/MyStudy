package TaxiBooking;

import java.util.Scanner;

public class MainClass {
   public static void main(String[] args) throws CloneNotSupportedException{
    boolean loop = true;
    while(loop){
      System.out.println("choose any one \n1.Book Taxi\n2.Display Details\n3.EXit");
      Scanner s = new Scanner(System.in);
      int n = 0;
      try{
      n = s.nextInt();
      }catch(Exception e){
        System.out.println("PLease enter correct option");
        s = new Scanner(System.in);
        n = s.nextInt();
      }
      if(n==1){
        System.out.println("Enter Pickup Location");
        char pickupLocation = s.next().charAt(0);
        System.out.println("Enter Drop Location");
        char dropLocation= s.next().charAt(0);
        System.out.println("Enter Pickup Time");
        int pickupTime = s.nextInt();
        System.out.println(TaxiBooking.booking(pickupLocation, dropLocation, pickupTime));
      }else if(n==2){
        TaxiBooking.display();
				break;
      }
      else if(n == 3){
        loop = false;
        System.out.println("Thank you");
        s.close();
        break;

      }else{
        System.out.println("Please enter correct option");

      }

    }
   } 
}
