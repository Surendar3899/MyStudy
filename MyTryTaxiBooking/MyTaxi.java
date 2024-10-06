package MyTryTaxiBooking;

public class MyTaxi {
    private char currentLocation = 'A';
    private int customerId;
    private int taxiId;
    private char pickUpLocation;
    private char dropLocation;
    private int pickupTime;
    private int dropTime;
    private int earnings;

    public char getCurrentLocation(){
        return currentLocation; 
    }
    public void setCurrentLocation(char a){
        currentLocation = a;
    }

    public int getCustomerId(){
        return customerId;
    }

    public void setCustomerId(int a){
        customerId = a;
    }

    public int getTaxiId(){
        return taxiId;
    }

    public void setTaxiId(int a){
        taxiId = a;
    }

    public char getPickUpLocation(){
        return pickUpLocation; 
    }
    public void setPickupLocation(char a){
        pickUpLocation = a;
    }


    public char getDropLocation(){
        return dropLocation; 
    }
    public void setDropLocation(char a){
        dropLocation = a;
    }

    public int getPickupTime(){
        return pickupTime;
    }

    public void setPickupTime(int a){
        pickupTime = a;
    }


    public int getDropTime(){
        return dropTime;
    }

    public void setDropTime(int a){
        dropTime = a;
    }

    public int getEarnings(){
           return earnings;
    }
    public void setEarnings(int a){
        earnings=a;
    }


    
    public String toString(){
        return "dfgfdef"+earnings;
    }




}
