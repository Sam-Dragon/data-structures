package com.learning.search.linear;

import java.util.Scanner;

public class IsTargetPresentInArray {

    public static void main(String[] args) {
//        int[] array = {3, 4, 6, 1, 2, 8, 7};
        int[] array = {};
        for (int val : array) {
            System.out.print(val + ", ");
        }
        System.out.println();

        System.out.println("Enter the element to search");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println("Element to Search" + target);

        boolean isPresent = isElementPresentInArrayForwardForLoop(array, target);
        System.out.println("Element Present in Array : " + isPresent);

        isPresent = isElementPresentInArrayBackwardForLoop(array, target);
        System.out.println("Element Present in Array : " + isPresent);

        isPresent = isElementPresentInArrayForwardWhileLoop(array, target);
        System.out.println("Element Present in Array : " + isPresent);

        isPresent = isElementPresentInArrayBackwardWhileLoop(array, target);
        System.out.println("Element Present in Array : " + isPresent);
    }

    private static boolean isElementPresentInArrayBackwardWhileLoop(int[] array, int target) {
        if (array.length == 0)
            return false;

        int length = array.length - 1;
        while (length >= 0) {
            if (target == array[length])
                return true;
            length--;
        }

        return false;
    }

    private static boolean isElementPresentInArrayForwardWhileLoop(int[] array, int target) {
        int i = 0;

        if (array.length == 0)
            return false;

        while (i < array.length) {
            if (target == array[i])
                return true;
            i++;
        }

        return false;
    }

    private static boolean isElementPresentInArrayForwardForLoop(int[] array, int target) {
        // validation
        if (array.length == 0)
            return false;

        // Iteration
        for (int i = 0; i < array.length; i++) {
            if (target == array[i])
                return true;
        }

        return false;
    }

    private static boolean isElementPresentInArrayBackwardForLoop(int[] array, int target) {
        // validation
        if (array.length == 0)
            return false;

        // Iteration
        for (int i = array.length - 1; i >= 0; i--) {
            if (target == array[i])
                return true;
        }

        return false;
    }
}
