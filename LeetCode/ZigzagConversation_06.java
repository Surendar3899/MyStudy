package LeetCode;

public class ZigzagConversation_06 {
    public static void main(String[] args) {
        ZigzagConversation_06 obj = new ZigzagConversation_06();
        String input = "a";
        int rows = 2;
        String result = obj.convert(input, rows);
        System.out.println("result " + result);



    }


    public String convert(String s, int numRows) {

        if(numRows == 1){
            return s;
        }

        int difference = (numRows -2)+numRows;
        StringBuilder s1 = new StringBuilder();


        for(int i=0;i<numRows;i++){

            for (int j = i; j < s.length(); j += difference) {  
                s1.append(s.charAt(j));  

            
                if (i != 0 && i != numRows - 1 && (j + difference - 2 * i) < s.length()) {
                    System.out.println("j =  "+j +" "+i+" "+difference);
                    System.out.println("value  "+(j + difference - 2 * i));
                    s1.append(s.charAt(j + difference - 2 * i)); 
                }
            }


        }

        return s1.toString();
        
    }
}
