package com.learning.iteration_vs_recursion.iteration;

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

        boolean isElementPresentUsingForLoop = object.isElementPresentUsingForLoop(array, number);
        System.out.println("Is Number [" + number + "] present in array ? " + isElementPresentUsingForLoop);

        boolean isElementPresentUsingWhileLoop = object.isElementPresentUsingWhileLoop(array, number);
        System.out.println("Is Number [" + number + "] present in array ? " + isElementPresentUsingWhileLoop);

    }

    private boolean isElementPresentUsingWhileLoop(int[] array, int number) {
        int index = 0;
        while (index < array.length) {
            if (array[index] == number)
                return true;

            index++;
        }

        return false;
    }

    private boolean isElementPresentUsingForLoop(int[] array, int number) {
        for (int arrayNum : array) {
            if (arrayNum == number) {
                return true;
            }
        }

        return false;
    }
}
