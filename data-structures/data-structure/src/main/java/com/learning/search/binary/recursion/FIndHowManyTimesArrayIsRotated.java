package com.learning.search.binary.recursion;

public class FIndHowManyTimesArrayIsRotated {

    public static void main(String[] args) {
//        int[] array = {15, 18, 2, 3, 6, 12};
//        int[] array = {4, 5, 6, 7, 0, 1, 2};
        int[] array = {0, 1, 2};

        System.out.println("Input array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int low = 0, high = array.length - 1;
        int rotationCount = findRotationCount(low, high, array);
        System.out.println("Rotation Count = " + rotationCount);
    }

    private static int findRotationCount(int low, int high, int[] array) {
        int mid = low + (high - low) / 2;

        // Terminal Condition
        if (mid == array.length)
            return -1;

        if (array[mid] > array[high] && array[mid] > array[mid + 1])
            return mid;
        else
            return findRotationCount(mid + 1, high, array);
    }

}
