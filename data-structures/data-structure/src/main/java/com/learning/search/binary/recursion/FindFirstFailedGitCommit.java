package com.learning.search.binary.recursion;

/**
 * Note: Condition, we need to search in sequence such that
 * previous commit = pass, current commit = fail
 */

public class FindFirstFailedGitCommit {

    public static void main(String[] args) {

        //String[] array = {"fail", "fail", "fail", "fail", "fail", "fail", "fail"};
        //String[] array = {"pass", "pass", "pass", "pass", "fail", "fail", "fail"};
        String[] array = {};

        System.out.println("Input Array");
        for (String s : array) {
            System.out.print(s + ", ");
        }
        System.out.println();

        int low = 0, high = array.length - 1;
        int index = binarySearchInArray(low, high, array);
        System.out.println("First Failed commit is present in index = " + index);
    }

    private static int binarySearchInArray(int low, int high, String[] array) {
        // Terminal Condition
        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;

        // Condition Check
        if ("fail".equals(array[mid]) && (mid - 1 > 0 && "pass".equals(array[mid - 1])))
            return mid;

        // Iteration Check
        if (!"pass".equals(array[mid]))
            return binarySearchInArray(low, mid - 1, array);
        else
            return binarySearchInArray(mid + 1, high, array);
    }
}
