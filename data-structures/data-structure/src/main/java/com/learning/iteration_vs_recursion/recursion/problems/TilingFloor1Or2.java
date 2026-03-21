package com.learning.iteration_vs_recursion.recursion.problems;

import java.util.Scanner;

public class TilingFloor1Or2 {

    public static void main(String[] args) {
        System.out.println("Enter the number for tilling upto 2 floor");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Entered number = " + number);

        int fib = tilling(number);
        System.out.println("tilling(" + number + ")=" + fib);
    }

    private static int tilling(int number) {
        if (number < 2)
            return 1;

        int left = tilling(number - 1);
//        System.out.println("left(" + (number - 1) + ")=" + left);

        int right = tilling(number - 2);
//        System.out.println("right(" + (number - 2) + ")=" + right);

        return right + left;
    }
}
