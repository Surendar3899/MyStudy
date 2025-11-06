package LeetCode;

public class FruitsIntoBasketsII_3477 {
    public static void main(String[] args) {
        int[] fruits = {4,2,5}, baskets = {3,5,4};
        int result = numOfUnplacedFruits(fruits, baskets);
        System.out.println("result is "+result);
    }
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int ans = 0;
        for(int i=0;i<fruits.length;i++){
            boolean placed = false;
            for(int j=0;j<baskets.length;j++){
                while(fruits[i] <= baskets[j] && baskets[j] > 0){
                  placed = true;
                  baskets[j] = -1;
                  break;
                }
            }

            if(!placed){
                System.out.println("!placed "+i);
                ans++;
            }
        }
        return ans;
    }

}
