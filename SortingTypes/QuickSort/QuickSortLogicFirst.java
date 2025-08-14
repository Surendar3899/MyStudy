package SortingTypes.QuickSort;

import java.util.Arrays;

public class QuickSortLogicFirst {
   public static void main(String[] args) {
    int[] arr = {5,8,4,3,7,6,2,9,5};
    quickSort(arr,0,arr.length-1,"from start");
    System.out.println("result "+ Arrays.toString(arr));
   }

   private static void quickSort(int[] arr, int i, int j,String come) {
    System.out.println("quicksort "+ Arrays.toString(arr)+"   "+i+"   "+j+"       "+come);

       if(i>j){
        return;
       }
        
        int start = i;
        int end = j;
    
        int mid = (start+end)/2;
        int pivot = arr[mid];


        while(start<=end){

            while(arr[start] < pivot){
                start++;
            }

            while(arr[end]> pivot){
                end--;
            }

            if(start<=end){
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start++;
                end--;
            }
        }

        quickSort(arr,i,end,"from first");
        quickSort(arr,start,j,"from second");

       


   }
}
