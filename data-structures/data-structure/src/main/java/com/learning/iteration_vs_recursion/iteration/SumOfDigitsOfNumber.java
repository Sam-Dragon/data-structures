package com.learning.iteration_vs_recursion.iteration;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        System.out.println("Input entered :: " + number);

        int sumOfDigitsOfNumber = sumOfDigitsOfNumberForLoop(number);
        System.out.println("Sum(" + number + ") = " + sumOfDigitsOfNumber);

        int sumOfDigitsOfNumberWhileLoop = sumOfDigitsOfNumberWhileLoop(number);
        System.out.println("Sum(" + number + ") = " + sumOfDigitsOfNumberWhileLoop);
    }

    private static int sumOfDigitsOfNumberForLoop(int number) {
        int sum = 0;

        for (;;) {
            int modulo = number % 10;
            sum += modulo;

            number = number / 10;

            if (number / 10 == number) {
                break;
            }
        }

        return sum;
    }

    private static int sumOfDigitsOfNumberWhileLoop(int number) {
        int sum = 0;

        while (number / 10 != number) {
            int modulo = number % 10;
            sum += modulo;

            number = number / 10;
        }

        return sum;
    }
}
