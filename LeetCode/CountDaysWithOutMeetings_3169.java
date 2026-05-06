import java.util.*;
public class CountDaysWithOutMeetings_3169 {

    public static void main(String[] args) {
       int days = 57;
    //    int[][] meetings = {{5,7},{1,3},{9,10}};
    // int[][] meetings = {{3,4},{4,8},{2,5},{3,8}};
    int[][] meetings = {{3,49},{23,44},{21,56},{26,55},{23,52},{2,9},{1,48},{3,31}};


       int result = countDays(days,meetings);
       System.out.println("result is "+result); 
    }

    public static int countDays(int days, int[][] meetings) {
        int ans = 0;

        Arrays.sort(meetings,Comparator.comparingInt(n->n[0]));


        if(meetings[0][0] > 1){
            ans = ans+meetings[0][0] - 1;
        }

        int max = meetings[0][1];

        for(int i=1;i<meetings.length;i++){
           if(meetings[i][0] > max+1){
            ans = ans + (meetings[i][0] - max - 1);
            System.out.println("ans is "+ans);
           }

           max = Math.max(max,meetings[i][1]);
        }

        if(max < days){
            ans = ans + (days-max);
        }


        return ans;
    }

}
