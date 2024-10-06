package SortingTypes;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {13,32,26,35,10};
        bubble(a);
        System.out.println(Arrays.toString(a));
    }

    private static void bubble(int[] a) {
        boolean b=true;
        
        while(b){
            boolean change = false;
            System.out.println("iteation");
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                int max= a[i];
                a[i]= a[i+1];
                a[i+1] = max;
                change = true;
                System.out.println("change is "+change);
            }
            
        }
        if(change == false){
            System.out.println("false called");
            b = false;

        }
    }
    }

}
