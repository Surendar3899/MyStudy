public class ShortestBeautifulSubstring_2904 {

    public static void main(String[] args) {
        String s = "100011001";
        int k = 3;
        String result = shortestBeautifulSubstring(s, k);
        System.out.println("result is "+result);
    }

    public static String shortestBeautifulSubstring(String s, int k) {
        int left = 0 ;
        int ones  = 0 ;
        String answer = "";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                ones++;
            }

            while(ones == k){
                String current = s.substring(left,i+1);
                System.out.println("current is "+current);
                if(answer == "" || answer.length() > current.length() || (answer.length() == current.length() && current.compareTo(answer) < 0)){
                    answer = current;
                }

                if(s.charAt(left) == '1'){
                    ones--;
                }
                left++;
            }
        }

        return answer;
    }

}
