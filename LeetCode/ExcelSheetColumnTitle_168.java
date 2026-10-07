public class ExcelSheetColumnTitle_168 {

    public static void main(String[] args) {
        int columnNumber = 28;
        String result = convertToTitle(columnNumber);
        System.out.println("result is "+result);
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();

        while(columnNumber > 0){
            columnNumber = columnNumber - 1;
            int rem = columnNumber % 26; 
            str.append((char)('A'+rem));
            columnNumber = columnNumber/26;
        }


        return str.reverse().toString();
    }

}
