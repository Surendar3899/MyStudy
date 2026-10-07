import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("before "+Arrays.toString(arr));

        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("max is "+max);

        int[] newarr = new int[max+1];

        for(int i=0;i<arr.length;i++){
            newarr[arr[i]]++;
        }

        System.out.println("newarr "+Arrays.toString(newarr));

        int index = 0;
        for(int i=0;i<=max;i++){
            while(newarr[i] > 0){
                arr[index] = i;
                index++;
                newarr[i]--;
            }
        }

        System.out.println("after "+Arrays.toString(arr));


    }

}
