package com.learning.search.binary.iteration;

import java.util.Scanner;

public class SearchIndexOfElementInArray {

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 6, 15, 16, 18, 20};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search");
        int target = sc.nextInt();
        System.out.println("Element to search = " + target);

        int low = 0, high = array.length - 1;

        int findIndexUsingBinarySearchUsingForLoop = findIndexUsingBinarySearchUsingForLoop(low, high, array, target);
        System.out.println(target + " is present at index = " + findIndexUsingBinarySearchUsingForLoop);

        int findIndexUsingBinarySearchUsingWhileLoop = findIndexUsingBinarySearchUsingWhileLoop(low, high, array,
                target);
        System.out.println(target + " is present at index = " + findIndexUsingBinarySearchUsingWhileLoop);
    }

    private static int findIndexUsingBinarySearchUsingWhileLoop(int low, int high, int[] array, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target)
                return mid;
            else if (target > array[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    private static int findIndexUsingBinarySearchUsingForLoop(int low, int high, int[] array, int target) {
        for (; low <= high; ) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target)
                return mid;
            else if (target > array[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}
