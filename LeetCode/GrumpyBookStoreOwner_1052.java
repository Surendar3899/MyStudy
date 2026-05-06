public class GrumpyBookStoreOwner_1052 {

    public static void main(String[] args) {
        // int[] customers = {1,0,1,2,1,1,7,5}, grumpy = {0,1,0,1,0,1,0,1};
        int[] customers = {9,7,6}, grumpy = {1,1,1};
        int minutes = 3;
        int result = maxSatisfied(customers, grumpy, minutes);
        System.out.println("result is "+result);
    }

    public static  int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int ans = 0;

        int max = 0;
        int start = 0;
        int end = 0;
        int customersSatisfied = 0;
        while(end < customers.length){
            customersSatisfied = customersSatisfied + grumpy[end] * customers[end];

            if(end - start+1 > minutes){
                customersSatisfied = customersSatisfied - (grumpy[start] * customers[start]);
                start++;
            }

            if(customersSatisfied > max){
                max = customersSatisfied;

            }

            end++;
        }


        for(int i=0;i<customers.length;i++){
            if(grumpy[i] == 0){
                ans = ans+customers[i];
            }
        }
        return ans+max;

    }

}
