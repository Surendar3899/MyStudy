package MyTrys;

public class Pattern {
    public static void main(String[] args) {
        int n = 4;
        int start = 1;
        for(int i=0;i<n;i++){
            int end = 0;
            int gap = n-i;
            for(int j=1;j<gap;j++){
                System.out.print("  ");
            }
            if(i%2 == 0){
                int temp = start;
                for(int k=temp;k<temp+n;k++){
                    System.out.print(" "+k);
                    start++;
                }
            }else{
                int temp = start+n-1;
                for(int k=temp;k>temp-n;k--){
                    System.out.print(" "+k);
                    start++;
                }
            } 
            
            System.out.println();

        }
    }

}
