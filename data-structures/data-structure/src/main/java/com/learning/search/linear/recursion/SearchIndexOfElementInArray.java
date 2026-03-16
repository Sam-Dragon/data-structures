package com.learning.search.linear.recursion;

import java.util.Scanner;

public class SearchIndexOfElementInArray {

    static int iterations = 0;

    public static void main(String[] args) {

        int[] array = {2, 3, 5, 6, 15, 16, 18, 20};
        for (int val : array)
            System.out.print(val + ", ");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search");
        int target = sc.nextInt();
        System.out.println("Element to search = " + target);

        int index = searchElementInArray(0, target, array);
        System.out.println(target + " is present at index = " + index);

        System.out.println("Total Iterations = " + iterations);
    }

    private static int searchElementInArray(int index, int target, int[] array) {
        ++iterations;

        if (index == array.length)
            return -1;

        if (array[index] == target)
            return index;

        return searchElementInArray(index + 1, target, array);
    }
}
