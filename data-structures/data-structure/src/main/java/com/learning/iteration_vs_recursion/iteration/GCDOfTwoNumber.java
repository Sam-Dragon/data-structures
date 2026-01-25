package com.learning.iteration_vs_recursion.iteration;

import java.util.Scanner;

public class GCDOfTwoNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("GCD of Two Number");

        System.out.println("Enter the First Number");
        int first = sc.nextInt();

        System.out.println("Enter the Second Number");
        int second = sc.nextInt();

        int gcdOfTwoNumber = gcdOfTwoNumberUsingForLoop(first, second);
        System.out.println("GCD(" + first + "," + second + ")=" + gcdOfTwoNumber);

        gcdOfTwoNumber = gcdOfTwoNumberUsingWhileLoop(first, second);
        System.out.println("GCD(" + first + "," + second + ")=" + gcdOfTwoNumber);
    }

    private static int gcdOfTwoNumberUsingForLoop(int first, int second) {
        if (second == 0)
            return first;

        if (first == 0)
            return second;

        for (; second > 0; ) {
            int temp = first;
            first = second;
            second = temp % first;
        }

        return first;
    }

    private static int gcdOfTwoNumberUsingWhileLoop(int first, int second) {
        if (second == 0)
            return first;

        if (first == 0)
            return second;

        while (second > 0) {
            int temp = first;
            first = second;
            second = temp % first;
        }

        return first;
    }
}
