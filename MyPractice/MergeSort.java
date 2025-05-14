package MyPractice;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {4,3,6,1,2};
        int[] result = mergeSort(nums);
        System.out.println("Result "+Arrays.toString(result));

    }

    private static int[] mergeSort(int[] arr) {
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        
        return null;
    }
}
