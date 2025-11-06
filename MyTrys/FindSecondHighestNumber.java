package MyTrys;

public class FindSecondHighestNumber {

    public static void main(String[] args) {
        int[] arr = {1,2,0,3,8,5};
        int max = 0;
        int secondmax = 0;
        for(int i=0;i<arr.length;i++){

            // if(arr[i] > secondmax && secondmax <= max){
            //     secondmax = max;
            //     System.out.println("sss "+secondmax);
            // }
           
            if(max < arr[i]){
                secondmax = max;
                max = arr[i];
            }
          
        }
        System.out.println("secondmax is "+secondmax);
        System.out.println("max is "+max);
    }

}
