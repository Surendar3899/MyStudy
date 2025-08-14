package LeetCode.slidingwindow;

import java.util.Arrays;

public class RescheduleMeetings_3439 {
    public static void main(String[] args) {
        int eventTime = 11, k = 2;
        int[] startTime = {0,2,9}, endTime = {1,4,10};
        int result = maxFreeTime(eventTime,k,startTime,endTime);
        System.out.println("result is "+result);
        
    }

    public static int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int[] gaps = getGaps(eventTime, startTime, endTime);
        System.out.println(Arrays.toString(gaps));
        int windowSum = Arrays.stream(gaps, 0, k + 1).sum();
        System.out.println("windowsum is "+windowSum);
        int ans = windowSum;

        for (int i = k + 1; i < gaps.length; i++) {
            windowSum += gaps[i] - gaps[i - k - 1];
            ans = Math.max(ans, windowSum);
        }

        return ans;
    }

    private static int[] getGaps(int eventTime, int[] startTime, int[] endTime) {
        int[] gaps = new int[startTime.length + 1];
        gaps[0] = startTime[0];
        for (int i = 1; i < startTime.length; ++i)
            gaps[i] = startTime[i] - endTime[i - 1];
        gaps[startTime.length] = eventTime - endTime[endTime.length - 1];
        return gaps;
    }

}
