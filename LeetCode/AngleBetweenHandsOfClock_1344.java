public class AngleBetweenHandsOfClock_1344 {
    public static void main(String[] args) {
        int hour = 12;
        int minutes = 5;
        double result = angleClock(hour, minutes);
        System.out.println("result is "+result);
    }

    public static double angleClock(int hour, int minutes) {
        double hourHand = (hour%12 + minutes/60.0)*30;
        double minuteHand = minutes*6;
        double diff = Math.abs(minuteHand-hourHand);
        return Math.min(diff, 360-diff);
    }

}
