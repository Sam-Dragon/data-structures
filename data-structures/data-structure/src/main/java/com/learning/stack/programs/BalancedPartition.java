package com.learning.stack.programs;

import java.util.*;

public class BalancedPartition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        String input = sc.nextLine();
        System.out.println("Input = " + input);

        List<String> balancedStrings = balancedStrings(input);
        System.out.println(balancedStrings);
    }

    private static List<String> balancedStrings(String input) {
        List<String> balancedStrings = new LinkedList<>();
        Queue<String> queue = new LinkedList<>();
        int forwardCount = 0, backwardCount = 0, i = 0, len = input.length() - 1;

        while (i <= len) {

            // Logic to keep pushing elements
            char c = input.charAt(i);
            if (c == '(') {
                ++forwardCount;
            } else if (c == ')') {
                ++backwardCount;
            }
            queue.add(String.valueOf(c));

            // Pop only when count matches
            if (forwardCount == backwardCount) {
                StringBuilder builder = new StringBuilder();
                while (!queue.isEmpty()) {
                    builder.append(queue.remove());
                }
                balancedStrings.add(builder.toString());
            }

            i++;
        }

        return balancedStrings;
    }
}
