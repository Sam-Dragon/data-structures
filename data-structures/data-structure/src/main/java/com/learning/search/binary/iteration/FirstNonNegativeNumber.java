package com.learning.search.binary.iteration;

public class FirstNonNegativeNumber {

    public static void main(String[] args) {
        int[] array = {-21, -15, -9, -5, -5, -1, -1, 0, 0, 4, 7, 12, 21};
//        int[] array = {};
        System.out.println("Input Array");
        for (int i : array)
            System.out.print(i + ", ");
        System.out.println();

        int low = 0, high = array.length - 1;
        int nonNegativeInteger = findFirstNonNegativeNumber(low, high, array);
        System.out.println("First Non Negative Number = " + nonNegativeInteger);
    }

    private static int findFirstNonNegativeNumber(int low, int high, int[] array) {
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Main Condition
            if (array[mid - 1] < 0 && array[mid] >= 0)
                return array[mid];

            // Iteration
            if (array[mid] > 0)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return result;
    }
}
