package com.learning.tow_pointers;

import java.util.Arrays;

public class FindIntersectionBetweenTwoSortedArrays {

    public static void main(String[] args) {
        System.out.println("First Input Array");
//        int[] array1 = {1, 2, 3};
        int[] array1 = {1, 1, 1};
//        int[] array1 = {};
        for (int i : array1)
            System.out.print(i + ", ");
        System.out.println();

        System.out.println("Second Input Array");
//        int[] array2 = {1, 3, 5};
        int[] array2 = {1, 1};
//        int[] array2 = {};
        for (int i : array2)
            System.out.print(i + ", ");
        System.out.println("\n");

        System.out.println("Result Array");
        int[] finalArr = findIntersectionBetweenTwoSortedArrays(array1, array2);
        Arrays.stream(finalArr)
              .boxed()
              .toList()
              .forEach(System.out::println);
    }

    private static int[] findIntersectionBetweenTwoSortedArrays(int[] array1, int[] array2) {
        if (array1.length == 0 || array2.length == 0)
            return new int[0];

        int[] finalArr = new int[(array1.length + array2.length) / 2];
        int array1Ptr = 0, array2Ptr = 0, finalArrIndex = 0;

        while (array1Ptr < array1.length && array2Ptr < array2.length) {
            if (array1[array1Ptr] == array2[array2Ptr]) {
                finalArr[finalArrIndex++] = array1[array1Ptr];
                array1Ptr++;
                array2Ptr++;
            } else if (array1[array1Ptr] < array2[array2Ptr]) {
                array1Ptr++;
            } else {
                array2Ptr++;
            }
        }

        return finalArr;
    }
}
