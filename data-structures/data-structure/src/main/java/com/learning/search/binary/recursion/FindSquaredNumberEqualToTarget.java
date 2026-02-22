package com.learning.search.binary.recursion;

import java.util.Scanner;

/**
 * Note: Condition, we need to search in sequence such that
 * Target = Squared Number, return
 * Target = Less Squared Number, Capture & Return at last
 * <p>
 * Condition = ((array[mid] * array[mid]) <= target) -- Finds Lower Or Equal Closest Number
 *  && return high > 0 ? array[high] : array[low];
 * Condition = ((array[mid] * array[mid]) <= target) -- Finds Higher Or Equal Closest Number
 *  && return low <= 0 ? array[low] : array[high];
 */

public class FindSquaredNumberEqualToTarget {

    public static void main(String[] args) {
        System.out.println("Input Array");
        int[] array = {2, 3, 4, 5, 6, 7, 8, 11, 20, 21, 23, 25, 25};
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.println("Enter the Target");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println("Target = " + target);

        if (array.length <= 0) {
            return;
        }

        int low = 0, high = array.length - 1;
        int closestSquareNumber = closestSquareNumber(low, high, array, target);
        System.out.println("Target [" + target + "] closest Square Number = " + closestSquareNumber);
    }

    private static int closestSquareNumber(int low, int high, int[] array, int target) {
        if (low > high)
            return high > 0 ? array[high] : array[low];

        int mid = low + (high - low) / 2;

        // Condition
        if ((array[mid] * array[mid]) == target)
            return array[mid];

        // Iteration
        if ((array[mid] * array[mid]) < target)
            return closestSquareNumber(mid + 1, high, array, target);
        else
            return closestSquareNumber(low, mid - 1, array, target);
    }
}
