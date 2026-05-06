public class Check2 {
    static int a = 10;
    int b = 5;
    public static void main(String[] args) {
        Check2 ch = new Check2();
        Check2 ch1 = new Check2();

        ch.a = 11;
        ch.b = 6;

        System.out.println(ch1.a);
        System.out.println(ch1.b);
    }

}
