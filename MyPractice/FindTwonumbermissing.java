package MyPractice;

public class FindTwonumbermissing {
    public static void main(String[] args) {
        int a[] = {0, 1, 3, 2, 5, 7}; // Example array with missing numbers
        int n = a.length + 2; // Since two numbers are missing, the range is [0, n]

        // Calculate expected sum for the range [0, n]
        int expectedSum = n * (n + 1) / 2;

        // Calculate actual sum from the given array
        int actualSum = 0;
        for (int num : a) {
            actualSum += num;
        }

        // Calculate the sum of the missing numbers
        int sumOfMissing = expectedSum - actualSum;

        // Calculate expected product for the range [1, n] (excluding 0)
        long expectedProduct = 1;
        for (int i = 1; i <= n; i++) {
            expectedProduct *= i;
        }

        // Calculate actual product from the given array (excluding 0)
        long actualProduct = 1;
        for (int num : a) {
            if (num != 0) {
                actualProduct *= num;
            }
        }

        // Calculate the product of the missing numbers
        long productOfMissing = expectedProduct / actualProduct;

        // Solve the quadratic equation: x^2 - (sumOfMissing)x + productOfMissing = 0
        int discriminant = (int) Math.sqrt(sumOfMissing * sumOfMissing - 4 * productOfMissing);
        int x = (sumOfMissing + discriminant) / 2;
        int y = (sumOfMissing - discriminant) / 2;

        System.out.println("The missing numbers are " + x + " and " + y);
    }
}
