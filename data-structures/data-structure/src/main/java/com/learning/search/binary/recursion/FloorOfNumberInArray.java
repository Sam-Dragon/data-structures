package com.learning.search.binary.recursion;

import java.util.Scanner;

public class FloorOfNumberInArray {

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 9, 14, 16, 18};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to floor");
        int target = sc.nextInt();
        System.out.println("Element to floor = " + target);

        int low = 0, high = array.length - 1;
        int findFlooringOfNumber = findFlooringOfNumber(low, high, array, target);
        System.out.println(target + " is flooring at number = " + findFlooringOfNumber);
    }

    private static int findFlooringOfNumber(int low, int high, int[] array, int target) {
        int mid = low + (high - low) / 2;

        // Terminal Condition
        if (low > high)
            return array[high];

        if (array[mid] == target)
            return array[mid];

        if (target > array[mid]) {
            if (mid + 1 > array.length - 1)
                return array[mid];

            return findFlooringOfNumber(mid + 1, high, array, target);
        } else {
            if (mid - 1 < 0)
                return array[mid];

            return findFlooringOfNumber(low, mid - 1, array, target);
        }
    }
}
