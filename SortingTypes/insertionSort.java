package SortingTypes;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,10,12,1,5,6};
        insertionSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr,int n) {
        for(int i=1;i<=n-1;i++){
            for(int j=i;j>0;j--){
                int key = arr[j];
                if(key<arr[j-1]){
                   arr[j] = arr[j-1];
                   arr[j-1] = key;  

                }
            }
        }
    }
}
