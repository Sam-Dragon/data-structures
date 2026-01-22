package com.learning.iteration_vs_recursion.recursion;

import java.util.*;

public class SearchAnElementIndexInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 16, 8, 9, 5};
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

        int index = 0;
        List<Integer> arrayIndexes = object.isElementPresentInArray(array, number, index, new ArrayList<>());
        System.out.println("Is Number [" + number + "] present in array index ? " + arrayIndexes);

        List<Integer> arrayIndexesInternal = object.isElementPresentInArrayWithInternalList(array, number, index);
        System.out.println("Is Number [" + number + "] present in array index ? " + arrayIndexesInternal);
    }

    private List<Integer> isElementPresentInArray(int[] array, int number, int index, List<Integer> list) {
        if (index == array.length) {
            return list;
        }

        if (array[index] == number) {
            list.add(index);
        }

        return isElementPresentInArray(array, number, index + 1, list);
    }

    private List<Integer> isElementPresentInArrayWithInternalList(int[] array, int number, int index) {
        List<Integer> list = new LinkedList<>();

        if (index == array.length) {
            return list;
        }

        if (array[index] == number) {
            list.add(index);
        }

        List<Integer> returnList = isElementPresentInArrayWithInternalList(array, number, index + 1);
        list.addAll(returnList);

        return list;
    }
}
