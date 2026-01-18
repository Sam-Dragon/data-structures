package com.learning.iteration_vs_recursion.iteration;

import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number for Factorial ? ");
        int number = scanner.nextInt();

        // validation
        if (number < 0) {
            System.out.println("Please provide valid number");
            return;
        }

        // Execution
        int factOfNumberUsingForLoopAsc = factOfNumberUsingForLoopAsc(number);
        System.out.println("fact(" + number + ") = " + factOfNumberUsingForLoopAsc);

        int factOfNumberUsingForLoopDsc = factOfNumberUsingForLoopDsc(number);
        System.out.println("fact(" + number + ") = " + factOfNumberUsingForLoopDsc);

        // Execution
        int factOfNumberUsingWhileLoopAsc = factOfNumberUsingWhileLoopAsc(number);
        System.out.println("fact(" + number + ") = " + factOfNumberUsingWhileLoopAsc);

        int factOfNumberUsingWhileLoopDsc = factOfNumberUsingWhileLoopDsc(number);
        System.out.println("fact(" + number + ") = " + factOfNumberUsingWhileLoopDsc);
    }

    private static int factOfNumberUsingWhileLoopDsc(int number) {
        int fact = 1;

        while (number > 0) {
//            System.out.print(number + " ");
            fact *= number;
            number--;
        }

        return fact;
    }

    private static int factOfNumberUsingWhileLoopAsc(int number) {
        int fact = 1, index = 1;

        while (index <= number) {
//            System.out.print(index + " ");
            fact *= index;
            index++;
        }

        return fact;
    }

    private static int factOfNumberUsingForLoopAsc(int number) {
        int fact = 1;

        if (number <= 0)
            return fact;

        while (number > 1) {
            fact *= number--;
        }

        return fact;
    }

    private static int factOfNumberUsingForLoopDsc(int number) {
        int fact = 1;

        if (number == 1)
            return fact;

        for (int index = 2; index <= number; index++) {
            fact *= index;
        }

        return fact;
    }
}