package com.learning.search.binary.recursion;

public class PeakElementInMountainArray {

    public static void main(String[] args) {
        int[] array;
//        array = new int[]{0, 1, 0};
//        array = new int[]{0, 2, 1, 0};
//        array = new int[]{0, 10, 5, 2};
        array = new int[]{3, 4, 5, 1};
//        array = new int[]{0, 2, 4};

        System.out.println("Input Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int low = 0, high = array.length - 1;
        System.out.println("Peak Index of Mountain Array");
        int peakIndex = peakIndexOfMountain(low, high, array);
        System.out.println("Peak Index = " + peakIndex);
    }

    private static int peakIndexOfMountain(int low, int high, int[] array) {
        int mid = low + (high - low) / 2;

        // Terminal Condition
        if (mid == array.length)
            return -1;

        if (array[mid] > array[high] && array[mid] > array[mid + 1])
            return array[mid];
        else
            return peakIndexOfMountain(mid + 1, high, array);
    }
}
