package com.learning.sorting.recursion;

public class InsertionSort {

    public static void main(String[] args) {
        System.out.println("Input Array");
//        int[] array = {4, 6, 2, 3, 1, 9, 0};
//        int[] array = {-4, -6, -2, -3, -1, -9, 0};
        int[] array = {5, 1, 2};

        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();

        // Validation

        System.out.println("Output Array");
        int[] outputArray = insertionSort(0, array.length - 1, array);
        for (int i : outputArray) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    private static int[] insertionSort(int row, int col, int[] array) {

        // Terminal Condition
        if (row > array.length - 1)
            return array;

        // Swap Function
        if (array[row] > array[col]) {
            var temp = array[row];
            array[row] = array[col];
            array[col] = temp;
        }

        if (row < col && col > array.length - 1)
            return insertionSort(row, row + 1, array);
        else
            return insertionSort(row + 1, 0, array);
    }

}
