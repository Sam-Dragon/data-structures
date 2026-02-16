package com.learning.sorting.recursion;

public class BubbleSort {

    public static void main(String[] args) {
        System.out.println("Input Array");
        int[] array = {4, 6, 2, 3, 1, 9, 0};
//        int[] array = {-4, -6, -2, -3, -1, -9, 0};
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();

        // Validation

        System.out.println("Output Array");
        int[] outputArray = bubbleSort(0, array.length - 1, array);
        for (int i : outputArray) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    private static int[] bubbleSort(int row, int col, int[] array) {
        // Terminal condition
        if (col == 0)
            return array;

        // Swap Condition - Change for Desc
        if (array[row] > array[col]) {
            var temp = array[row];
            array[row] = array[col];
            array[col] = temp;
        }

        if (row < col) {
            // Initial Condition
            bubbleSort(row + 1, col, array);
        } else {
            // Reset Condition
            bubbleSort(0, col - 1, array);
        }

        return array;
    }
}
