package com.learning.iteration_vs_recursion.recursion.dynamic_programming.bottom_up_approach;

import java.util.Scanner;

public class FibonacciSeriesOfNumber {

    static int iterations = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for fibonacci series");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please provide Valid Number");
            return;
        }

        if (number <= 2) {
            System.out.println("0");
            if (number == 2)
                System.out.println("1");
            return;
        }

        int[] array = new int[number + 1];

        int fibonacciSeriesTotal = fib(number, array);
        System.out.println("fib(" + number + ") = " + fibonacciSeriesTotal);
        System.out.println("Total Iterations :: " + iterations);
    }

    private static int fib(int number, int[] array) {
        array[0] = 0;
        array[1] = 1;
        int sum = 0;

        for (int i = 2; i <= number; i++) {
            iterations++;
            sum = array[i - 1] + array[i - 2];
            array[i] = sum;
        }

        return array[number];
    }
}
