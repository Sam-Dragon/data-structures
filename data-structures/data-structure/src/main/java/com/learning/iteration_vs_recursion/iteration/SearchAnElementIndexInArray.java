package com.learning.iteration_vs_recursion.iteration;

import java.util.Arrays;
import java.util.Scanner;

public class SearchAnElementIndexInArray {

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

        SearchAnElementIndexInArray object = new SearchAnElementIndexInArray();

        int isElementPresentIndexUsingForLoop = object.isElementPresentIndexUsingForLoop(array, number);
        System.out.println("Is Number [" + number + "] present in array index ? " + isElementPresentIndexUsingForLoop);

        int isElementPresentIndexUsingWhileLoop = object.isElementPresentIndexUsingWhileLoop(array, number);
        System.out.println("Is Number [" + number + "] present in array index ? " + isElementPresentIndexUsingWhileLoop);

    }

    private int isElementPresentIndexUsingWhileLoop(int[] array, int number) {
        int index = 0;
        while (index < array.length) {
            if (array[index] == number)
                break;

            index++;
        }

        return index;
    }

    private int isElementPresentIndexUsingForLoop(int[] array, int number) {
        int i = 0;
        for (; i < array.length; i++) {
            if (array[i] == number) {
                break;
            }
        }
        return i;
    }
}
