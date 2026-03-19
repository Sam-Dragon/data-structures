package com.learning.subsets.recursion.combination;

import java.util.ArrayList;
import java.util.Scanner;

public class Combinations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the input");
        String input = sc.nextLine();
        System.out.println("Entered Input :: " + input);

        System.out.println(combinations("", input));
    }

    private static ArrayList<String> combinations(String initial, String input) {
        if (input.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(initial);
            return list;
        }

        ArrayList<String> left = (combinations(initial, input.substring(1)));
        ArrayList<String> right = (combinations(initial + input.charAt(0), input.substring(1)));

        left.addAll(right);
        return left;
    }
}
