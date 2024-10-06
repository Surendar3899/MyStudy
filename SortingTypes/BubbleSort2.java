package SortingTypes;

import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] a = {35,32,26,13,10};
        bubbleSort(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void bubbleSort(int[] arr, int n) {
       for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
              if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
              }

        }
       }
    }
}
