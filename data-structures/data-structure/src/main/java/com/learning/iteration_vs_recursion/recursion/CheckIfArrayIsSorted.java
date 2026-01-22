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

        CheckIfArrayIsSorted checkIfArrayIsSorted = new CheckIfArrayIsSorted();

        int index = 0;
        boolean isArraySorted = checkIfArrayIsSorted.isArraySorted(array, index);
        System.out.println("Is Array Sorted :: " + isArraySorted);
    }

    private boolean isArraySorted(int[] array, int index) {
//        System.out.println(index);
        if (index == array.length - 1)
            return true;

        return array[index] < array[index + 1] && isArraySorted(array, index + 1);
    }
}
