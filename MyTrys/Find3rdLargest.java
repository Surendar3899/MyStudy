package MyTrys;

import java.util.Arrays;
import java.util.Comparator;

public class Find3rdLargest {

    public static void main(String[] args) {
        String[] arr = {"aa","dd","c","ghhh","xxxx","bbbg","eeegfg"};
        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        //String[] arr2 = Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){

        //     String 
          
        // }


       /*  Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s2.length(), s1.length()); 
            }
        });*/


        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int lengthCompare = Integer.compare(s2.length(), s1.length()); // Compare by length in reverse (descending)
                if (lengthCompare != 0) {
                    return lengthCompare;
                }
                return s2.compareTo(s1); // Alphabetical order if lengths are the same
            }
        });

        System.out.println(Arrays.toString(arr));
    }

}
