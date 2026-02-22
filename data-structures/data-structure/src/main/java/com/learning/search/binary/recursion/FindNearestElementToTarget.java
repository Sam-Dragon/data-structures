package com.learning.search.binary.recursion;

import java.util.Scanner;

public class FindNearestElementToTarget {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 7, 7, 8, 11, 13, 21};
//        int[] array = {};
        System.out.println("Input Array");
        for (int i : array)
            System.out.print(i + ", ");
        System.out.println();

        System.out.println("Enter the Target");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println("Target To Search = " + target);

        int low = 0, high = array.length - 1;
        int nearestValue = findNearestElement(low, high, array, target);
        System.out.println("Index of the element = " + nearestValue + ", Value = " + array[nearestValue]);
    }

    private static int findNearestElement(int low, int high, int[] array, int target) {
        // Terminal Condition
        if (low > high)
            return low;

        int mid = low + (high - low) / 2;

        // Main Condition
        if (array[mid] == target) {
            // Duplicate Value
            if (array[mid + 1] == target)
                return mid + 1;
            else
                return mid;
        }

        if (array[mid + 1] < target)
            return findNearestElement(mid + 1, high, array, target);
        else
            return findNearestElement(low, mid - 1, array, target);
    }
}
