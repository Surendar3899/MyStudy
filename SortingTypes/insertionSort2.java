package SortingTypes;

import java.util.Arrays;

public class insertionSort2 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,10,5,1,12,6};
        insertionSort(arr,arr.length); 
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr, int n) {
        for(int i=1;i<n;i++){
             int key = arr[i];
             int j=i-1;
             while(j>=0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
             }
             arr[j+1] = key;
        }
    }
}
