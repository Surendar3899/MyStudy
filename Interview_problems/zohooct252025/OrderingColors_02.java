import java.util.Arrays;

public class OrderingColors_02 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        sort(nums, nums.length);
    }

     private static void sort(int[] arr,int n) {
        int k =0;
        for(int i=1;i<=n-1;i++){
            for(int j=i;j>0;j--){
                int key = arr[j];
                if(key<arr[j-1]){
                   arr[j] = arr[j-1];
                   arr[j-1] = key;  

                }else{
                    break;
                }
            }
        }
    }

}
