package com.learning.iteration_vs_recursion.iteration;

import java.util.Scanner;

public class ReverseOfDigitsOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        System.out.println("Input entered :: " + number);

        int reverseOfDigitsOfNumberForLoop = reverseOfDigitsOfNumberForLoop(number);
        System.out.println(reverseOfDigitsOfNumberForLoop);

        int reverseOfDigitsOfNumberWhileLoop = reverseOfDigitsOfNumberWhileLoop(number);
        System.out.println(reverseOfDigitsOfNumberWhileLoop);
    }

    private static int reverseOfDigitsOfNumberForLoop(int number) {
        int sum = 0;

        for (; ; ) {
            int rem = number % 10;
            sum = sum * 10 + rem;

            number = number / 10;

            if (number == 0) {
                break;
            }
        }

        return sum;
    }

    private static int reverseOfDigitsOfNumberWhileLoop(int number) {
        int sum = 0;

        while (number > 0) {
            int rem = number % 10;
            sum = sum * 10 + rem;

            number = number / 10;
        }

        return sum;
    }
}
