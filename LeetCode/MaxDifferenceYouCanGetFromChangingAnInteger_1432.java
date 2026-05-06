public class MaxDifferenceYouCanGetFromChangingAnInteger_1432 {

    public static void main(String[] args) {
        int num = 1101057;
        int result = maxDiff(num);
        System.out.println("result is "+result);
    }

    public static int maxDiff(int num) {
        int ans = 0;

        String n = Integer.toString(num);
        char[] a = n.toCharArray();
        
        char toReplace = ' ';
        for(int i=0;i<a.length;i++){
             if(toReplace == ' ' && a[i] != '9'){
                toReplace = a[i];
             }

             if(a[i] == toReplace){
                a[i] = '9';
             }
        }

        System.out.println(a);


        toReplace = ' ';
        
        char[] b0 = n.toCharArray();

        for(int i=0;i<b0.length;i++){
            if(toReplace == ' ' && i>0 && b0[i] != b0[0] && b0[i] != '0'){
                toReplace = b0[i];
            }

            if(toReplace == b0[i]){
                b0[i] = '0';
            }
        }

        System.out.println(b0);

        toReplace = ' ';
        
        char[] b1 = n.toCharArray();

        for(int i=0;i<b1.length;i++){
            if(toReplace == ' ' && b1[i] != '1'){
                toReplace = b1[i];
            }

            if(toReplace == b1[i]){
                b1[i] = '1';
            }
        }

        System.out.println(b1);


        return Integer.parseInt(String.valueOf(a)) - Math.min(Integer.parseInt(String.valueOf(b0)),Integer.parseInt(String.valueOf(b1)));
    }

}
