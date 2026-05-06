import java.util.TreeMap;

public class MyCalendar_729 {

    public static void main(String[] args) {
        MyCalendar obj = new MyCalendar();
        boolean param_1 = obj.book(10,20);
        boolean param_2 = obj.book(15,25);
        boolean param_3 = obj.book(20,30);

        System.out.println(param_1 +" "+param_2+" "+param_3);
    }

}

class MyCalendar {
    TreeMap<Integer,Integer> bookings;
    public MyCalendar() {
        bookings = new TreeMap<>();
    }
    
    public boolean book(int startTime, int endTime) {
        Integer lowerStartthanCurrentStart = bookings.floorKey(startTime);
        Integer higherStartthanCUrrentStart = bookings.ceilingKey(startTime);

        if((lowerStartthanCurrentStart == null || startTime >= bookings.get(lowerStartthanCurrentStart)) && (higherStartthanCUrrentStart == null || higherStartthanCUrrentStart >= endTime)){
            bookings.put(startTime,endTime);
            return true;

        }
        return false;
    }
}
