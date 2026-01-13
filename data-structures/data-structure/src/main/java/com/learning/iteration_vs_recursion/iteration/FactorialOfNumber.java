package com.learning.iteration_vs_recursion.iteration;

import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number for Factorial ? ");
        int number = scanner.nextInt();

        // validation
        if (number <= 0) {
            System.out.println("Please provide valid number (number > 0)");
            return;
        }

        // Execution
        int factOfNumberUsingForLoop = factOfNumberUsingForLoop(number);
        System.out.println("fact(" + number + ") = " + factOfNumberUsingForLoop);

        int factOfNumberUsingWhileLoop = factOfNumberUsingWhileLoop(number);
        System.out.println("fact(" + number + ") = " + factOfNumberUsingWhileLoop);
    }

    private static int factOfNumberUsingWhileLoop(int number) {
        int fact = 1;

        if (number == 1)
            return 1;

        while (number > 1) {
            fact *= number--;
        }

        return fact;
    }

    private static int factOfNumberUsingForLoop(int number) {
        int fact = 1;

        if (number == 1)
            return fact;

        for (int index = 2; index <= number; index++) {
            fact *= index;
        }

        return fact;
    }
}