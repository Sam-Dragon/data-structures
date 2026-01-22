package com.learning.iteration_vs_recursion.iteration;

import java.util.Arrays;

public class CheckIfArrayIsSorted {

    public static void main(String[] args) {

//        int[] array1 = {1, 2, 3, 5, 6, 8, 9};
        int[] array1 = {1, 2, 3, 5, 16, 8, 9};
        System.out.println("Array Elements :: ");
        Arrays.stream(array1)
              .boxed()
              .forEach(e -> System.out.print(e + ","));
        System.out.println();

        CheckIfArrayIsSorted checkIfArrayIsSorted = new CheckIfArrayIsSorted();

        // For Loop
        boolean isArraySortedUsingForLoop = checkIfArrayIsSorted.isArraySortedUsingForLoop(array1);
        System.out.println("Is Array Sorted :: " + isArraySortedUsingForLoop);

        // While Loop
        boolean isArraySortedUsingWhileLoop = checkIfArrayIsSorted.isArraySortedUsingWhileLoop(array1);
        System.out.println("Is Array Sorted :: " + isArraySortedUsingWhileLoop);
    }

    private boolean isArraySortedUsingWhileLoop(int[] array) {
        int index = 0;
        while (index < array.length - 1) {
            if (array[index] > array[index + 1])
                return false;

            index++;
        }

        return true;
    }

    private boolean isArraySortedUsingForLoop(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
