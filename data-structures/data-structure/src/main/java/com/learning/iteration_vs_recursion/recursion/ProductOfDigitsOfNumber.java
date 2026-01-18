package com.learning.iteration_vs_recursion.recursion;

import java.util.Scanner;

public class ProductOfDigitsOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        System.out.println("Input entered :: " + number);
        
        int productOfDigitsOfNumber = productOfDigitsOfNumber(number);
        System.out.println("product(" + number + ") = " + productOfDigitsOfNumber);
    }

    private static int productOfDigitsOfNumber(int number) {
        if (number / 10 == number) {
            return 1;
        }

        int quotient = (number % 10);
//        System.out.println("quotient = " + quotient);
        // ADDITIONAL CHECK
        if (quotient == 0)
            return 0;

        int reminder = number / 10;
//        System.out.println(quotient + ", " + reminder);

        return quotient * productOfDigitsOfNumber(reminder);
    }
}
