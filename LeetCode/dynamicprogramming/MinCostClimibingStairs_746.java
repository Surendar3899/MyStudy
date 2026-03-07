public class MinCostClimibingStairs_746 {
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int result = minCostClimbingStairs(cost);
        System.out.println("result is "+result);
    }

    public static int minCostClimbingStairs(int[] cost) {
        if(cost == null || cost.length == 0){
            return 0;
        }
        if(cost.length == 1){
            return cost[0];
        }

        for(int i=cost.length-2;i>=0;i--){
            if(i == cost.length-2){
                cost[i] = Math.min(cost[i],cost[i]+cost[i+1]);
            }else{
                cost[i] = Math.min(cost[i]+cost[i+1],cost[i]+cost[i+2]);
            }
        }
        return Math.min(cost[0],cost[1]);
    }

}
