package com.learning.sorting.iteration;

public class BubbleSort {

    static int swapCount = 0;

    public static void main(String[] args) {
        System.out.println("Input Array");
        int[] array = {4, 6, 2, 9, 3, 1, 5, 8, 7};
//        int[] array = {-4, -6, -2, -3, -1, -9, 0};
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.println("Output Array");
        int[] outputArray = bubbleSort(array);
        for (int i : outputArray) {
            System.out.print(i + ", ");
        }
        System.out.println("\n");

        System.out.println("For " + array.length + " elements, Swap Count = " + swapCount);
    }

    private static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                // Swap Condition - Change for Desc
                if (array[j] > array[i]) {
                    swapCount++;
                    var temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
