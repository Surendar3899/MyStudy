package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle_118 {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generateNew(numRows);
        System.out.println("result is "+result);

        // List<List<Integer>> result = generate(numRows);
        // System.out.println(result);

    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; ++i) {
            Integer[] temp = new Integer[i + 1];
            Arrays.fill(temp, 1);
            ans.add(Arrays.asList(temp));
        }


        for (int i = 2; i < numRows; ++i)
        for (int j = 1; j < ans.get(i).size() - 1; ++j)
            ans.get(i).set(j, ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));

        // for (int i = 2; i < numRows; ++i){
        //     for (int j = 1; j < ans.get(i).size() - 1; ++j){
        //         ans.get(i).set(j, ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
        //     }    
        // }    


        return ans;
    }


    public static List<List<Integer>> generateNew(int numRows) {
       List<List<Integer>> ans = new ArrayList<>();

       for(int i=0;i<numRows;i++){
        Integer[] temp = new Integer[i+1];
        Arrays.fill(temp,1);
        ans.add(Arrays.asList(temp));
       }

       for(int i=2;i<ans.size();i++){
         for(int j=1;j<ans.get(i).size()-1;j++){
           int temp = ans.get(i).get(j);
           temp = ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
           ans.get(i).set(j, temp);
         }
       }

       return ans;
    }



}
