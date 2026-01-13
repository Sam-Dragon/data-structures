package com.learning.iteration;

import java.util.Scanner;

public class SumOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number for Sum ? ");
        int number = scanner.nextInt();

        // validation
        if (number <= 0) {
            System.out.println("Please provide valid number (number > 0)");
            return;
        }

        // Execution
        int sumOfNumberUsingForLoop = sumOfNumberUsingForLoop(number);
        System.out.println("sum(" + number + ") = " + sumOfNumberUsingForLoop);

        int sumOfNumberUsingWhileLoop = sumOfNumberUsingWhileLoop(number);
        System.out.println("sum(" + number + ") = " + sumOfNumberUsingWhileLoop);
    }

    private static int sumOfNumberUsingWhileLoop(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number;
            number--;
        }

        return sum;
    }

    private static int sumOfNumberUsingForLoop(int number) {
        int sum = 0;

        for (int index = 1; index <= number; index++) {
            sum += index;
        }

        return sum;
    }
}