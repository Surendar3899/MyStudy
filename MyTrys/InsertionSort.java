import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,5,6,1,100,87};
        for(int i=1;i<arr.length;i++){
           for(int j=0;j<=i;j++){
            if(arr[i]<arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
            }
           }
        }

        System.out.println(Arrays.toString(arr));
    }

}
