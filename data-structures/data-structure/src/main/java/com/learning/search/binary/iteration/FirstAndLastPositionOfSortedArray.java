package com.learning.search.binary.iteration;

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

        int[] firstAndLastPositionOfSortedArrayUsingWhileLoop = firstAndLastPositionOfSortedArrayUsingWhileLoop(array,
                target);
        System.out.println("Lowest And Highest Element Of Array");
        Arrays.stream(firstAndLastPositionOfSortedArrayUsingWhileLoop)
              .boxed()
              .forEach(i -> System.out.print(i + " "));
        System.out.println();

        int[] firstAndLastPositionOfSortedArrayUsingForLoop = firstAndLastPositionOfSortedArrayUsingForLoop(array,
                target);
        System.out.println("Lowest And Highest Element Of Array");
        Arrays.stream(firstAndLastPositionOfSortedArrayUsingForLoop)
              .boxed()
              .forEach(i -> System.out.print(i + " "));
    }

    private static int[] firstAndLastPositionOfSortedArrayUsingWhileLoop(int[] array, int target) {
        int[] firstAndLastPositionOfSortedArray = {-1, -1};

        int low = 0, high = array.length - 1, index = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                firstAndLastPositionOfSortedArray[index++] = mid;
            }

            if (target >= array[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return firstAndLastPositionOfSortedArray;
    }


    private static int[] firstAndLastPositionOfSortedArrayUsingForLoop(int[] array, int target) {
        int[] firstAndLastPositionOfSortedArray = {-1, -1};

        int low = 0, high = array.length - 1, index = 0;
        for (; low <= high; ) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                firstAndLastPositionOfSortedArray[index++] = mid;
            }

            if (target >= array[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return firstAndLastPositionOfSortedArray;
    }
}
