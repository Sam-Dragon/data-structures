package com.learning.iteration_vs_recursion.recursion;

import java.util.Arrays;

public class CheckIfArrayIsSorted {

    public static void main(String[] args) {

//        int[] array = {1, 2, 3, 5, 6, 8, 9};
        int[] array = {1, 2, 3, 5, 16, 8, 9};
        System.out.println("Array Elements :: ");
        Arrays.stream(array)
              .boxed()
              .forEach(e -> System.out.print(e + ","));
        System.out.println();

        int index = 0;
        boolean isArraySorted = isArraySorted(index, array);
        System.out.println("Is Array Sorted :: " + isArraySorted);

        isArraySorted = isArraySorted2(index, array);
        System.out.println("Is Array Sorted :: " + isArraySorted);
    }

    private static boolean isArraySorted(int index, int[] array) {
//        System.out.println(index);
        if (index == array.length - 1)
            return true;

        return array[index] < array[index + 1] && isArraySorted(index + 1, array);
    }

    private static boolean isArraySorted2(int index, int[] array) {
        if (index == array.length - 1)
            return true;

        // Work on NEGATIVE CONDITION
        if (array[index] > array[index + 1]) {
            System.out.println("Indexes issue [" + index + "," + (index + 1) + "]");
            return false;
        }

        return isArraySorted2(index + 1, array);
    }
}
