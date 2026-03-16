package com.learning.search.linear.recursion;

public class FindEvenNumberOfDigitsInArray {

    public static void main(String[] args) {
//        int[] array = {12, 345, 2, 6, 7896};
        int[] array = {-12, -345, -2, -6, -7896};
//        int[] array = {};
        for (int val : array) {
            System.out.print(val + ", ");
        }
        System.out.println();

        int count = findEvenNumberOfDigitsInArray(0, 0, array);
        System.out.println("Even Number Of Digits = " + count);
    }

    private static int findEvenNumberOfDigitsInArray(int index, int count, int[] array) {
        if (array.length == index)
            return count;

        if (countDigitsAndCheckForEven(Math.abs(array[index])))
            ++count;

        return findEvenNumberOfDigitsInArray(index + 1, count, array);
    }

    private static boolean countDigitsAndCheckForEven(int number) {
        int count = 0;

        while (number > 0) {
            ++count;
            number = number / 10;
        }

        return count % 2 == 0;
    }
}
