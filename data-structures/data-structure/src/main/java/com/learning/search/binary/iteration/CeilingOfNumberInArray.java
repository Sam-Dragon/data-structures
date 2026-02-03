package com.learning.search.binary.iteration;

import java.util.Scanner;

public class CeilingOfNumberInArray {

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 9, 14, 16, 18};
        System.out.println("Input Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to ceil");
        int target = sc.nextInt();
        System.out.println("Element to ceil = " + target);

        int low = 0, high = array.length - 1;
        int findCeilingOfNumberUsingForLoop = findCeilingOfNumberUsingForLoop(low, high, array, target);
        System.out.println(target + " is ceiling at number = " + findCeilingOfNumberUsingForLoop);

        int findCeilingOfNumberUsingWhileLoop = findCeilingOfNumberUsingWhileLoop(low, high, array, target);
        System.out.println(target + " is ceiling at number = " + findCeilingOfNumberUsingWhileLoop);
    }

    private static int findCeilingOfNumberUsingForLoop(int low, int high, int[] array, int target) {
        for (; low <= high; ) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target)
                return array[mid];

            if (target > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (low == array.length)
            low = 0;

        return array[low];
    }

    private static int findCeilingOfNumberUsingWhileLoop(int low, int high, int[] array, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target)
                return array[mid];

            if (target > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (low == array.length)
            low = 0;

        return array[low];
    }
}
