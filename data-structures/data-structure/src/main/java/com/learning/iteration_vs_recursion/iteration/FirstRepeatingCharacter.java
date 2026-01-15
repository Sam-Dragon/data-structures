package com.learning.iteration_vs_recursion.iteration;

import java.util.Arrays;
import java.util.HashMap;

public class FirstRepeatingCharacter {

    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 1, 2, 3, 5, 1, 2, 4};
        Arrays.stream(array)
              .boxed()
              .forEach(e -> System.out.print(e + ", "));
        System.out.println();

        int firstRepeatingCharacterUsingForLoop = firstRepeatingCharacterUsingForLoop(array);
        System.out.println(firstRepeatingCharacterUsingForLoop);

        int firstRepeatingCharacterUsingWhileLoop = firstRepeatingCharacterUsingWhileLoop(array);
        System.out.println(firstRepeatingCharacterUsingWhileLoop);

        // USE CASE 2
        System.out.println("Use Case 2");
        array = new int[]{2, 1, 1, 2, 3, 5, 1, 2, 4};
        Arrays.stream(array)
              .boxed()
              .forEach(e -> System.out.print(e + ", "));
        System.out.println();

        firstRepeatingCharacterUsingForLoop = firstRepeatingCharacterUsingForLoop(array);
        System.out.println(firstRepeatingCharacterUsingForLoop);

        firstRepeatingCharacterUsingWhileLoop = firstRepeatingCharacterUsingWhileLoop(array);
        System.out.println(firstRepeatingCharacterUsingWhileLoop);

        // USE CASE 3
        System.out.println("Use Case 3");
        array = new int[]{2, 3, 4, 5};
        Arrays.stream(array)
              .boxed()
              .forEach(e -> System.out.print(e + ", "));
        System.out.println();

        firstRepeatingCharacterUsingForLoop = firstRepeatingCharacterUsingForLoop(array);
        System.out.println(firstRepeatingCharacterUsingForLoop);

        firstRepeatingCharacterUsingWhileLoop = firstRepeatingCharacterUsingWhileLoop(array);
        System.out.println(firstRepeatingCharacterUsingWhileLoop);
    }

    private static int firstRepeatingCharacterUsingWhileLoop(int[] array) {
        int index = 0, firstRepeatingCharacter = -1;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (index < array.length) {
            if (map.containsKey(array[index])) {
                firstRepeatingCharacter = array[index];
                break;
            } else
                map.put(array[index], array[index]);

            index++;
        }

        return firstRepeatingCharacter;
    }

    private static int firstRepeatingCharacterUsingForLoop(int[] array) {
        int firstRepeatingCharacter = -1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            if (map.containsKey(num)) {
                firstRepeatingCharacter = num;
                break;
            } else
                map.put(num, num);
        }

        return firstRepeatingCharacter;
    }
}
