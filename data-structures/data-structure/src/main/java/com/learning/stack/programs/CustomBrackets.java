package com.learning.stack.programs;

import java.util.Scanner;
import java.util.Stack;

public class CustomBrackets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String input = sc.nextLine();
        System.out.println("Input = " + input);

        System.out.println("Enter the Allow brackets");
        String[] brackets = sc.nextLine()
                              .split(",");
        for (String bracket : brackets)
            System.out.print(bracket.charAt(0) + " " + bracket.charAt(1));
        System.out.println();

        boolean result = checkIfStringMatchesBrackets(input, brackets);
        System.out.println("is valid ? " + result);
    }

    private static boolean checkIfStringMatchesBrackets(String input, String[] brackets) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!isAlphaNumeric(c)) {
                for (String bracket : brackets) {
                    if (c == bracket.charAt(0)) {
                        stack.push(c);
                        break;
                    } else if (c == bracket.charAt(1)) {
                        if (stack.isEmpty())
                            stack.push(c);
                        else if (stack.peek() == bracket.charAt(0))
                            stack.pop();
                        break;
                    }
                }
            } /*else
                System.out.println("Alphanumberic = " + c);*/
        }

        return stack.isEmpty();
    }

    private static boolean isAlphaNumeric(char c) {
        return String.valueOf(c)
                     .matches("[a-zA-Z0-9]");
    }
}
