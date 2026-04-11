package com.learning.stack.programs;

import java.util.Stack;

public class CurrentUrlWithForward {

    public static void main(String[] args) {
        String[][] actions = {
                {"go", "google.com"},
                {"go", "wikipedia.com"},
                {"back", "1"},
                {"forward", "1"},
                {"back", "3"},
                {"go", "netflix.com"},
                {"forward", "1"},
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
        Stack<String> forward_stack = new Stack<>();

        for (String[] action : actions) {
            if (action[0].equalsIgnoreCase("go")) {
                stack.push(action[1]);
                // Check if not empty, else clean up
                if(!forward_stack.isEmpty())
                    forward_stack.clear();
            } else if (action[0].equalsIgnoreCase("back")) {
                int count = Integer.parseInt(action[1]);
                while (count > 0 && !stack.isEmpty()) {
                    forward_stack.push(stack.pop());
                    count--;
                }
            } else if (action[0].equalsIgnoreCase("forward")) {
                int count = Integer.parseInt(action[1]);
                while (count > 0 && !forward_stack.isEmpty()) {
                    stack.push(forward_stack.pop());
                    count--;
                }
            }
        }

        return stack.peek();
    }
}
