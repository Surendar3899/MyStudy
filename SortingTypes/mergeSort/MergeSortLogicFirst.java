package SortingTypes.mergeSort;

import java.util.Arrays;

public class MergeSortLogicFirst {
   public static void main(String[] args) {
    int[] arr = new int[]{5,3,2,1,7};
    int[] result = mergeSort(arr);
    System.out.println("Result");
    System.out.println(Arrays.toString(result));
   }


   public static int[] mergeSort(int[] arr) {
    System.out.println("left array "+Arrays.toString(arr));
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        
        System.out.println("orig arr "+Arrays.toString(arr));
        return merge(left,right);
    
   }

   public static int[] merge(int[] left,int[] right){
    System.out.println("merge called");
    System.out.println(Arrays.toString(left));
    System.out.println(Arrays.toString(right));
    int[] joined = new int[left.length+right.length];
    int i =0;
    int j =0;
    int k = 0;

    while(i < left.length && j<right.length){
        if(left[i] < right[j]){
            joined[k++] = left[i++];
        }else{
            joined[k++] = right[j++];
        }
    }
    while(i < left.length){
        joined[k++] = left[i++];
    }

    while(j < right.length){
        joined[k++] = right[j++];
    }


    return joined;
   }
}
