import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6,7,8,4,1,9,0,4,3,5};
        int[] result = merge(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] merge(int[] arr) {
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] arr1 = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] arr2 = merge(Arrays.copyOfRange(arr, mid, arr.length));
      
        System.out.println("before merge sort ");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        return mergesortedarr(arr1,arr2);
    }

    private static int[] mergesortedarr(int[] arr1, int[] arr2) {
       

        int newarr[] = new int[arr1.length+arr2.length];
        int i=0,j=0;
        int k =0;
        while(i < arr1.length && j < arr2.length){
          if(arr1[i] > arr2[j]){
            newarr[k++] = arr2[j];
            j++;
          }else{
            newarr[k++] = arr1[i];
            i++;
          }
        }

        while(i<arr1.length){
            newarr[k++] = arr1[i++];
        }

         while(j<arr2.length){
            newarr[k++] = arr2[j++];
        }

        return newarr;
    }

    

}
