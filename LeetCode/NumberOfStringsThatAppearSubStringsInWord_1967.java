public class NumberOfStringsThatAppearSubStringsInWord_1967 {

    public static void main(String[] args) {
       String[] patterns = {"ad","abc","bc","d"};
       String word = "abc";
       int result = numOfStrings(patterns, word);
       System.out.println("result is "+result);
    }

    public static int numOfStrings(String[] patterns, String word) {
        int ans = 0;

        for(int i=0;i<patterns.length;i++){
            boolean isExist = isContains(word,patterns[i]);
            if(isExist){
                ans++;
            }
        }


        return ans;
    }

    public static boolean isContains(String word,String pattern){
        if(word.contains(pattern)){
            return true;
        }else{
            return false;
        }
    }

}
