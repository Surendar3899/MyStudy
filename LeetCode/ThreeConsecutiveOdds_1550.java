public class ThreeConsecutiveOdds_1550 {

    public static void main(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        boolean result = threeConsecutiveOdds(arr);
        System.out.println("result is "+result);
    }

     public static boolean threeConsecutiveOdds(int[] arr) {
        int start = 0;
        int end  = 0;
        for(;end<arr.length;end++){
          if(arr[end]%2 == 0 ){
            start = end+1;
          }

          if(end-start+1 == 3){
            return true;
          }
        }
        return false;
    }

    public static boolean threeConsecutiveOdds2(int[] arr) {
        int count = 0;
        for(;end<arr.length;end++){
          if(arr[end]%2 == 0 ){
            count = 0;
            continue;
          }else{
            count++;
          }

          if(count == 3){
            return true;
          }
        }
        return false;
    }

}
