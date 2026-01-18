package com.learning.iteration_vs_recursion.recursion;

import java.util.Scanner;

public class NumberSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        System.out.println("Input entered :: " + number);

        if (number <= 0) {
            System.out.println("Please enter the valid number");
            return;
        }

        System.out.println("Number in Ascending Order");
        numberSequenceInAsc(number);
        System.out.println();

        System.out.println("Number in Descending Order");
        numberSequenceInDsc(number);
        System.out.println();
    }

    private static void numberSequenceInAsc(int n) {
        if (n <= 0)
            return;

        numberSequenceInAsc(n - 1);
        System.out.print(n + " ");
    }

    private static void numberSequenceInDsc(int n) {
        if (n <= 0)
            return;

        System.out.print(n + " ");
        numberSequenceInDsc(n - 1);
    }
}
