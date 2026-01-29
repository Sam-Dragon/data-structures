package com.learning.iteration_vs_recursion.recursion.permutation;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationsWay2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input");
        String input = sc.nextLine();
        System.out.println("Entered Input :: " + input);

        System.out.println(permutations("", input));
    }

    private static ArrayList<String> permutations(String initial, String input) {
        if (input.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(initial);
            return list;
        }

        char character = input.charAt(0);
        ArrayList<String> finalList = new ArrayList<>();

        for (int i = 0; i <= initial.length(); i++) {
            String begin = initial.substring(0, i);
            String end = initial.substring(i);
            finalList.addAll(permutations(begin + character + end , input.substring(1)));
        }

        return finalList;
    }
}
