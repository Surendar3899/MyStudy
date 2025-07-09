package MyTrys;

public class InttoBinary {
    public static void main(String[] args) {
        int a = 46;

        /*88 ÷ 2 = 44 → remainder 0
        44 ÷ 2 = 22 → remainder 0
        22 ÷ 2 = 11 → remainder 0
        11 ÷ 2 = 5 → remainder 1
        5 ÷ 2 = 2 → remainder 1
        2 ÷ 2 = 1 → remainder 0
        1 ÷ 2 = 0 → remainder 1

        Now reverse the remainders:
        88 (decimal) = 1011000 (binary)*/

        StringBuilder str = new StringBuilder();
        int num = a;
        while(num != 0){
            int reminder = num%2;
            num = num/2;
            str.append(reminder);
        }

        str.reverse();

        System.out.println(str);




    }
}
