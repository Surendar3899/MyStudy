public class IntToBinary {
    public static void main(String[] args) {
        int n = 10;
        StringBuilder s = new StringBuilder();

        while(n != 0){
            int reminder = n%2;
            s.append(reminder);
            n=n/2;
        }

        s.reverse();

        System.out.println(s);

        
    }

}
