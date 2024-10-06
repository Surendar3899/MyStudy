package SortingTypes;

import java.util.Arrays;

public class BubbleSort3 {
    public static void main(String[] args) {
        BubbleSort3 ob = new BubbleSort3();
        int arr[] = {6, 4, 5, 12, 2, 11, 9};    
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int n) {
        if (n == 1)                     
        {
            return;
        }

        for (int i=0; i<n-1; i++)       
        {
            if (arr[i] > arr[i+1])      
            {                           
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
            
        bubbleSort(arr, n-1); 
    }
}
