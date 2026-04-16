package com.learning.stack.programs;

import java.security.InvalidKeyException;
import java.util.Scanner;
import java.util.Stack;

public class InfixExpression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();
        System.out.println("Input = " + input);

        String expression = convertToInfixExpression(input);
        System.out.println("Infix Expression for Input '" + input + "' = " + expression);
    }

    private static String convertToInfixExpression(String input) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> symbols = new Stack<>();
        StringBuilder builder = new StringBuilder();

        // Push the elements based on alphabets and symbols
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (Character.isAlphabetic(character))
                stack.push(character);
            else
                symbols.push(character);
        }

        if(stack.size() - 1 != symbols.size()) {
            throw new RuntimeException("Please give Proper Exception");
        }

//        System.out.println(stack);
//        System.out.println(symbols);

        // Process
        String second = String.valueOf(stack.pop());
        while (!symbols.isEmpty() && !stack.isEmpty()) {
            String first = String.valueOf(stack.pop());
            Character symbol = symbols.pop();

            second = process(second, first, symbol);
        }
        builder.append(second);

        return builder.toString();
    }

    private static String process(String second, String first, Character symbol) {
        switch (symbol) {
            case '+':
                return first + "+" + second;
            case '-':
                return first + "-" + second;
            case '*':
                return first + "*" + second;
            case '/':
                return first + "/" + second;
            case '^':
                return first + "^" + second;
            default:
                return "";
        }
    }
}
