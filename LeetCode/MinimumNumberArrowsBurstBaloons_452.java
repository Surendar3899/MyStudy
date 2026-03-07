package LeetCode;

import java.util.Arrays;

public class MinimumNumberArrowsBurstBaloons_452 {

    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        // int[][] points = {{1,2},{3,4},{5,6},{7,8}};
        int result = findMinArrowShots(points);
        System.out.println("result is "+result);

    }

    public static int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }
        int ans = 0;

        Arrays.sort(points,(a,b) -> Integer.compare(a[1],b[1]));

        System.out.println(Arrays.deepToString(points));
        int current = Integer.MIN_VALUE;

        for(int i=0;i<points.length;i++){
            int count  = 1;
            if(current<points[i][0]){
                current = points[i][1];
            }
            System.out.println("current is "+current);
            while(i+1 < points.length && current <= points[i+1][1] && current >= points[i+1][0]){
                System.out.println("while passed "+current+" "+points[i][0]+" "+points[i][1]);
                i++;
            }
            ans = ans+count;
        }

        return ans;
    }

}
