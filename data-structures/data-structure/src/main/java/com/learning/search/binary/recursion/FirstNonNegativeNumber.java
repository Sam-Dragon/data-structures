package com.learning.search.binary.recursion;

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
        // Terminal Condition
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;
        // Main Condition
        if (array[mid - 1] < 0 && array[mid] >= 0)
            return array[mid];

        // Iteration
        if (array[mid] > 0)
            return findFirstNonNegativeNumber(low, mid - 1, array);
        else
            return findFirstNonNegativeNumber(mid + 1, high, array);
    }
}
