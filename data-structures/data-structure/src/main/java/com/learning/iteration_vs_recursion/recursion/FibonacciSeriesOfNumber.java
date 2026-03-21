package com.learning.iteration_vs_recursion.recursion;

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

        int fibonacciSeriesTotal = fib(number);
        System.out.println("fib(" + number + ") = " + fibonacciSeriesTotal);
        System.out.println("Iteration Count :: " + iterations);

        fibonacciSeriesTotal = fib2(number);
        System.out.println("fib(" + number + ") = " + fibonacciSeriesTotal);

        fibonacciSeriesTotal = fib2_order(number);
        System.out.println("fib(" + number + ") = " + fibonacciSeriesTotal);
    }

    private static int fib(int number) {
        iterations++;

        if (number < 2)
            return number;

        return fib(number - 1) + fib(number - 2);
    }

    private static int fib2(int number) {
        if (number < 2)
            return 1;

        int left = fib2(number - 1);
//        System.out.println("left(" + (number - 1) + ")=" + left);

        int right = fib2(number - 2);
//        System.out.println("right(" + (number - 2) + ")=" + right);

        return right + left;
    }

    private static int fib2_order(int number) {
        if (number < 2)
            return 1;

        int left = fib2_order(number - 2);
//        System.out.println("left(" + (number - 1) + ")=" + left);

        int right = fib2_order(number - 1);
//        System.out.println("right(" + (number - 2) + ")=" + right);

        return right + left;
    }
}
