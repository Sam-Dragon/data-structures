package com.learning.iteration_vs_recursion.recursion;

import java.util.Scanner;

public class SumOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number For Sum");
        int number = sc.nextInt();
        System.out.println("Entered Number for Sum = " + number);

        if(number <= 0) {
            System.out.println("Please provide valid number (number > 0)");
            return;
        }

        int sumOfNumber = sum(number);
        System.out.println("Sum of first (" + number + ") natural number = " + sumOfNumber);
    }

    private static int sum(int number) {
        if (number == 1)
            return 1;

        return number + sum(number - 1);
    }
}
