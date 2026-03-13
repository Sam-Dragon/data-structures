package com.learning.search.linear;

public class FindEvenNumberOfDigitsInArray {

    public static void main(String[] args) {
//        int[] array = {12, 345, 2, 6, 7896};
        int[] array = {-12, -345, -2, -6, -7896};
//        int[] array = {};
        for (int val : array) {
            System.out.print(val + ", ");
        }
        System.out.println();

        int count = findEvenNumberOfDigitsInArrayUsingDivisionOperator(array);
        System.out.println("Even Number Of Digits = " + count);

        count = findEvenNumberOfDigitsInArrayUsingString(array);
        System.out.println("Even Number Of Digits = " + count);
    }

    private static int findEvenNumberOfDigitsInArrayUsingString(int[] array) {
        int count = 0;

        if (array.length == 0)
            return count;

        for (int num : array) {
            // NOTE: remove sign from numbers
            int positiveNumber = Math.abs(num);
            String number = String.valueOf(positiveNumber);
            if (number.length() % 2 == 0)
                count++;
        }

        return count;
    }


    private static int findEvenNumberOfDigitsInArrayUsingDivisionOperator(int[] array) {
        int count = 0;

        if (array.length == 0)
            return count;

        for (int num : array) {
            // NOTE: remove sign from numbers
            int positiveNumber = Math.abs(num);

            boolean isEvenDigit = checkIfNumberHasEvenDigit(positiveNumber);
            if (isEvenDigit) {
//                System.out.println(num);
                count++;
            }
        }

        return count;
    }

    private static boolean checkIfNumberHasEvenDigit(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count % 2 == 0;
    }

}
