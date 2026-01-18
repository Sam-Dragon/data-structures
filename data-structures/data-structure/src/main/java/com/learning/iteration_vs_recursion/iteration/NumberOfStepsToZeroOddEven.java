package com.learning.iteration_vs_recursion.iteration;

import java.util.Scanner;

public class NumberOfStepsToZeroOddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        System.out.println("Input entered :: " + number);

        int numberOfSteps = numberOfStepsUsingForLoop(number);
        System.out.println("steps(" + number + ") = " + numberOfSteps);

        int numberOfStepsUsingWhileLoop = numberOfStepsUsingWhileLoop(number);
        System.out.println("steps(" + number + ") = " + numberOfStepsUsingWhileLoop);
    }

    private static int numberOfStepsUsingWhileLoop(int number) {
        int count = 0;

        while (number > 0) {
            number = number % 2 == 0 ? number / 2 : number - 1;
            count++;
        }

        return count;
    }

    private static int numberOfStepsUsingForLoop(int number) {
        int count = 0;

        for (; ; ) {
            number = number % 2 == 0 ? number / 2 : number - 1;
            count++;

            if (number == 0)
                break;
        }

        return count;
    }
}
