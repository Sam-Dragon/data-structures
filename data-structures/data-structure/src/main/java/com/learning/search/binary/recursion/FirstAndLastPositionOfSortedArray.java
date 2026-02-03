package com.learning.search.binary.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPositionOfSortedArray {

    public static void main(String[] args) {
        int[] array = {5, 7, 7, 8, 8, 8, 10};

        System.out.println("Input Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the target");
        int target = sc.nextInt();
        System.out.println("Target to search = " + target);

        int low = 0, high = array.length - 1, index = 0;
        int[] baseArray = {-1, -1};

        int[] firstAndLastPositionOfSortedArray = firstAndLastPositionOfSortedArray(low, high, array, target, 0,
                baseArray);
        System.out.println("Lowest And Highest Element Of Array");
        Arrays.stream(firstAndLastPositionOfSortedArray)
              .boxed()
              .forEach(i -> System.out.print(i + " "));
        System.out.println();
    }

    private static int[] firstAndLastPositionOfSortedArray(int low, int high, int[] array, int target, int index,
                                                           int[] firstAndLastPositionOfSortedArray) {
        int mid = low + (high - low) / 2;

        // Base Condition
        if (low > high)
            return firstAndLastPositionOfSortedArray;

        // Add All indexes of array
        if (array[mid] == target)
            firstAndLastPositionOfSortedArray[index++] = mid;

        if (target >= array[mid])
            return firstAndLastPositionOfSortedArray(mid + 1, high, array, target, index,
                    firstAndLastPositionOfSortedArray);
        else
            return firstAndLastPositionOfSortedArray(low, mid - 1, array, target, index,
                    firstAndLastPositionOfSortedArray);
    }
}
