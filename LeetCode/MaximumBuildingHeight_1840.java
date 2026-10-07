import java.util.*;

public class MaximumBuildingHeight_1840 {
    public static void main(String[] args) {
      int n = 10;
      int[][] restrictions = {{5,3},{2,5},{7,4},{10,3}};
      int result = maxBuilding(n, restrictions);
      System.out.println("result is "+result);
    }

     public static int maxBuilding(int n, int[][] restrictions) {
        List<int[]> list = new ArrayList<>();

        list.add(new int[]{1, 0});

        for (int[] r : restrictions)
            list.add(r);

        list.add(new int[]{n, n - 1});

        for(int[] l:list){
            System.out.println(Arrays.toString(l));
        }

        Collections.sort(list, (a, b) -> a[0] - b[0]);
        System.out.println("after");
         for(int[] l:list){
            System.out.println(Arrays.toString(l));
        }


        //currentHeight = min(currentHeight,previousHeight+distance)
        // Left -> Right
        for (int i = 1; i < list.size(); i++) {

            int[] prev = list.get(i - 1);
            int[] cur = list.get(i);

            cur[1] = Math.min(cur[1],
                    prev[1] + (cur[0] - prev[0]));
        }


        //currentHeight =min(currentHeight,nextHeight+distance)
        // Right -> Left
        for (int i = list.size() - 2; i >= 0; i--) {

            int[] next = list.get(i + 1);
            int[] cur = list.get(i);

            cur[1] = Math.min(cur[1],
                    next[1] + (next[0] - cur[0]));
        }

        int ans = 0;

        
        //max = (h1 + h2 + distance) / 2

        for (int i = 1; i < list.size(); i++) {

            int[] left = list.get(i - 1);
            int[] right = list.get(i);

            int distance = right[0] - left[0];

            int peak = (left[1] + right[1] + distance) / 2;

            ans = Math.max(ans, peak);
        }

        return ans;
    }

}
