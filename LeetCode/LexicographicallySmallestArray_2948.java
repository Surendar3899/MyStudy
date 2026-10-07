import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LexicographicallySmallestArray_2948 {
    public static void main(String[] args) {
       int[] nums = {1,7,6,18,2,1};
       int limit = 3;
       int[] result = lexicographicallySmallestArray(nums, limit);
       System.out.println(Arrays.toString(result)); 
    }

    public static int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[][] a = new int[n][2];

        for (int i = 0; i < n; i++) {
            a[i][0] = nums[i];
            a[i][1] = i;
        }

        Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));


        System.out.println(Arrays.deepToString(a));

        int i = 0;

        while (i < n) {
            System.out.println("i is "+i);
            int j = i;

            // Find one group
            while (j + 1 < n && a[j + 1][0] - a[j][0] <= limit) {
                j++;
            }

            // Original indices of this group
            List<Integer> indices = new ArrayList<>();
            for (int k = i; k <= j; k++) {
                indices.add(a[k][1]);
            }
            System.out.println("in "+indices);

            Collections.sort(indices);

            System.out.println("in2  "+indices);

            // Assign sorted values to sorted original indices
            for (int k = 0; k < indices.size(); k++) {
                nums[indices.get(k)] = a[i + k][0];
            }

            i = j + 1;
        }

        return nums;
    }

}
