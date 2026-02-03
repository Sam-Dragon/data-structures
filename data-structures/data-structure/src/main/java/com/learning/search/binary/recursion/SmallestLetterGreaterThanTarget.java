package com.learning.search.binary.recursion;

import java.util.Scanner;

public class SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] chars = {'c', 'f', 'j'};
//        char[] chars = {'a', 'b'};
        System.out.println("Input Character Array");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + ", ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to ceil");
        char target = sc.nextLine().charAt(0);
        System.out.println("Element to ceil = " + target);

        int low = 0, high = chars.length - 1;
        char findSmallestLetterGreaterThanTarget = findSmallestLetterGreaterThanTarget(low, high, chars, target);
        System.out.println(target + " is ceiling at number = " + findSmallestLetterGreaterThanTarget);
    }

    private static char findSmallestLetterGreaterThanTarget(int low, int high, char[] array, char target) {
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
            return findSmallestLetterGreaterThanTarget(mid + 1, high, array, target);
        } else {
            return findSmallestLetterGreaterThanTarget(low, mid - 1, array, target);
        }
    }
}
