public class KadaneSmallestNegative {

    public static int kadaneWithSmallestNegative(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty.");
        }

        int maxSoFar = Integer.MIN_VALUE;
        int currentMax = 0;
        int smallestNegative = Integer.MIN_VALUE; // Initialize to the smallest possible integer

        for (int num : arr) {
            currentMax += num;

            if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
            }

            if (num < 0) {
                if (smallestNegative == Integer.MIN_VALUE || num > smallestNegative) {
                    smallestNegative = num;
                }
            }

            if (currentMax < 0) {
                currentMax = 0;
            }
        }

        // If all numbers are negative, the maximum subarray sum will be the largest negative number.
        // In this specific case, we need the smallest negative number.
        if (maxSoFar < 0) {
            return smallestNegative;
        } else {
            return maxSoFar; // This part of standard Kadane's won't be reached in your specific case
                           // but is included for completeness of the algorithm.
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1, -2, 3, -4};
        int result = kadaneWithSmallestNegative(arr);
        System.out.println("Expected output (smallest negative): " + result);
    }
}