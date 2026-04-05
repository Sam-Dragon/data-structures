package com.learning.tow_pointers;

import java.util.Scanner;

public class CheckIfStringIsPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();
        System.out.println("Entered String = " + input);

        // Validation
        if (input.trim()
                 .isEmpty()) {
            System.out.println("Please provide valid string");
            return;
        }

        boolean result = checkIfStringIsPalindrome(input);
        System.out.println("is input string = " + input + ", palindrome ? " + result);
    }

    private static boolean checkIfStringIsPalindrome(String input) {
        int low = 0, high = input.length() - 1;
        while (low <= high) {
            if (input.charAt(low) != input.charAt(high))
                return false;

            low++;
            high--;
        }

        return true;
    }
}
