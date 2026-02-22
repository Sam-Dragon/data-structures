package com.interview;

import java.util.Scanner;

public class NumberClosestToGivenTarget {

    public static void main(String[] args) {
        int[] array = {30, 20, 5, 10};
        System.out.println("Input Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target");
        int target = sc.nextInt();
        System.out.println("Target = " + target);

        iterativeApproachForFindingClosestToSum(array, target);

        recursiveApproachForFindingClosestToSum(array, target);
    }

    private static void recursiveApproachForFindingClosestToSum(int[] array, int target) {
        int index = 0;
        int[] finalPair = new int[2];

        callRecursionToFindSum(array, target, index, finalPair);
    }

    static int count = 0;

    private static int[] callRecursionToFindSum(int[] array, int target, int index, int[] pair) {
        System.out.println("Total Iterations = " + ++count);

        // Terminal Condition
        if (index + 1 == array.length) {
            pair[0] = -1;
            pair[1] = -1;
            return pair;
        }

        int firstValue = array[index];
        int secondValue = array[index + 1];

        if (firstValue + secondValue < target && firstValue + secondValue > pair[0] + pair[1]) {
            pair[0] = firstValue;
            pair[1] = secondValue;
            return pair;
        }

        return callRecursionToFindSum(array, target, index + 1, pair);
    }

    private static void iterativeApproachForFindingClosestToSum(int[] array, int target) {
        // validation
        if (target <= 0 || array.length == 0) {
            System.out.println("-1");
            return;
        }

        int first_value = -1, second_value = -1, sum = 0;
        // Iteration
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (target >= array[i] + array[j] && array[i] != array[j] && sum < array[i] + array[j]) {
                    first_value = array[i];
                    second_value = array[j];
                    sum += first_value + second_value;
                }
            }
        }

        System.out.println(first_value + " " + second_value);
    }
}
