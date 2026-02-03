package com.learning.search.binary.recursion;

import java.util.Scanner;

public class CeilingOfNumberInArray {

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 9, 14, 16, 18};
        System.out.println("Input Character Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to ceil");
        int target = sc.nextInt();
        System.out.println("Element to ceil = " + target);

        int low = 0, high = array.length - 1;
        int findCeilingOfNumber = findCeilingOfNumber(low, high, array, target);
        System.out.println(target + " is ceiling at number = " + findCeilingOfNumber);
    }

    private static int findCeilingOfNumber(int low, int high, int[] array, int target) {
        int mid = low + (high - low) / 2;

        // Missing Element
        if (low == array.length)
            return array[0];

        // Terminal Condition
        if (low > high)
            return array[low];

        if (array[mid] == target)
            return array[mid];

        if (target > array[mid]) {
            return findCeilingOfNumber(mid + 1, high, array, target);
        } else {
            return findCeilingOfNumber(low, mid - 1, array, target);
        }
    }
}
