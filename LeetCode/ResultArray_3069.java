import java.util.Arrays;

public class ResultArray_3069 {

    public static void main(String[] args) {
       int[] nums = {2,1,3,3};
       int[] result = resultArray(nums);
       System.out.println(Arrays.toString(result));
    }

    public static int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int size1 = 0;
        int size2 = 0;

        arr1[size1++] = nums[0];
        arr2[size2++] = nums[1];

        for(int i=2;i<n;i++){
            if(arr1[size1-1] > arr2[size2-1]){
                arr1[size1++] = nums[i];
            }else{
                arr2[size2++] = nums[i];
            }
        }


        int[] result = new int[n];

        int index = 0;

        for (int i = 0; i < size1; i++) {
            result[index++] = arr1[i];
        }

        for (int i = 0; i < size2; i++) {
            result[index++] = arr2[i];
        }

        return result;
    }

}
