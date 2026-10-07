import java.util.Arrays;
import java.util.Comparator;

public class RemoveCoveredIntervals_1288 {

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{1,4},{3,4}};
        int result = removeCoveredIntervals2(intervals);
        System.out.println("result is   "+result);
    }

    public static int removeCoveredIntervals(int[][] intervals) {
        int ans  = 1;
        Arrays.sort(intervals,Comparator.comparingInt(n -> n[0]));
        System.out.println(Arrays.deepToString(intervals));


        int first = intervals[0][0];
        int second = intervals[0][1];

        for(int i=1;i<intervals.length;i++){
           if(intervals[i][1] > second && first < intervals[i][0]){
            ans++;
            first = intervals[i][0];
            second = intervals[i][1];
           }else if(intervals[i][1] > second){
             first = intervals[i][0];
            second = intervals[i][1];
           }
        }

        

        return ans;
    }

    public static int removeCoveredIntervals2(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1]; // end descending
            }
            return a[0] - b[0];     // start ascending
        });

        // Arrays.sort(intervals,Comparator.comparingInt(n -> n[0]));

        System.out.println(Arrays.deepToString(intervals));


        int count = 0;
        int maxEnd = -1;

        for (int[] interval : intervals) {
            if (interval[1] > maxEnd) {
                count++;
                maxEnd = interval[1];
            }
        }

        return count;
    }

}
