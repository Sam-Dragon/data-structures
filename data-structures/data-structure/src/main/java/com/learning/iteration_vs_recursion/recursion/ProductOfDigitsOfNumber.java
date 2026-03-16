package com.learning.iteration_vs_recursion.recursion;

import java.util.Scanner;

public class ProductOfDigitsOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        System.out.println("Input entered :: " + number);

        System.out.println("Forward Sequence");
        int sum = forwardDigitsProduct(number);
        System.out.println("Digits Product (" + number + ") = " + sum);

        System.out.println("Backward Sequence");
        sum = backwardDigitsProduct(number);
        System.out.println("Digits Product (" + number + ") = " + sum);
    }

    private static int forwardDigitsProduct(int n) {
        if (n % 10 == n)
            return n;

        return (n % 10) * forwardDigitsProduct(n / 10);
    }

    private static int backwardDigitsProduct(int n) {
        if (n % 10 == n)
            return n;

        return backwardDigitsProduct(n / 10) * (n % 10);
    }
}
