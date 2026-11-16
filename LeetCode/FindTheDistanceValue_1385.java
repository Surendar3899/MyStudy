public class FindTheDistanceValue_1385 {
    public static void main(String[] args) {
       int[] arr1 = {4,5,8}, arr2 = {10,9,1,8};
       int d = 2;
       int result = findTheDistanceValue(arr1, arr2, d);
       System.out.println("result is "+result); 
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;
        for(int i=0;i<arr1.length;i++){
            boolean valid = true;
            for(int j=0;j<arr2.length;j++){
                int diff = Math.abs(arr1[i]-arr2[j]);
                if(diff <= d){
                   valid = false;
                   break;
                }
            }

            if(valid){
                ans++;
            }
        }

        return ans;
    }

}
