package com.learning.iteration_vs_recursion.recursion;

import java.util.Scanner;

public class NumberSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        System.out.println("Input entered :: " + number);

        System.out.println("Backward Sequence");
        backwardSeq(number);
        System.out.println();

        System.out.println("Forward Sequence");
        forwardSeq(1, number);
    }

    private static void backwardSeq(int n) {
        if (n == 0)
            return;

        System.out.println(n); // Backward Sequence 5,4,3,2,1
        backwardSeq(n - 1);
        // System.out.println(n); // Forward Sequence 1,2,3,4,5
    }

    private static void forwardSeq(int i, int n) {
        if (i > n)
            return;

        System.out.println(i); // Forward Sequence 1,2,3,4,5
        forwardSeq(i + 1, n);
        // System.out.println(n); // Backward Sequence 5,4,3,2,1
    }

}
