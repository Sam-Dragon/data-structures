package com.learning.iteration_vs_recursion.recursion;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number for Factorial ? ");
        int number = scanner.nextInt();

        if(number < 0) {
            System.out.println("Please enter the valid number");
            return;
        }

        int fact = factOfNumber(number);
        System.out.println("fact(" + number + ") = " + fact);
    }

    private static int factOfNumber(int number) {
        if (number <= 0)
            return 1;

        return number * factOfNumber(number - 1);
    }
}