package MyTrys;

public class KadanAlgorithm {

    public static void main(String[] args) {
        int[] nums = {4,2,2,-8,2};

        int currentmax = nums[0];
        int globalmax =  nums[0];
        int currentmin =  nums[0];
        int globalmin =  nums[0];


        for(int i=1;i<nums.length;i++){
            currentmax = Math.max(nums[i],currentmax+nums[i]);
            globalmax = Math.max(currentmax,globalmax);

            currentmin = Math.min(nums[i],currentmin+nums[i]);
            globalmin = Math.min(currentmin,globalmin);
        }

        globalmin = Math.abs(globalmin);
        globalmax = Math.max(globalmax,globalmin);

        System.out.println("globalmax is "+globalmax);
    }

}
