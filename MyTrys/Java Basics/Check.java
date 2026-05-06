public class Check {
    static int x = 10;
    static{
        x = 20;
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println(x);
        x = 30;
        System.out.println(x);
    }

}
