package com.learning.search.linear;

import java.util.Scanner;

public class FindTargetIndexInArray {

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
        System.out.println("Element Index to Search" + target);

        int index = isElementPresentInArrayForwardForLoop(array, target);
        System.out.println("Element Index in Array : " + index);

        index = isElementPresentInArrayBackwardForLoop(array, target);
        System.out.println("Element Index in Array : " + index);

        index = isElementPresentInArrayForwardWhileLoop(array, target);
        System.out.println("Element Index in Array : " + index);

        index = isElementPresentInArrayBackwardWhileLoop(array, target);
        System.out.println("Element Index in Array : " + index);
    }

    private static int isElementPresentInArrayBackwardWhileLoop(int[] array, int target) {
        if (array.length == 0)
            return Integer.MIN_VALUE;

        int length = array.length - 1;
        while (length >= 0) {
            if (target == array[length])
                return length;
            length--;
        }

        return Integer.MIN_VALUE;
    }

    private static int isElementPresentInArrayForwardWhileLoop(int[] array, int target) {
        int i = 0;

        if (array.length == 0)
            return Integer.MIN_VALUE;

        while (i < array.length) {
            if (target == array[i])
                return i;
            i++;
        }

        return Integer.MIN_VALUE;
    }

    private static int isElementPresentInArrayForwardForLoop(int[] array, int target) {
        // validation
        if (array.length == 0)
            return Integer.MIN_VALUE;

        // Iteration
        for (int i = 0; i < array.length; i++) {
            if (target == array[i])
                return i;
        }

        return Integer.MIN_VALUE;
    }

    private static int isElementPresentInArrayBackwardForLoop(int[] array, int target) {
        // validation
        if (array.length == 0)
            return Integer.MIN_VALUE;

        // Iteration
        for (int i = array.length - 1; i >= 0; i--) {
            if (target == array[i])
                return i;
        }

        return Integer.MIN_VALUE;
    }
}
