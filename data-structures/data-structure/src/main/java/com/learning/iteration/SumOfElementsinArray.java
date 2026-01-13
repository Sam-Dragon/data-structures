package com.learning.iteration;

import java.util.Arrays;

public class SumOfElementsinArray {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Arrays.stream(array)
              .boxed()
              .forEach(System.out::println);

        // Execution
        int sumOfArrayUsingForLoop = sumOfArrayUsingForLoop(array);
        System.out.println("sum = " + sumOfArrayUsingForLoop);

        int sumOfArrayUsingWhileLoop = sumOfArrayUsingWhileLoop(array);
        System.out.println("sum = " + sumOfArrayUsingWhileLoop);
    }

    private static int sumOfArrayUsingWhileLoop(int[] numbers) {
        int sum = 0;
        int length = numbers.length - 1;

        while (length >= 0) {
            sum += numbers[length];
            length--;
        }

        return sum;
    }

    private static int sumOfArrayUsingForLoop(int[] numbers) {
        int sum = 0;

        for (int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
        }

        return sum;
    }

}
