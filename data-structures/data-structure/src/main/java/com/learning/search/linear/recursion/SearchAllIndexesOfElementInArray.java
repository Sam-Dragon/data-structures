package com.learning.search.linear.recursion;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SearchAllIndexesOfElementInArray {

    public static void main(String[] args) {

        int[] array = {2, 3, 5, 6, 6, 15, 16, 18, 20};
        for (int val : array)
            System.out.print(val + ", ");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search");
        int target = sc.nextInt();
        System.out.println("Element to search = " + target);

        List<Integer> list = new LinkedList<>();
        List<Integer> indexes = searchElementInArrayUsingListArg(0, target, array, list);
        System.out.println(target + " is present at indexes = " + indexes);

        indexes = searchElementInArrayUsingListLocal(0, target, array);
        System.out.println(target + " is present at indexes = " + indexes);
    }

    private static List<Integer> searchElementInArrayUsingListArg(int index, int target, int[] array,
                                                                  List<Integer> list) {
        if (index == array.length)
            return list;

        if (array[index] == target)
            list.add(index);

        return searchElementInArrayUsingListArg(index + 1, target, array, list);
    }

    private static List<Integer> searchElementInArrayUsingListLocal(int index, int target, int[] array) {
        List<Integer> list = new LinkedList<>();

        if (index == array.length)
            return list;

        if (array[index] == target)
            list.add(index);

        List<Integer> prevList = searchElementInArrayUsingListLocal(index + 1, target, array);
        list.addAll(prevList);

        return list;
    }
}
