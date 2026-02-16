package com.learning.sorting.recursion;

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
        int[] outputArray = selectionSort(array.length - 1, 0, array.length - 1, array);
        for (int i : outputArray) {
            System.out.print(i + ", ");
        }
        System.out.println("\n");

        System.out.println("For " + array.length + " elements, Swap Count = " + swapCount);
    }

    private static int[] selectionSort(int max, int row, int col, int[] array) {
        // Terminal Condition
        if (col == 0)
            return array;

        if (row < col) {
            // find the max element
            if (array[row] > array[max]) {
                max = row;
            }

            selectionSort(max, row + 1, col, array);
        } else {
            if (array[max] > array[col]) {
                var temp = array[col];
                array[col] = array[max];
                array[max] = temp;
                swapCount++;
            }

            selectionSort(col - 1, 0, col - 1, array);
        }

        return array;
    }

}
