package com.learning.iteration_vs_recursion.iteration;

import java.util.Scanner;

public class PrintingStars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for printing stars");
        int number = sc.nextInt();
        System.out.println("Number entered = " + number);

        printStars(number);
    }

    private static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

}
