package com.learning.stack.programs;

import java.util.Scanner;
import java.util.Stack;

public class ReverseTheString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();
        System.out.println("Input = " + input);

        String reversed = reverseTheString(input);
        System.out.println("Reverse Of the String = " + reversed);
    }

    private static String reverseTheString(String input) {
        Stack<Character> stack = new Stack<>();
        int length = input.length() - 1, i = 0;
        StringBuilder reversed = new StringBuilder();

        while (i <= length)
            stack.push(input.charAt(i++));

        while (!stack.isEmpty())
            reversed.append(stack.pop());

        return reversed.toString();
    }
}
