package com.learning.iteration_vs_recursion.iteration;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeriesOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for fibonacci series");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please provide Valid Number");
            return;
        }


        int[] arr = new int[number + 1];
        arr[0] = 0;
        arr[1] = 1;

        int fibonacciSeriesTotalUsingForLoop = fibonacciSeriesUsingForLoop(number, arr);
        System.out.println("Series = " + Arrays.stream(arr)
                                               .boxed()
                                               .toList());
        System.out.println("fib(" + number + ") = " + fibonacciSeriesTotalUsingForLoop);

        // Re-Initialize
        arr = new int[number + 1];
        arr[0] = 0;
        arr[1] = 1;

        int fibonacciSeriesTotalUsingWhileLoop = fibonacciSeriesUsingWhileLoop(number, arr);
        System.out.println("Series = " + Arrays.stream(arr)
                                               .boxed()
                                               .toList());
        System.out.println("fib(" + number + ") = " + fibonacciSeriesTotalUsingWhileLoop);
    }

    private static int fibonacciSeriesUsingWhileLoop(int number, int[] arr) {
        int index = 2;
        while (index < number + 1) {
            arr[index] = arr[index - 1] + arr[index - 2];
            index++;
        }

        return arr[number];
    }

    private static int fibonacciSeriesUsingForLoop(int number, int[] arr) {
        for (int i = 2; i < number + 1; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[number];
    }
}
