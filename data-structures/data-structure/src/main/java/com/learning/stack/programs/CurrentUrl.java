package com.learning.stack.programs;

import java.util.Stack;

public class CurrentUrl {

    public static void main(String[] args) {
        String[][] actions = {
                {"go", "google.com"},
                {"go", "wikipedia.com"},
                {"go", "amazon.com"},
                {"back", "4"},
                {"go", "youtube.com"},
                {"go", "netflix.com"},
                {"back", "1"},
        };
        for (String[] action : actions)
            System.out.println(action[0] + ", " + action[1]);
        System.out.println();

        System.out.println("Final Output");
        String output = currentUrlProcessing(actions);
        System.out.println("Output = " + output);
    }

    private static String currentUrlProcessing(String[][] actions) {
        Stack<String> stack = new Stack<>();

        for (String[] action : actions) {
            if (action[0].equalsIgnoreCase("go"))
                stack.push(action[1]);
            else if (action[0].equalsIgnoreCase("back")) {
                int count = Integer.parseInt(action[1]);
                while (count > 0 && !stack.isEmpty()) {
                    stack.pop();
                    count--;
                }
            }
        }

        return stack.peek();
    }
}
