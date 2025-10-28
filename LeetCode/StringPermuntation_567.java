public class StringPermuntation_567 {

    public static void main(String[] args) {
        String s1 = "dinitrophenylhydrazine", s2 = "acetylphenylhydrazine";
        boolean result = checkInclusion(s1, s2);
        System.out.println("result is "+result);
    }

    public static boolean checkInclusion(String s1, String s2) {
        boolean result = permunation(s1,s2,"");
        return result;
    }

    private static boolean permunation(String input, String s2, String output) {

        if(input.length() == 0){
            if(s2.contains(output)){
                System.out.println("output "+output);
                return true;
            }
        }

        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            String rem = input.substring(0, i)+input.substring(i+1, input.length());
            boolean res = permunation(rem, s2, output+ch);
            if(res){
                return true;
            }
        }
        return false;
    }

}
