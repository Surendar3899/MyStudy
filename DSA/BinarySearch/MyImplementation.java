package DSA.BinarySearch;

public class MyImplementation {
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,8,9,14,18,19,20};
        int target = -1;
        int result = findBinarySearch(arr,0,arr.length-1,target);
        System.out.println("result is "+result);
    }

    private static int findBinarySearch(int[] arr, int i, int j, int target) {
       int result = -1;
        if (i > j) {
            return -1;
        }
        int mid = (i+j)/2;
       if(arr[mid] == target ){
        return mid;
       }else if(arr[mid] > target){
        result = findBinarySearch(arr,0,mid-1,target);
       }else if(arr[mid] < target){
         result = findBinarySearch(arr,mid+1,arr.length-1,target);
       }

       return result;
    }
}
