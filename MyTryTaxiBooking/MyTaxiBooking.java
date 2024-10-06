package MyTryTaxiBooking;

import java.util.ArrayList;

import TaxiBooking.Taxi;

public class MyTaxiBooking {
    static int taxiLimit = 4;
    private static int customerId = 1;
    public static ArrayList<MyTaxi> taxiList = new ArrayList< MyTaxi>();

    public static void booking(char pickUpLocation, char dropLocation, int pickupTime){
      System.out.println(pickUpLocation+" "+dropLocation+" "+pickupTime);
      if(taxiLimit>taxiList.size()){
        taxiList.add(new MyTaxi()); 
      }

      int min = Integer.MAX_VALUE;
		  MyTaxi taxiReady = null;

      for(MyTaxi t:taxiList){
        System.out.println("-----");
        if(t.getDropTime()<=pickupTime && Math.abs(pickUpLocation-t.getCurrentLocation()) <= min){
          taxiReady = t;
          min = Math.abs(pickUpLocation-t.getCurrentLocation());
        }

         
      }
      
      if(taxiReady != null){
        taxiReady.setCurrentLocation(dropLocation);
        taxiReady.setCustomerId(customerId++);
        taxiReady.setTaxiId(taxiList.indexOf(taxiReady)+1);
        taxiReady.setDropLocation(dropLocation);
        taxiReady.setPickupTime(pickupTime);
        taxiReady.setDropTime(pickupTime+Math.abs(pickUpLocation-dropLocation));
        taxiReady.setEarnings(taxiReady.getEarnings()+Math.abs(pickUpLocation-dropLocation)*100);

        System.out.println("taxi booked "+taxiReady.getTaxiId());
        System.out.println("set Drop time"+taxiReady.toString());
      }else{
        System.err.println("Taxi Not Available");
      }
      
    }
}
