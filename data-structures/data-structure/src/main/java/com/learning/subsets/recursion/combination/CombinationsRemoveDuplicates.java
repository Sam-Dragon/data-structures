package com.learning.subsets.recursion.combination;

import java.util.HashSet;
import java.util.Scanner;

public class CombinationsRemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input");
        String input = sc.nextLine();
        System.out.println("Entered Input :: " + input);

        System.out.println(combinations("", input));
    }

    private static HashSet<String> combinations(String initial, String input) {
        if (input.isEmpty()) {
            HashSet<String> list = new HashSet<>();
            list.add(initial);
            return list;
        }

        HashSet<String> left = (combinations(initial, input.substring(1)));
        HashSet<String> right = (combinations(initial + input.charAt(0), input.substring(1)));

        left.addAll(right);
        return left;
    }
}
