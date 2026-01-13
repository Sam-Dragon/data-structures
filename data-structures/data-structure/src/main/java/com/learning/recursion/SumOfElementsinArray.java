package com.learning.recursion;

import java.util.Arrays;

public class SumOfElementsinArray {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Arrays.stream(array)
              .boxed()
              .forEach(System.out::println);

        // Execution
        int arraySum = sumOfArray(array.length - 1, array);
        System.out.println("sum = " + arraySum);
    }

    private static int sumOfArray(int length, int[] numbers) {
        if (length == 0)
            return numbers[0];

        return numbers[length] + sumOfArray(length - 1, numbers);
    }

}
