package com.learning.search.binary.recursion;

import java.util.Scanner;

public class SearchIndexOfElementInRotatedArray {

    public static void main(String[] args) {
//        int[] array = {3, 2, 1, 5, 6};
//        int[] array = {1, 2, 3, 6, 5};
        int[] array = {6, 5, 1, 2, 3};
        for (int val : array)
            System.out.print(val + ", ");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search");
        int target = sc.nextInt();
        System.out.println("Element to search = " + target);

        int low = 0, high = array.length - 1;
        int index = findIndexUsingBinarySearchInRotatedArray(low, high, array, target);
        System.out.println(target + " is present at index = " + index);
    }

    private static int findIndexUsingBinarySearchInRotatedArray(int low, int high, int[] array, int target) {
        // Terminal Condition
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        // Condition
        if (array[mid] == target)
            return mid;

        if (array[low] <= array[mid]) {
            // WATCH FIRST HALF
            if (target <= array[mid] && target >= array[low])
                high = mid - 1;
            else
                low = mid + 1;
        } else {
            // WATCH SECOND HALF
            if (target >= array[mid] && target <= array[high])
                low = mid + 1;
            else
                high = mid - 1;
        }

        // Iteration
        return findIndexUsingBinarySearchInRotatedArray(low, high, array, target);
    }
}
