package com.learning.iteration_vs_recursion.recursion.bad_use_cases;

import java.util.Scanner;

public class ReverseTheString {
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
}
