package com.learning.iteration_vs_recursion.recursion.bad_use_cases;

import java.util.Scanner;

public class SumOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number For Sum");
        int number = sc.nextInt();
        System.out.println("Entered Number for Sum = " + number);

        if (number <= 0) {
            System.out.println("Please provide valid number (number > 0)");
            return;
        }

        System.out.println("Backward Sequence");
        int sum = backwardSum(number);
        System.out.println("Sum of first (" + number + ") natural number = " + sum);

        System.out.println("Forward Sequence");
        sum = forwardSum(number);
        System.out.println("Sum of first (" + number + ") natural number = " + sum);
    }
    private static int backwardSum(int n) {
        if (n == 1)
            return 1;

        return n + backwardSum(n - 1);
    }

    private static int forwardSum(int n) {
        if (n == 1)
            return 1;

        return forwardSum(n - 1) + n;
    }

}
