package com.learning.iteration_vs_recursion.recursion;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        System.out.println("Input entered :: " + number);

        int sumOfDigitsOfNumber = sumOfDigitsOfNumber(number);
        System.out.println("Sum(" + number + ") = " + sumOfDigitsOfNumber);
    }

    private static int sumOfDigitsOfNumber(int number) {
        if (number / 10 == number) {
            return number;
        }

        int quotient = (number % 10);
        int reminder = number / 10;
//        System.out.println(quotient + ", " + reminder);

        return quotient + sumOfDigitsOfNumber(reminder);
    }
}
