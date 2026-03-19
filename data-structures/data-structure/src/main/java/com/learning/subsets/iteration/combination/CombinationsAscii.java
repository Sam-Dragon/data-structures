package com.learning.subsets.iteration.combination;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationsAscii {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input");
        String input = sc.nextLine();
        System.out.println("Entered Input :: " + input);

        CombinationsAscii combinations = new CombinationsAscii();

        // For Loop
        List<List<String>> combinationsUsingForLoop = combinations.combinationsUsingForLoop(input);
        System.out.println("Is Array Sorted :: " + combinationsUsingForLoop);

        // While Loop
        List<List<String>> combinationsUsingWhileLoop = combinations.combinationsUsingWhileLoop(input);
        System.out.println("Is Array Sorted :: " + combinationsUsingWhileLoop);
    }

    private List<List<String>> combinationsUsingForLoop(String input) {
        char[] array = input.toCharArray();

        List<List<String>> combinations = new ArrayList<>();
        List<String> thirdList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            List<String> firstList = new ArrayList<>();
            firstList.add(array[i] + 0 + "");
            thirdList.add(array[i] + 0 + "");

            for (int j = 1 + i; j < array.length; j++) {
                List<String> secondList = new ArrayList<>();
                secondList.add(array[i] + 0 + "");
                secondList.add(array[j] + 0 + "");

                combinations.add(secondList);
            }
            combinations.add(firstList);
        }
        combinations.add(thirdList);

        return combinations;
    }

    private List<List<String>> combinationsUsingWhileLoop(String input) {
        char[] array = input.toCharArray();

        List<List<String>> combinations = new ArrayList<>();
        List<String> thirdList = new ArrayList<>();

        int i = 0;
        while (i < array.length) {
            List<String> firstList = new ArrayList<>();
            firstList.add(array[i] + 0 + "");
            thirdList.add(array[i] + 0 + "");
            int j = 1 + i;
            while (j < array.length) {
                List<String> secondList = new ArrayList<>();
                secondList.add(array[i] + 0 + "");
                secondList.add(array[j] + 0 + "");

                combinations.add(secondList);
                j++;
            }
            combinations.add(firstList);
            i++;
        }
        combinations.add(thirdList);

        return combinations;
    }
}
