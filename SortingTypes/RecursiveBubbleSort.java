package SortingTypes;

import java.util.Arrays;

public class RecursiveBubbleSort {

    public static void main(String[] args) {
        int[] a = {13, 32, 26, 35, 10};
        bubbleSortRecursive(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    private static void bubbleSortRecursive(int[] a, int n) {
        // Base case: If the array size is 1, it's already sorted
        System.out.println("call bubbleSortRecursive");
        if (n == 1) {
            return;
        }

       
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }

        System.out.println(Arrays.toString(a));
        bubbleSortRecursive(a, n - 1);
    }
}
