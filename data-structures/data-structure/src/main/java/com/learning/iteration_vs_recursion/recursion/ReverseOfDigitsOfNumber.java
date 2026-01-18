package com.learning.iteration_vs_recursion.recursion;

import java.util.Scanner;

public class ReverseOfDigitsOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        System.out.println("Input entered :: " + number);

        int sum = 0;
        int reversedNumber = reverse(number, sum);
        System.out.println(reversedNumber);
    }

    /*
     * input = 123
     *
     * rem = 123 % 10 = 3
     * sum = (0 * 10) + 3 = 3 ---> send to next iteration
     *
     * mod = 12 % 10 = 2
     * sum = (3 * 10) + 2 = 32 ---> send to next iteration
     *
     * mod = 1 % 10 = 1
     * sum = (32 * 10) + 1 = 321 ---> send to next iteration
     * */

    private static int reverse(int number, int sum) {
        if (number == 0)
            return sum;

        int rem = (number % 10);
        sum = sum * 10 + rem; // sum = (n % 10) * 10 + (n * 10)

        return reverse(number / 10, sum);
    }
}
