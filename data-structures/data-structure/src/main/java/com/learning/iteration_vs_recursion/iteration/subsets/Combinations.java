package com.learning.iteration_vs_recursion.iteration.subsets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combinations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input");
        String input = sc.nextLine();
        System.out.println("Entered Input :: " + input);
        ;

        Combinations combinations = new Combinations();

        // For Loop
        List<String> combinationsUsingForLoop = combinations.combinationsUsingForLoop(input);
        System.out.println("Is Array Sorted :: " + combinationsUsingForLoop);

        // While Loop
        List<String> combinationsUsingWhileLoop = combinations.combinationsUsingWhileLoop(input);
        System.out.println("Is Array Sorted :: " + combinationsUsingWhileLoop);
    }

    private List<String> combinationsUsingForLoop(String input) {
        List<String> combinations = new ArrayList<>();

        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {
            combinations.add("[" + array[i] + "]");
            for (int j = 1 + i; j < array.length; j++) {
                combinations.add("[" + array[i] + "," + array[j] + "]");
            }
            if (i == array.length - 1) {
                combinations.add("[" + array[i - 2] + "," + array[i - 1] + "," + array[i] + "]");
            }
        }

        return combinations;
    }

    private List<String> combinationsUsingWhileLoop(String input) {
        List<String> combinations = new ArrayList<>();

        int i = 0;
        char[] array = input.toCharArray();

        while (i < array.length) {
            combinations.add("[" + array[i] + "]");
            int j = i + 1;
            while (j < array.length) {
                combinations.add("[" + array[i] + "," + array[j] + "]");
                j++;
            }
            i++;
            if (i == array.length - 1) {
                combinations.add("[" + array[i - 2] + "," + array[i - 1] + "," + array[i] + "]");
            }
        }

        return combinations;
    }
}
