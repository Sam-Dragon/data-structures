package com.learning.iteration_vs_recursion.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class SearchAnElementInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 16, 8, 9};
        System.out.println("Array Elements :: ");
        Arrays.stream(array)
              .boxed()
              .forEach(e -> System.out.print(e + ","));
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched ?");
        int number = sc.nextInt();
        System.out.println("Number to be searched in above array = " + number);

        SearchAnElementInArray object = new SearchAnElementInArray();

        int index = 0;
        boolean isElementPresentInArray = object.isElementPresentInArray(array, number, index);
        System.out.println("Is Number [" + number + "] present in array ? " + isElementPresentInArray);

    }

    private boolean isElementPresentInArray(int[] array, int number, int index) {
        if (index == array.length)
            return false;

        return array[index] == number || isElementPresentInArray(array, number, index + 1);
    }
}
