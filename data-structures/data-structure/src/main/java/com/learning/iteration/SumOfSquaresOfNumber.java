package com.learning.iteration;

import java.util.Scanner;

public class SumOfSquaresOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number for Square Sum ? ");
        int number = scanner.nextInt();

        // validation
        if (number <= 0) {
            System.out.println("Please provide valid number (number > 0)");
            return;
        }

        // Execution
        int sumOfSquaresOfNumberUsingForLoop = sumOfSquaresOfNumberUsingForLoop(number);
        System.out.println("square sum(" + number + ") = " + sumOfSquaresOfNumberUsingForLoop);

        int sumOfSquaresOfNumberUsingWhileLoop = sumOfSquaresOfNumberUsingWhileLoop(number);
        System.out.println("square sum(" + number + ") = " + sumOfSquaresOfNumberUsingWhileLoop);
    }

    private static int sumOfSquaresOfNumberUsingWhileLoop(int number) {
        int sum = 0;

        while (number > 0) {
            sum += (number * number);
            number--;
        }

        return sum;
    }

    private static int sumOfSquaresOfNumberUsingForLoop(int number) {
        int sum = 0;

        for (int index = 1; index <= number; index++) {
            sum += (index * index);
        }

        return sum;
    }
}