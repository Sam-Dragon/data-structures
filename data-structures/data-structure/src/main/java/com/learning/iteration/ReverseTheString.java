package com.learning.iteration;

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

        String reverseTheStringUsingForLoop = reverseTheStringUsingForLoop(input);
        System.out.println("Reverse Of the String [" + input + "] = " + reverseTheStringUsingForLoop);

        String reverseTheStringUsingWhileLoop = reverseTheStringUsingWhileLoop(input);
        System.out.println("Reverse Of the String [" + input + "] = " + reverseTheStringUsingWhileLoop);
    }

    private static String reverseTheStringUsingWhileLoop(String input) {
        StringBuilder builder = new StringBuilder();

        int length = input.length() - 1;
        while (length >= 0) {
            builder.append(input.charAt(length));
            length--;
        }

        return builder.toString();
    }

    private static String reverseTheStringUsingForLoop(String input) {
        StringBuilder builder = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            builder.append(input.charAt(i));
        }

        return builder.toString();
    }
}
