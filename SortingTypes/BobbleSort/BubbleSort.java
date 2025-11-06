package SortingTypes.BobbleSort;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,7,6};
        boolean b = true;
        int a  =0;

        while(b){

            for(int i=0;i<arr.length-1;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;


                }
            }
            a++;
            if(a == 10){
                b = false;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
