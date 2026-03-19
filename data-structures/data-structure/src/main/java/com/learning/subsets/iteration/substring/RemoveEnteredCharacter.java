package com.learning.subsets.iteration.substring;

import java.util.Scanner;

public class RemoveEnteredCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input ?");
        String input = sc.nextLine();
        System.out.println("Entered String is = " + input);

        System.out.println("Please enter the character to remove ?");
        char removeCharacter = sc.next()
                                 .charAt(0);
        System.out.println("Character to remove = " + removeCharacter);

        // Validation
        if (input == null || input.isEmpty() || removeCharacter == ' ') {
            System.out.println("Please provide valid input");
            return;
        }

        // USING BUILDER
        StringBuilder builder = new StringBuilder(input);
        String removeCharUsingForLoop = removeCharWithBuilderUsingForLoop(builder, removeCharacter);
        System.out.println(removeCharUsingForLoop);

        builder = new StringBuilder(input);
        String removeCharUsingWhileLoop = removeCharWithBuilderUsingWhileLoop(builder, removeCharacter);
        System.out.println(removeCharUsingWhileLoop);
    }

    private static String removeCharWithBuilderUsingWhileLoop(StringBuilder builder, char removeCharacter) {
        int index = 0;
        while (index < builder.length()) {
            if (builder.charAt(index) == removeCharacter) {
                builder.deleteCharAt(index);
            }
            index++;
        }

        return builder.toString();
    }

    private static String removeCharWithBuilderUsingForLoop(StringBuilder builder, char skipCharacter) {
        for (int i = 0; i < builder.length(); i++) {
            if (skipCharacter == builder.charAt(i)) {
                builder.deleteCharAt(i);
            }
        }

        return builder.toString();
    }
}
