package LeetCodeRevise;


public class JumpgameII {
    public static void main(String[] args) {
        int[] nums = {2,3,6,1,4,3};

        int minjump = 0;

        int max = 0;
        int current = 0;

        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]+i);
            if(i == current){
                minjump++;
                current = max;

            }

        }

        System.out.println(minjump);
        
    }

}
