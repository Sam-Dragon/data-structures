package com.learning.iteration_vs_recursion.recursion.bad_use_cases;

import java.util.Arrays;

public class SumOfElementsinArray {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Arrays.stream(array)
              .boxed()
              .forEach(System.out::println);

        // Execution
        int arraySum = forwardSum(array.length - 1, array);
        System.out.println("forward sum = " + arraySum);

        arraySum = backwardSum(array.length - 1, array);
        System.out.println("backward sum = " + arraySum);
    }

    private static int forwardSum(int length, int[] numbers) {
        if (length == 0)
            return numbers[0];

        return numbers[length] + forwardSum(length - 1, numbers);
    }

    private static int backwardSum(int length, int[] numbers) {
        if (length == 0)
            return numbers[0];

        return backwardSum(length - 1, numbers) + numbers[length];
    }
}
