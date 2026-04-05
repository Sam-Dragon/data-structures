package com.learning.tow_pointers;

import java.util.Scanner;

public class CheckIfNumberIsPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        System.out.println("Entered number = " + number);

        int reversed = checkIfNumberIsPalindrome(Math.abs(number));
        System.out.println("is number = " + number + ", palindrome ? " + (number == reversed));
    }

    private static int checkIfNumberIsPalindrome(int number) {
        int reversed = 0;

        while (number > 0) {
            int reminder = number % 10;
            reversed = reversed * 10 + reminder;
            number = number / 10;
        }

        return reversed;
    }
}
