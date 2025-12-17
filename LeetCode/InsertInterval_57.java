package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertInterval_57 {
    public static void main(String[] args) {
        // int[][] intervals = {{1,5}};
        // int[] newInterval = {0,3};
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        int[][] result = insert2(intervals,newInterval);
        System.out.println(Arrays.deepToString(result));
    }


    public static int[][] insert2(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();

        if(intervals.length == 0){
            ans.add(newInterval);
            return ans.toArray(new int[ans.size()][]);
        }

        int i = 0;

        while(intervals[i][1] < newInterval[0]){
            ans.add(intervals[i]);
            i++;
        }

        while(i<intervals.length && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
            i++;
        }

        ans.add(newInterval);

        while (i<intervals.length) {
            ans.add(intervals[i]);
            i++;
        }

       

        return ans.toArray(new int[ans.size()][]);
    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();

        if(intervals.length == 0){
            ans.add(newInterval);
        }

        int[][] temp = new int[intervals.length+1][2];

        for(int i=0;i<intervals.length;i++){
            temp[i] = intervals[i];
        }
        temp[intervals.length] = newInterval; 

        Arrays.sort(temp,Comparator.comparingInt(n->n[0]));

        for(int i=0;i<temp.length;i++){
            if(ans.isEmpty() || ans.get(ans.size()-1)[1] < temp[i][0]){
                ans.add(temp[i]);
            }else{
                ans.get(ans.size()-1)[1] = Math.max(temp[i][1],ans.get(ans.size()-1)[1]);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }

}
