package com.learning.search.binary.recursion;

import java.util.Scanner;

public class SearchElementInInfiniteArray {

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 7, 8, 9, 11, 13, 15, 19, 21, 24, 27, 30, 31, 33, 35, 37, 41, 43, 45, 47, 50};
        System.out.println("Input Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        int target = sc.nextInt();
        System.out.println("Element to search = " + target);

        int low = 0, high = 2;
        System.out.println("Check If element is present");
        int index = checkIfElementIsPresent(low, high, array, target);
        System.out.println("Index = " + index);
    }

    private static int checkIfElementIsPresent(int low, int high, int[] array, int target) {
        int mid = low + (high - low) / 2;

        // Terminal Condition
        if (mid > high) {
            if (array[mid] <= target) {
                System.out.println("Increasing power of 2");
                low = high;
                high = (int) Math.pow(high, 2);
                System.out.println("Size = " + high);
            } else {
                return -1;
            }
        }

        // Match Case
        if (array[mid] == target)
            return mid;

        // Traverse Case
        if (target > array[mid])
            return checkIfElementIsPresent(mid + 1, high, array, target);
        else
            return checkIfElementIsPresent(low, mid - 1, array, target);
    }
}
