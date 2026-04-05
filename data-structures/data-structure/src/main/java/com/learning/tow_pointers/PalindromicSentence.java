package com.learning.tow_pointers;

import java.util.Scanner;

public class PalindromicSentence {

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

        boolean result = checkIfSentenceIsPalindrome(input);
        System.out.println("is input string = " + input + ", palindrome ? " + result);
    }

    private static boolean checkIfSentenceIsPalindrome(String input) {
        int low = 0, high = input.length() - 1;
        boolean isCharacterPresent = false;

        while (low <= high) {
            if (isSpecialCharacter(input.charAt(low))) {
                low++;
                continue;
            }

            if (isSpecialCharacter(input.charAt(high))) {
                high--;
                continue;
            }

            if (Character.toLowerCase(input.charAt(low)) != Character.toLowerCase(input.charAt(high))) {
                return false;
            }

            isCharacterPresent = true;
            low++;
            high--;
        }

        return isCharacterPresent;
    }

    private static boolean isSpecialCharacter(char c) {
        return c == '\'' | c == '"' | c == '?' | c == ' ' | c == ',';
    }
}
