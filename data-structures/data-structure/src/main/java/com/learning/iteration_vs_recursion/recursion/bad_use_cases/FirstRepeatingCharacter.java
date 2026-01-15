package com.learning.iteration_vs_recursion.recursion.bad_use_cases;

import java.util.Arrays;
import java.util.HashMap;

public class FirstRepeatingCharacter {

    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 1, 2, 3, 5, 1, 2, 4};
        Arrays.stream(array)
              .boxed()
              .forEach(e -> System.out.print(e + ", "));
        System.out.println();

        HashMap<Integer, Integer> map = new HashMap<>();
        int length = array.length - 1;
        int index = 0;
        int firstRepeatingCharacter = firstRepeatingCharacter(array, index, length, map);
        System.out.println(firstRepeatingCharacter);


        // USE CASE 2
        System.out.println("Use Case 2");
        array = new int[]{2, 1, 1, 2, 3, 5, 1, 2, 4};
        Arrays.stream(array)
              .boxed()
              .forEach(e -> System.out.print(e + ", "));
        System.out.println();

        map = new HashMap<>();
        length = array.length - 1;
        index = 0;
        firstRepeatingCharacter = firstRepeatingCharacter(array, index, length, map);
        System.out.println(firstRepeatingCharacter);

        // USE CASE 3
        System.out.println("Use Case 3");
        array = new int[]{2, 3, 4, 5};
        Arrays.stream(array)
              .boxed()
              .forEach(e -> System.out.print(e + ", "));
        System.out.println();

        map = new HashMap<>();
        length = array.length - 1;
        index = 0;
        firstRepeatingCharacter = firstRepeatingCharacter(array, index, length, map);
        System.out.println(firstRepeatingCharacter);
    }

    private static int firstRepeatingCharacter(int[] array, int index, int length, HashMap<Integer, Integer> map) {
        if (index > length)
            return -1;

        // Terminal Condition
        if (map.containsKey(array[index]))
            return array[index];

        // Add to map
        map.put(array[index], array[index]);

        // Process
        return firstRepeatingCharacter(array, index + 1, length, map);
    }
}
