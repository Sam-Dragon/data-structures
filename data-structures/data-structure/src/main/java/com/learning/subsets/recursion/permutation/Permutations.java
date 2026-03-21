package com.learning.subsets.recursion.permutation;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutations {

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
        ArrayList<String> left = (permutations(character + initial, input.substring(1)));
        ArrayList<String> right = (permutations(initial + character, input.substring(1)));

        left.addAll(right);
        return left;
    }
}
