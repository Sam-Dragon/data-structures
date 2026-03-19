package com.learning.subsets.iteration.combination;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CombinationsRemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input");
        String input = sc.nextLine();
        System.out.println("Entered Input :: " + input);

        CombinationsRemoveDuplicates combinations = new CombinationsRemoveDuplicates();

        // For Loop
        Set<Set<String>> combinationsUsingForLoop = combinations.combinationsUsingForLoop(input);
        System.out.println("Is Array Sorted :: " + combinationsUsingForLoop);

        // While Loop
        Set<Set<String>> combinationsUsingWhileLoop = combinations.combinationsUsingWhileLoop(input);
        System.out.println("Is Array Sorted :: " + combinationsUsingWhileLoop);
    }

    private Set<Set<String>> combinationsUsingForLoop(String input) {
        char[] array = input.toCharArray();

        Set<Set<String>> combinations = new HashSet<>();
        Set<String> thirdSet = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            Set<String> firstSet = new HashSet<>();
            firstSet.add(array[i] + "");
            thirdSet.add(array[i] + "");

            for (int j = 1 + i; j < array.length; j++) {
                Set<String> secondSet = new HashSet<>();
                secondSet.add(array[i] + "");
                secondSet.add(array[j] + "");

                combinations.add(secondSet);
            }
            combinations.add(firstSet);
        }
        combinations.add(thirdSet);

        return combinations;
    }

    private Set<Set<String>> combinationsUsingWhileLoop(String input) {
        char[] array = input.toCharArray();

        Set<Set<String>> combinations = new HashSet<>();
        Set<String> thirdSet = new HashSet<>();

        int i = 0;
        while (i < array.length) {
            Set<String> firstSet = new HashSet<>();
            firstSet.add(array[i] + "");
            thirdSet.add(array[i] + "");
            int j = 1 + i;
            while (j < array.length) {
                Set<String> secondSet = new HashSet<>();
                secondSet.add(array[i] + "");
                secondSet.add(array[j] + "");

                combinations.add(secondSet);
                j++;
            }
            combinations.add(firstSet);
            i++;
        }
        combinations.add(thirdSet);

        return combinations;
    }
}
