package com.learning.subsets.recursion.substring;

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

        System.out.println("Using SubString Local Field");
        result = removeCharUsingSubstringLocalResult(input, removeCharacter);
        System.out.println(result);
    }

    private static String removeCharUsingBuilder(StringBuilder resultBuilder, int index, char skipCharacter) {
        if (index >= resultBuilder.length())
            return resultBuilder.toString();

        if (resultBuilder.charAt(index) == skipCharacter)
            resultBuilder.deleteCharAt(index);

        return removeCharUsingBuilder(resultBuilder, index + 1, skipCharacter);
    }

    private static String removeCharUsingSubstring(String result, String input, char skipCharacter) {
        if (input.isEmpty()) {
            return result;
        }

        char character = input.charAt(0);
        if (character == skipCharacter) {
            return removeCharUsingSubstring(result, input.substring(1), skipCharacter);
        } else {
            return removeCharUsingSubstring(result + character, input.substring(1), skipCharacter);
        }
    }

    private static String removeCharUsingSubstringLocalResult(String input, char ch) {
        String result = "";

        // Terminal Condition
        if (input.isEmpty())
            return result;

        char first = input.charAt(0);

        // Condition
        if (first != ch)
            result = first + "";

        String value = removeCharUsingSubstringLocalResult(input.substring(1), ch);
        result += value;

        return result;
    }
}
