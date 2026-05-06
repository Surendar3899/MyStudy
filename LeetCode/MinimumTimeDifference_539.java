import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumTimeDifference_539 {
    public static void main(String[] args) {
        List<String> timePoints = new ArrayList<>(Arrays.asList("02:39","10:26","21:43"));
        // List<String> timePoints = new ArrayList<>(Arrays.asList("01:01","02:01"));
        int result = findMinDifference(timePoints);
        System.out.println("result is "+result);
    }


    public static int findMinDifference(List<String> timePoints) {
        int ans = Integer.MAX_VALUE;

        Collections.sort(timePoints);

    

        for(int i=1;i<timePoints.size();i++){
          int start = toMinutes(timePoints.get(i));
          int end = toMinutes(timePoints.get(i-1));

          ans = Math.min(ans,(start-end));

        }

        ans = Math.min(ans,(1440+toMinutes(timePoints.get(0)))-toMinutes(timePoints.get(timePoints.size()-1)));

        return ans;
    }

    public static int toMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }

}
