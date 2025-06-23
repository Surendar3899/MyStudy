package LeetCodeRevise;

public class Jumpgame {

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4,5};
        boolean result = true;

        int maxJump = nums[0];
        for(int i=1;i<nums.length;i++){
            if(maxJump < i){
                result = false;
                break;
            }
            if(maxJump<nums[i]+i){
                maxJump = nums[i]+i;
            }
            
        }
        System.out.println(result);

    }

}
