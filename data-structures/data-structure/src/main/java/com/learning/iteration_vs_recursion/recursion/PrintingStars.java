package com.learning.iteration_vs_recursion.recursion;

import java.util.Scanner;

public class PrintingStars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for printing stars");
        int number = sc.nextInt();
        System.out.println("Number entered = " + number);

//        System.out.println("Reverse Triangle");
//        printReverseTriangleStars(number, 0);
//        System.out.println();
//        printReverseTriangleStars2(0, number);

        System.out.println("Normal Triangle");
        printNormalTriangleStars(0, number);
    }


    private static void printNormalTriangleStars(int row, int col) {
        // Terminal Condition
        if (col == 0)
            return;

        if (row < col) {
            // Initial Condition
            printNormalTriangleStars(row + 1, col);
            System.out.print(" * ");
        } else {
            // Reset Condition
            printNormalTriangleStars(0, col - 1);
            System.out.println();
        }
    }

    private static void printReverseTriangleStars(int row, int col) {
        // Terminal Condition
        if (col == 0)
            return;

        if (row < col) {
            // Initial Condition
            System.out.print(" * ");
            printReverseTriangleStars(row + 1, col);
        } else {
            // Reset Condition
            System.out.println();
            printReverseTriangleStars(0, col - 1);
        }
    }

    private static void printReverseTriangleStars2(int row, int col) {
        // Terminal Condition
        if (row == 0)
            return;

        if (row > col) {
            // Initial Condition
            System.out.print(" * ");
            printReverseTriangleStars2(row, col + 1);
        } else {
            // Reset Condition
            System.out.println();
            printReverseTriangleStars2(row - 1, 0);
        }
    }


}
