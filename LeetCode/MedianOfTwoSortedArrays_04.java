import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays_04 {
    public static void main(String[] args) {
        int arr[] = {1,3};
        int arr1[] = {2,4};
        double result = findMedianSortedArrays(arr,arr1);
        System.out.println("result is "+result);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0;
        List<Integer> li = new ArrayList<>();
        int i = 0;
        int j =0;
        int n = nums1.length+nums2.length;

        while(i<nums1.length && j < nums2.length){
           if(nums1[i] > nums2[j]){
            li.add(nums2[j]);
            j++;
           }else{
            li.add(nums1[i]);
            i++;
           }
        }

        while(i < nums1.length){
            li.add(nums1[i]);
            i++;
        }
        while(j < nums2.length){
            li.add(nums2[j]);
            j++;
        }

        if(n%2 == 0){
            System.out.println("if passed");
            double sum = li.get(n/2)+li.get((n/2)-1);
            System.out.println("sum is "+sum);
            ans = sum/2;
        }else{
            ans = li.get(n/2);
        }
        System.out.println(li);
        return ans;
    }

}
