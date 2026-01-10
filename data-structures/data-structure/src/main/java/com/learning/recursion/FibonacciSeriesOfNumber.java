package com.learning.recursion;

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

        int fibonacciSeriesTotal = fib(number);
        System.out.println("fib(" + number + ") = " + fibonacciSeriesTotal);
    }

    private static int fib(int number) {
        if (number < 2)
            return number;

        return fib(number - 1) + fib(number - 2);
    }
}
