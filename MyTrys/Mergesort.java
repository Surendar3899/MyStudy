package MyTrys;

import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,5,6,1,100,87};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr, int start, int end) {
        System.out.println("mergeSort called ");
        System.out.println("start is "+start);
        System.out.println("end is "+end);
        if(end-start == 1){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr,start,mid,end);

    }

    private static void merge(int[] arr, int start, int mid, int end) {
        System.out.println("merge called");
        System.out.println(start+" "+mid+" "+end);
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
