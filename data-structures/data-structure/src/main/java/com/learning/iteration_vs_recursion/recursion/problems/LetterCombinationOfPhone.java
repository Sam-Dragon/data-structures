package com.learning.iteration_vs_recursion.recursion.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCombinationOfPhone {

    public static void main(String[] args) {
        // Take the string from Keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the numbers for letter combinations");
        String input = sc.nextLine();
        System.out.println("Letter combinations searched for input :: " + input);

        // Validation
        if (input.isBlank()) {
            System.out.println("Please provide valid input");
            return;
        }

        List<String> list = permutations("", input);
        System.out.println("Combinations " + list);
    }

    private static ArrayList<String> permutations(String initial, String input) {
        if (input.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(initial);
            return list;
        }

        int digit = input.charAt(0) - '0';
        ArrayList<String> finalList = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char character = (char) ('a' + i);
            finalList.addAll(permutations(initial + character, input.substring(1)));
        }

        return finalList;
    }
}
