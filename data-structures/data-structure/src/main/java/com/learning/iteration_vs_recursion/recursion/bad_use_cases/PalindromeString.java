package com.learning.iteration_vs_recursion.recursion.bad_use_cases;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to Reverse ? ");
        String input = sc.nextLine();

        if (input == null || input.isEmpty()) {
            System.out.println("Please provide valid input");
            return;
        }

        String reversed = reverseTheString(input, input.length() - 1, new StringBuilder());
        System.out.println("Reverse Of the String [" + input + "] = " + reversed);
        System.out.println("Is Palindrome ? " + input.equals(reversed));

        reversed = reverseTheString2("", input, input.length() - 1);
        System.out.println("Reverse Of the String [" + input + "] = " + reversed);
        System.out.println("Is Palindrome ? " + input.equals(reversed));
    }

    private static String reverseTheString(String input, int length, StringBuilder builder) {
        if (length == 0) {
            builder.append(input.charAt(length));
            return builder.toString();
        }

        builder.append(input.charAt(length));
        length--;

        return reverseTheString(input, length, builder);
    }

    private static String reverseTheString2(String result, String input, int length) {
        if (length < 0)
            return result;

        return input.charAt(length) + reverseTheString2(result, input, length - 1);
    }
}
