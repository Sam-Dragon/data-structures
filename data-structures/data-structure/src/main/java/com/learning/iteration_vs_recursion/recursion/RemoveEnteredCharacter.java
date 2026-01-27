package com.learning.iteration_vs_recursion.recursion;

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

        System.out.println("Using String Builder");
        StringBuilder builder = new StringBuilder(input);
        String result = removeCharUsingBuilder(builder, 0, removeCharacter);
        System.out.println(result);

        System.out.println("Using SubString");
        result = removeCharUsingSubstring("", input, removeCharacter);
        System.out.println(result);
    }

    private static String removeCharUsingBuilder(StringBuilder builder, int index, char skipCharacter) {
        if (index >= builder.length())
            return builder.toString();

        if (builder.charAt(index) == skipCharacter)
            builder.deleteCharAt(index);

        return removeCharUsingBuilder(builder, index + 1, skipCharacter);
    }

    private static String removeCharUsingSubstring(String initial, String input, char skipCharacter) {
        if (input.isEmpty()) {
            return initial;
        }

        char character = input.charAt(0);
        if (character == skipCharacter) {
            return removeCharUsingSubstring(initial, input.substring(1), skipCharacter);
        } else {
            return removeCharUsingSubstring(initial + character, input.substring(1), skipCharacter);
        }
    }
}
