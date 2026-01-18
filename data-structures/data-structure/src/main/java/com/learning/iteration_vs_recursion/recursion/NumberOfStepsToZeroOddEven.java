package com.learning.iteration_vs_recursion.recursion;

import java.util.Scanner;

public class NumberOfStepsToZeroOddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        System.out.println("Input entered :: " + number);

        int count = 0;
        int numberOfSteps = numberOfSteps(number, count);
        System.out.println("steps(" + number + ") = " + numberOfSteps);
    }

    private static int numberOfSteps(int number, int count) {
        if (number == 0)
            return count;

        if (number % 2 == 0) {
            number = number / 2;
        } else {
            number = number - 1;
        }

        return numberOfSteps(number, count + 1);
    }
}
