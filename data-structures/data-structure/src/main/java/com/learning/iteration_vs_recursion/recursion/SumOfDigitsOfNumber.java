package com.learning.iteration_vs_recursion.recursion;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        System.out.println("Input entered :: " + number);

        System.out.println("Forward Sequence");
        int sum = forwardDigitsSum(number);
        System.out.println("Digits Sum (" + number + ") = " + sum);

        System.out.println("Backward Sequence");
        sum = backwardDigitsSum(number);
        System.out.println("Digits Sum (" + number + ") = " + sum);
    }

    private static int forwardDigitsSum(int n) {
        if (n == 0)
            return n;

        return n % 10 + forwardDigitsSum(n / 10);
    }

    private static int backwardDigitsSum(int n) {
        if (n == 0)
            return n;

        return backwardDigitsSum(n / 10) + n % 10;
    }
}
