package com.learning.iteration_vs_recursion.recursion.permutation;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationsCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input");
        String input = sc.nextLine();
        System.out.println("Entered Input :: " + input);

        System.out.println("count = " + permutations("", input));
    }

    private static int permutations(String initial, String input) {
        if (input.isEmpty()) {
            return 1;
        }

        char character = input.charAt(0);
        int count = 0;
        for (int i = 0; i <= initial.length(); i++) {
            String begin = initial.substring(0, i);
            String end = initial.substring(i);
            count += permutations(begin + character + end , input.substring(1));
        }

        return count;
    }
}
