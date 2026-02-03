package com.learning.search.binary.iteration;

import java.util.Scanner;

public class SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] chars = {'c', 'f', 'j'};
//        char[] chars = {'a', 'b'};
        System.out.println("Input Character Array");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + ", ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the letter");
        char character = sc.nextLine()
                           .charAt(0);
        System.out.println("Character to search :: " + character);

        char smallestCharacterMatchingTargetUsingForLoop = smallestCharacterMatchingTargetUsingForLoop(chars,
                character);
        System.out.println("Smallest Character Closer To Target = " + smallestCharacterMatchingTargetUsingForLoop);

        char smallestCharacterMatchingTargetUsingWhileLoop = smallestCharacterMatchingTargetUsingWhileLoop(chars,
                character);
        System.out.println("Smallest Character Closer To Target = " + smallestCharacterMatchingTargetUsingWhileLoop);
    }

    private static char smallestCharacterMatchingTargetUsingForLoop(char[] chars, char character) {
        // Terminal Condition
        int low = 0, high = chars.length - 1;

        for (; low <= high; ) {
            // Find Middle Element
            int mid = low + (high - low) / 2;

            if (character == chars[mid])
                return character;

            if (character > chars[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        if (low == chars.length)
            low = 0;

        return chars[low];
    }

    private static char smallestCharacterMatchingTargetUsingWhileLoop(char[] chars, char character) {
        // Terminal Condition
        int low = 0, high = chars.length - 1;

        while (low <= high) {
            // Find Middle Element
            int mid = low + (high - low) / 2;

            if (character == chars[mid])
                return character;

            if (character > chars[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        if (low == chars.length)
            low = 0;

        return chars[low];
    }
}
