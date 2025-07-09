package Interview_problems.gavstechnologies;

import java.util.Arrays;

public class Moveonetobefore {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,1,1,0,1,0,0,0};

        int i = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j] == 1){
                arr[i] = 1;
                i++;
            }
        }


        for(int j=i;j<arr.length-1;j++){
            arr[j] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

}
