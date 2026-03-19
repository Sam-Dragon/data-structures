package com.learning.subsets.recursion.substring;

import java.util.Scanner;

public class RemoveEnteredString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input ?");
        String input = sc.nextLine();
        System.out.println("Entered String is = " + input);

        System.out.println("Please enter the character to remove ?");
        String removeString = sc.nextLine();
        System.out.println("Character to remove = " + removeString);

        System.out.println("Using SubString");
        String result = removeCharUsingSubstring(input, removeString);
        System.out.println(result);
    }

    private static String removeCharUsingSubstring(String input, String removeString) {
        if (input.isEmpty()) {
            return input;
        }

        if (input.startsWith(removeString)) {
            return removeCharUsingSubstring(input.substring(removeString.length()), removeString);
        } else {
            return input.charAt(0) + removeCharUsingSubstring(input.substring(1), removeString);
        }
    }
}
