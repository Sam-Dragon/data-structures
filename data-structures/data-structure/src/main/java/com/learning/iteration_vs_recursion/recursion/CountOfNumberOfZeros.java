package com.learning.iteration_vs_recursion.recursion;

import java.util.Scanner;

public class CountOfNumberOfZeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        System.out.println("Input entered :: " + number);

        int counter = 0;
        int count = count(number, counter);
        System.out.println(count);
    }

    private static int count(int number, int counter) {
        // Terminal Condition
        if (number == 0)
            return counter;

        if (number % 10 == 0)
            counter = counter + 1;

        return count(number / 10, counter);
    }

}
