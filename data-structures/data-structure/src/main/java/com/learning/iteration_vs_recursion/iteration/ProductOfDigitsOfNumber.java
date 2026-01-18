package com.learning.iteration_vs_recursion.iteration;

import java.util.Scanner;

public class ProductOfDigitsOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        System.out.println("Input entered :: " + number);

        int productOfDigitsOfNumber = productOfDigitsOfNumberForLoop(number);
        System.out.println("product(" + number + ") = " + productOfDigitsOfNumber);

        int productOfDigitsOfNumberWhileLoop = productOfDigitsOfNumberWhileLoop(number);
        System.out.println("product(" + number + ") = " + productOfDigitsOfNumberWhileLoop);
    }

    private static int productOfDigitsOfNumberForLoop(int number) {
        int product = 1;

        for (; ; ) {
            int modulo = number % 10;
            if (modulo == 0)
                return 0;

            product *= modulo;

            number = number / 10;

            if (number / 10 == number) {
                break;
            }
        }

        return product;
    }

    private static int productOfDigitsOfNumberWhileLoop(int number) {
        int product = 1;

        while (number / 10 != number) {
            int modulo = number % 10;
            if (modulo == 0)
                return 0;

            product *= modulo;

            number = number / 10;
        }

        return product;
    }
}
