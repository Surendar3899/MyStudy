package SortingTypes;

import java.util.Arrays;

public class IterativeMergeSort {

    // Main function that sorts arr[] using iterative merge sort
    public void sort(int[] arr) {
        int n = arr.length;

        // For current size of subarrays to be merged, size varies from 1 to n/2
        for (int currSize = 1; currSize <= n - 1; currSize = 2 * currSize) {
            // Pick starting point of different subarrays of current size
            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * currSize) {
                // Find ending point of left subarray
                int mid = Math.min(leftStart + currSize - 1, n - 1);

                // Find ending point of right subarray
                int rightEnd = Math.min(leftStart + 2 * currSize - 1, n - 1);

                // Merge the two subarrays
                merge(arr, leftStart, mid, rightEnd);
            }
        }
    }

    // Merges two subarrays of arr[]. First subarray is arr[l..m], second subarray is arr[m+1..r]
    private void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        IterativeMergeSort sorter = new IterativeMergeSort();
        int[] arr = {12, 11, 13, 5, 6, -100,7,1,0,-1};
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

