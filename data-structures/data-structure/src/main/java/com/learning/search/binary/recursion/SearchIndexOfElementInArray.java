package com.learning.search.binary.recursion;

import java.util.Scanner;

public class SearchIndexOfElementInArray {

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 6, 15, 16, 18, 20};
        for (int val : array)
            System.out.print(val + ", ");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search");
        int target = sc.nextInt();
        System.out.println("Element to search = " + target);

        int low = 0, high = array.length - 1;
        int index = findIndexUsingBinarySearch(low, high, array, target);
        System.out.println(target + " is present at index = " + index);
    }

    private static int findIndexUsingBinarySearch(int low, int high, int[] array, int target) {
        // Terminal Condition
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        // Condition
        if (array[mid] == target)
            return mid;

        // Iteration
        if (array[mid] > target)
            high = mid - 1;
        else
            low = mid + 1;

        return findIndexUsingBinarySearch(low, high, array, target);
    }
}
