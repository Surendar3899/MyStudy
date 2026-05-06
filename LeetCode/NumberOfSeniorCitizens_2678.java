public class NumberOfSeniorCitizens_2678 {

    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int result = countSeniors(details);
        System.out.println("result is "+result);
    }

    public static int countSeniors(String[] details) {
        int ans = 0;
        for(int i=0;i<details.length;i++){
            char[] ch = details[i].toCharArray();
            int age = (ch[11]-'0')*10;
            age = age+(ch[12]-'0');
            if(age > 60){
                ans++;
            }
        }
        return ans;
    }

}
