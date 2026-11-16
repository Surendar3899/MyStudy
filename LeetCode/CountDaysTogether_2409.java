import java.util.HashMap;
import java.util.Map;

public class CountDaysTogether_2409 {

    public static void main(String[] args) {
        String arriveAlice = "08-15", leaveAlice = "08-18", arriveBob = "08-16", leaveBob = "08-19";
        int result = countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob);
        System.out.println("result is  "+result);
    }


    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1, 31);
        map.put(2,28);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);

        int ans  = 0 ;


        int startALice = toDay(arriveAlice,map);
        int endAlice = toDay(leaveAlice, map);

        int startBob = toDay(arriveBob,map);
        int endBob = toDay(leaveBob, map);

        System.out.println(startALice +" "+endAlice+" "+startBob+" "+endBob);

        int start = Math.max(startBob, startALice);
        int end = Math.min(endAlice, endBob);


        ans = Math.max(0, end-start+1);

        return  ans;

    }

    public static int toDay(String date,Map<Integer,Integer>  map){
        int month = Integer.parseInt(date.substring(0,2));
        int day = Integer.parseInt(date.substring(3,5));
        System.out.println("month "+month +"  day "+day);
        int total = day;

        for(int i=1 ; i<month ; i++){
            total = total + map.get(i);
        }

        return total;
    }

}
