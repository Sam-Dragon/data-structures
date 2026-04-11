package com.learning.stack.programs;

import java.util.Stack;

public class CompressTheArray {

    public static void main(String[] args) {
//        int[] arr = {8, 4, 2, 2, 2, 4};
//        int[] arr = {4, 4, 4, 4};
        int[] arr = {1, 2, 3, 4};
        System.out.println("Input Array");
        for (int i : arr)
            System.out.print(i + ", ");
        System.out.println();

        System.out.println("Output Array");
        Stack<Integer> stack = compressedArray(arr);
        for (int i : stack)
            System.out.print(i + ", ");
        System.out.println();
    }

    private static Stack<Integer> compressedArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int val : arr) {

            // Iterate through elements and keep matching top of stack
            while (!stack.isEmpty() && stack.peek() == val) {
                val = val + stack.pop();
            }

            stack.push(val);
        }

        return stack;
    }
}
