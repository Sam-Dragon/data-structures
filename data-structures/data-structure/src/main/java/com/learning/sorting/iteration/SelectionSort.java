package com.learning.sorting.iteration;

public class SelectionSort {

    static int swapCount = 0;

    public static void main(String[] args) {
        System.out.println("Input Array");
        int[] array = {4, 6, 2, 9, 3, 1, 5, 8, 7};
//        int[] array = {-4, -6, -2, -3, -1, -9, 0};
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();

        // Validation

        System.out.println("Output Array");
        int[] outputArray = selectionSort(array);
        for (int i : outputArray) {
            System.out.print(i + ", ");
        }
        System.out.println("\n");

        System.out.println("For " + array.length + " elements, Swap Count = " + swapCount);
    }

    private static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                // Find Max element
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap with maxIndex element
            if(array[maxIndex] > array[i]) {
                var temp = array[i];
                array[i] = array[maxIndex];
                array[maxIndex] = temp;
                swapCount++;
            }
        }

        return array;
    }
}
