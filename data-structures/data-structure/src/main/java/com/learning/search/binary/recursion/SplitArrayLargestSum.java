package com.learning.search.binary.recursion;

public class SplitArrayLargestSum {

    public static void main(String[] args) {
        int[] array = {7, 2, 5, 10, 8};

        System.out.println("Input array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int low = 0, high = array.length - 1;
        int rotationCount = findMinimumSumOfSplitArray(low, high, array, 0);
        System.out.println("Rotation Count = " + rotationCount);
    }

    private static int findMinimumSumOfSplitArray(int low, int high, int[] array, int sum) {
        int mid = low + (high - low) / 2;

        // Terminal Condition
        if (mid == array.length)
            return sum;

        if (mid < high)
            return array[mid] + findMinimumSumOfSplitArray(mid + 1, high, array, sum);
        else
            return sum + findMinimumSumOfSplitArray(0, mid - 1, array, sum);
    }

}
