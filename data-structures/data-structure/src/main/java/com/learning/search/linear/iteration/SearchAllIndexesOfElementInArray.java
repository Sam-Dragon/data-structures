package com.learning.search.linear.iteration;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SearchAllIndexesOfElementInArray {

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 6, 6, 15, 16, 18, 20};
//        int[] array = {};
        for (int val : array) {
            System.out.print(val + ", ");
        }
        System.out.println();

        System.out.println("Enter the element to search");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println("Element Index to Search" + target);

        List<Integer> index = isElementPresentInArrayForwardForLoop(array, target);
        System.out.println("Element Index in Array : " + index);

        index = isElementPresentInArrayBackwardForLoop(array, target);
        System.out.println("Element Index in Array : " + index);

        index = isElementPresentInArrayForwardWhileLoop(array, target);
        System.out.println("Element Index in Array : " + index);

        index = isElementPresentInArrayBackwardWhileLoop(array, target);
        System.out.println("Element Index in Array : " + index);
    }

    private static List<Integer> isElementPresentInArrayBackwardWhileLoop(int[] array, int target) {
        List<Integer> list = new LinkedList<>();

        if (array.length == 0)
            return list;

        int length = array.length - 1;
        while (length >= 0) {
            if (target == array[length])
                list.add(length);
            length--;
        }

        return list;
    }

    private static List<Integer> isElementPresentInArrayForwardWhileLoop(int[] array, int target) {
        int i = 0;
        List<Integer> list = new LinkedList<>();

        if (array.length == 0)
            return list;

        while (i < array.length) {
            if (target == array[i])
                list.add(i);
            i++;
        }

        return list;
    }

    private static List<Integer> isElementPresentInArrayForwardForLoop(int[] array, int target) {
        List<Integer> list = new LinkedList<>();

        // validation
        if (array.length == 0)
            return list;

        // Iteration
        for (int i = 0; i < array.length; i++) {
            if (target == array[i])
                list.add(i);
        }

        return list;
    }

    private static List<Integer> isElementPresentInArrayBackwardForLoop(int[] array, int target) {
        List<Integer> list = new LinkedList<>();

        // validation
        if (array.length == 0)
            return list;

        // Iteration
        for (int i = array.length - 1; i >= 0; i--) {
            if (target == array[i])
                list.add(i);
        }

        return list;
    }
}
