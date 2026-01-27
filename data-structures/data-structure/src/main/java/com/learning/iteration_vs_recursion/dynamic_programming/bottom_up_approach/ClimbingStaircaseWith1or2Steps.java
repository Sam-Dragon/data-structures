package com.learning.iteration_vs_recursion.dynamic_programming.bottom_up_approach;

import java.util.Scanner;

public class ClimbingStaircaseWith1or2Steps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int input = sc.nextInt();

        int result = new ClimbingStaircaseWith1or2Steps().climbStairs(input);
        System.out.println(result);
    }

    public int climbStairs(int n) {
        if (n < 1 || n > 45) {
            System.out.println("invalid input");
            return -1;
        }

        int[] array = new int[n + 1];
        return test(n, array);
    }

    private int test(int n, int[] array) {
        if (n < 2) {
            array[n] = 1;
            return array[n];
        }

        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array[n];
    }
}
