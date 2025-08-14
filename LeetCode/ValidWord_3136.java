public class ValidWord_3136 {
    public static void main(String[] args) {
        String word = "234Adas";
        boolean res=isValid(word);
        System.out.println("result is "+res);
    }

    public static boolean isValid(String word) {
        return word.length()>=3 && word.chars().allMatch(Character::isLetterOrDigit) &&
           word.chars().anyMatch(c -> isVowel((char)c)) &&
           word.chars().anyMatch(c -> isConsonant((char)c));
        
    }

    public static boolean isVowel(char c){
       return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static boolean isConsonant(char c) {
        return Character.isLetter(c) && !isVowel(c);
    }

}
