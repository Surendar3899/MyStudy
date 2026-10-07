public class FindGCDOfArray_1979 {

    public static void main(String[] args) {
       int[] nums = {2,5,6,9,10};
       int result = findGCD(nums); 
       System.out.println("result is "+result);
    }

    public static int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
           min = Math.min(min, nums[i]);
           max = Math.max(max, nums[i]);
        }
        return gcd(min,max);
    }

    public static int gcd(int a,int b){
        while(b != 0){
            int temp = b;
            b = a% b;
            a = temp;
        }
        return a;
    }

}
