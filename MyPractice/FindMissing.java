package MyPractice;

public class FindMissing {
    public static void main(String[] args) {
        int a[] = {0,1,3,2,5,7};
        int b = a.length;
        int n= b*(b+1)/2;
        int sum = 0;
        for(int i=0;i<a.length;i++){
               sum += a[i];
        }

        System.out.println("missing number is "+(n-sum));
    }
}
