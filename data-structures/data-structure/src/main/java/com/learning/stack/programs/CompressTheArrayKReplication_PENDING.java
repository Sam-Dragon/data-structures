package com.learning.stack.programs;

import java.util.Scanner;
import java.util.Stack;

public class CompressTheArrayKReplication_PENDING {

    public static void main(String[] args) {
        int[] arr = {1, 9, 9, 3, 3, 3, 4};
        System.out.println("Input Array");
        for (int i : arr)
            System.out.print(i + ", ");
        System.out.println();

        System.out.println("Enter the count");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("Repetitions = " + k);

        System.out.println("Output Array");
        Stack<Integer> stack = compressedArray(arr, k);
        for (int i : stack)
            System.out.print(i + ", ");
        System.out.println();
    }

    private static Stack<Integer> compressedArray(int[] arr, int k) {
        Stack<Integer> stack = new Stack<>();

        for (int val : arr) {
            int count = 0;

            // Iterate through elements and keep matching top of stack
            if (!stack.isEmpty() && stack.peek() == val) {
                ++count;

                // Check the matching count
                if (count == k) {
                    while (count-- > 0) {
                        val += stack.pop();
                    }
                }
            }

            // Insert Irrespectively
            stack.push(val);
        }

        return stack;
    }
}
