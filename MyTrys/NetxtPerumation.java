package MyTrys;

import java.util.Arrays;

public class NetxtPerumation {
    public static void main(String[] args) {
       int[] arr = {4,3,2,1};
       nextPermutation(arr);
       System.out.println(Arrays.toString(arr));
        
    }

    private static void nextPermutation(int[] arr) {
       int i = arr.length-2;


       while(i>0 && arr[i] > arr[i+1]){
        i--;
       }

       int j = arr.length-1;

       swap(arr,i,j);
       reverse(arr,i+1);
    }

    private static void reverse(int[] arr, int i) {
       int e = arr.length-1;
       while(i<e){
        int temp = arr[e];
        arr[e] = arr[i];
        arr[i] = temp;
        e--;
        i++;
       }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
