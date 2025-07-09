package LeetCode;

public class FindKthCharacter_3307 {
    public static void main(String[] args) {
        long k = 5;
        int[] operations = {0,0,0};
        char result = kthCharacter(k,operations);
    }

    public static char kthCharacter(long k, int[] operations) {

        StringBuilder s = new StringBuilder("a");
        
        int intValue = (int) k;

        while (s.length() < k) {
            for(int j=0;j<operations.length;j++){
                int current = operations[j];
                int currentLength = s.length();
                for (int i = 0; i < currentLength; i++) {
                    char ch = s.charAt(i);
                    char next = ' ';
                    if(current == 0){
                        next = (char) ((ch - 'a' + 0) % 26 + 'a');
                    }else if(current == 1){
                        next = (char) ((ch - 'a' + 1) % 26 + 'a');
                    }
                    s.append(next);
                    if (s.length() >= k) {
                        break;
                    }
                }         
            }
        }

        return s.charAt(intValue-1);
    }

}
