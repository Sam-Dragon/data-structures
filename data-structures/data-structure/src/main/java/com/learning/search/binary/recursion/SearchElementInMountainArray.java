package com.learning.search.binary.recursion;

import java.util.Scanner;

public class SearchElementInMountainArray {

    public static void main(String[] args) {
        int[] array;
//        array = new int[]{1, 2, 3, 4, 5, 3, 1};
        array = new int[]{0, 1, 2, 4, 2, 1};

        System.out.println("Input Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target");
        int target = sc.nextInt();
        System.out.println("Element to search = " + target);

        int low = 0, high = array.length - 1;
        System.out.println("Peak Index of Mountain Array");
        int peakIndex = peakIndexOfMountain(low, high, array);
        System.out.println("Peak Index = " + peakIndex);

        boolean isAsc = array[0] < array[peakIndex];
        int searchIndex = searchIndexOfMountain(0, peakIndex, array, target, isAsc);
        System.out.println("Search Index = " + searchIndex);

        if (searchIndex != -1) {
            return;
        }

        isAsc = array[peakIndex + 1] < array[high];
        searchIndex = searchIndexOfMountain(peakIndex + 1, high, array, target, isAsc);
        System.out.println("Search Index = " + searchIndex);
    }

    private static int searchIndexOfMountain(int low, int high, int[] array, int target, boolean isAsc) {
        int mid = low + (high - low) / 2;

        // Terminal Condition
        if (low >= high)
            return -1;

        if (array[mid] == target)
            return mid;

        if (isAsc) {
            if (array[mid] > target)
                return searchIndexOfMountain(low, mid - 1, array, target, isAsc);
            else
                return searchIndexOfMountain(mid + 1, high, array, target, isAsc);
        } else {
            if (array[mid] < target)
                return searchIndexOfMountain(high, mid + 1, array, target, isAsc);
            else
                return searchIndexOfMountain(mid - 1, low, array, target, isAsc);
        }
    }

    private static int peakIndexOfMountain(int low, int high, int[] array) {
        int mid = low + (high - low) / 2;

        // Terminal Condition
        if (mid == array.length)
            return -1;

        if (array[mid] > array[high] && array[mid] > array[mid + 1])
            return mid;
        else
            return peakIndexOfMountain(mid + 1, high, array);
    }
}
