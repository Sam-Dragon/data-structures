package com.learning.tow_pointers;

public class SmallerPrefixes {

    public static void main(String[] args) {
        System.out.println("Input Array");
        int[] array = {1, 2, -2, 1, 3, 5};
//        int[] array = {1, 2, 2, -1};
//        int[] array = {};
        for (int i : array)
            System.out.print(i + ", ");
        System.out.println();

        boolean result = isSmallerPrefixes(array);
        System.out.println("array with smaller fixes ? " + result);
    }

    private static boolean isSmallerPrefixes(int[] array) {
        boolean result = false;
        int slowPtr = 0, fastPtr = 0;
        int slowSum = 0, fastSum = 0;

        while (fastPtr < array.length) {
            result = true;

            slowSum += array[slowPtr];
            fastSum += array[fastPtr] + array[fastPtr + 1];

            // Condition for failure case
            if (slowSum >= fastSum) {
                result = false;
                return result;
            }

            slowPtr += 1;
            fastPtr += 2;
        }

        return result;
    }
}
