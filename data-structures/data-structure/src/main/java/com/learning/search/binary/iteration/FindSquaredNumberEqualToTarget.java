package com.learning.search.binary.iteration;

import java.util.Scanner;

/**
 * Note: Condition, we need to search in sequence such that
 * Target = Squared Number, return
 * Target = Less Squared Number, Capture & Return at last
 * <p>
 * Condition = ((array[mid] * array[mid]) <= target) -- Finds Lower Or Equal Closest Number
 * Condition = ((array[mid] * array[mid]) <= target) -- Finds Higher Or Equal Closest Number
 */

public class FindSquaredNumberEqualToTarget {

    public static void main(String[] args) {
        System.out.println("Input Array");
        int[] array = {2, 3, 4, 5, 6, 7, 8, 11, 20, 21, 23, 25, 25};
//        int[] array = {};
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.println("Enter the Target");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println("Target = " + target);

        int low = 0, high = array.length - 1;
        int closestSquareNumber = closestSquareNumber(low, high, array, target);
        System.out.println("Target [" + target + "] closest Square Number = " + closestSquareNumber);
    }

    private static int closestSquareNumber(int low, int high, int[] array, int target) {
        int result = array.length > 0 ? array[low] : -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((array[mid] * array[mid]) == target)
                return array[mid];

            if ((array[mid] * array[mid]) < target) {
                low = mid + 1;
                result = array[mid];
            } else
                high = mid - 1;
        }

        return result;
    }
}
