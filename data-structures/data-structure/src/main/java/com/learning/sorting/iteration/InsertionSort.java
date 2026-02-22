package com.learning.sorting.iteration;

public class InsertionSort {

    static int swapCount = 0;
    static int iterationCount = 0;

    public static void main(String[] args) {
        System.out.println("Input Array");
        int[] array = {4, 6, 2, 9, 3, 1, 5, 8, 7};
//        int[] array = {-4, -6, -2, -3, -1, -9, 0};
//        int[] array = {};

        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();

        if (array.length < 1) {
            System.out.println("Invalid array");
            return;
        }

        System.out.println("Output Array");
        int[] outputArray = insertionSort(array);
        for (int i : outputArray) {
            System.out.print(i + ", ");
        }
        System.out.println("\n");

        System.out.println(
                "For " + array.length + " elements, Swap Count = " + swapCount + ", iteration count = " + iterationCount);
    }

    private static int[] insertionSort(int[] array) {
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                iterationCount++;
                // Swap Condition - Change for Desc
                // Compare with first element only
                if (array[j] > array[j - 1]) {
                    swapCount++;
                    var temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        return array;
    }

}
