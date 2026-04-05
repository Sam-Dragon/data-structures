package com.learning.tow_pointers;

import java.util.Scanner;

public class PalindromeStringWithLowerAndUpperCase {

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

        boolean result = palindromeMatchWithCase(input);
        System.out.println("is input string = " + input + ", palindrome ? " + result);
    }

    private static boolean palindromeMatchWithCase(String input) {
        int low = 0, high = input.length() - 1;

        while (low <= high) {
            // haDrRAHd
            if (Character.isLowerCase(input.charAt(high)))
                high--;

            if (Character.isUpperCase(input.charAt(low)))
                low++;

            if (input.charAt(low) != Character.toLowerCase(input.charAt(high)))
                    return false;

            low++;
            high--;
        }

        return true;
    }
}
