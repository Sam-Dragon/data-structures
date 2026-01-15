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
    }

    private static int fib(int number) {
        iterations++;

        if (number < 2)
            return number;

        return fib(number - 1) + fib(number - 2);
    }
}
