package com.learning.iteration_vs_recursion.recursion.bad_use_cases;

import java.util.Scanner;

public class ReverseTheNumber {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Entered number = " + number);

        boolean isSame = reverseTheNumber(number);
        System.out.println("Is reversed [" + number + "] ? " + isSame);
    }

    private static boolean reverseTheNumber(int number) {
        int reversed = reverseNum(0, number);
        System.out.println("reversed = " + reversed);

        return reversed == number;
    }

    private static int reverseNum(int sum, int number) {
        if (number == 0)
            return sum;

        sum = sum * 10 + (number % 10); // 0 * 10 + 1 = 1, 1 * 10 + 2 = 12, 12
        return reverseNum(sum, number / 10);
    }
}
