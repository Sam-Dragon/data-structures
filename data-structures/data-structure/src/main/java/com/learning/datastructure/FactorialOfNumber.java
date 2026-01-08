package com.learning.datastructure;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number for Factorial ? ");
        int number = scanner.nextInt();

        int fact = factOfNumber(number);
        System.out.println("fact(" + number + ") = " + fact);
    }

    private static int factOfNumber(int number) {
        if (number == 1)
            return 1;

        return number * factOfNumber(number - 1);
    }
}