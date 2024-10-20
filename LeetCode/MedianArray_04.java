package LeetCode;

import java.util.ArrayList;

/*Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.*/

public class MedianArray_04 {

    public static void main(String[] args) {
        int arr[] = {1,2};
        int arr1[] = {3,4};
        double result = findMedianSortedArrays(arr,arr1);
    }

    

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double result = 0;

        ArrayList newArr = new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            
        }
        

        return result;
    }
    
}
