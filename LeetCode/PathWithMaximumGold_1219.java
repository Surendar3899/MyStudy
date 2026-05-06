public class PathWithMaximumGold_1219 {

    static int[][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};
   public static void main(String[] args) {
     int[][] grid = {{0,6,0},{5,8,7},{0,9,0}};
     int result = getMaximumGold(grid);
     System.out.println("result is "+result);
   }

   public static int getMaximumGold(int[][] grid) {
        int maxGold = 0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] != 0){
                    maxGold = Math.max(maxGold,dfs(grid,i,j));
                }
            }
        }


        return maxGold;
    }

    private static int dfs(int[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] <= 0){
            return 0;
        }

        int temp = grid[i][j];
        grid[i][j] = -1;

        int goldCollected = 0;

        for(int[] dir:dirs){
           goldCollected = Math.max(goldCollected,dfs(grid,i+dir[0],j+dir[1]));
        }

        goldCollected += temp;

        grid[i][j] = temp;

        return goldCollected;



    }
}
