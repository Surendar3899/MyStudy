package SortingTypes.mergeSort;

import java.util.Arrays;

public class MergeSortInPlaceLogicFirst {
     public static void main(String[] args) {
        int[] arr = {4,5,3,2,1};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println("Arrays "+Arrays.toString(arr));
     }

     private static void mergeSortInPlace(int[] arr, int start, int end) {
        if(end-start == 1){
            return;
        }

        int mid = (start-end)/2;
        System.out.println("1  "+start+" "+mid);
        mergeSortInPlace(arr,start,mid);
        System.out.println("2  "+mid+" "+end);
        mergeSortInPlace(arr,mid,end);

        mergeInPlace(arr,start,mid,end);
    }

     private static void mergeInPlace(int[] arr, int start, int mid, int end) {
         int[] joined = new int[end-start];
         int i=start,j=mid,k=0;

        while(i < mid && j<end){
            if(arr[i] < arr[j]){
                joined[k++] = arr[i++];
            }else{
                joined[k++] = arr[j++];
            }
        }
        while(i < mid){
            joined[k++] = arr[i++];
        }

        while(j < end){
            joined[k++] = arr[j++];
        }


        for(k=0;k<joined.length;k++){
            arr[start+k] = joined[k];
        }

     }
}
