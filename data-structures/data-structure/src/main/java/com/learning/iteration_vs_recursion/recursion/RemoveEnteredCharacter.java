package com.learning.iteration_vs_recursion.recursion;

import java.util.Scanner;

public class RemoveEnteredCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input ?");
        String input = sc.nextLine();
        System.out.println("Entered String is = " + input);
        char removeCharacter = sc.nextLine()
                                 .charAt(0);
        System.out.println("Character to remove = " + removeCharacter);

        StringBuilder builder = new StringBuilder(input);
        String result = removeCharUsingBuilder(builder, 0, removeCharacter);
        System.out.println(result);
    }

    private static String removeCharUsingBuilder(StringBuilder builder, int index, char skipCharacter) {
        if (index > builder.length())
            return builder.toString();

        if (builder.charAt(index) == skipCharacter)
            builder.deleteCharAt(index);

        return removeCharUsingBuilder(builder, index + 1, skipCharacter);
    }
}
