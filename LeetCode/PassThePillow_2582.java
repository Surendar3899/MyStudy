public class PassThePillow_2582 {

    public static void main(String[] args) {
        int n = 18, time = 38;
        int result = passThePillow(n,time);
        System.out.println("result is "+result);

    }

    public static int passThePillow(int n, int time) {

        int direction = 1;
        int i = 1;


        while(time > 0 ){
            i = i+direction;
            if(i == n){
                direction = -1;
            }else if(i == 1){
                direction = 1;
            }
            time--;
        }

        return i;
    }

}
