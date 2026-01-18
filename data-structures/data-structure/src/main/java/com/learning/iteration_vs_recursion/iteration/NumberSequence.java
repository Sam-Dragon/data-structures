package com.learning.iteration_vs_recursion.iteration;

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
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    private static void numberSequenceInDsc(int n) {
        for (int i = n; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}
