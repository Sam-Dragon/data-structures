package com.learning.iteration_vs_recursion.dynamic_programming.top_down_approach;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClimbingStaircaseWith1or2Steps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int input = sc.nextInt();

        long startTime = System.currentTimeMillis();
        int result = new ClimbingStaircaseWith1or2Steps().climbStairsUsingHashmap(input);
        long endTime = System.currentTimeMillis();
        System.out.println("Map >> " + result + " executed in " + (endTime - startTime) + " secs");

        startTime = System.currentTimeMillis();
        result = new ClimbingStaircaseWith1or2Steps().climbStairsUsingArray(input);
        endTime = System.currentTimeMillis();
        System.out.println("Array >> " + result + " executed in " + (endTime - startTime) + " secs");
    }

    // SOLUTION 2
    private int climbStairsUsingArray(int n) {
        if (n < 1 || n > 45) {
            System.out.println("invalid input");
            return -1;
        }

        int[] array = new int[n + 1];
        int result = testUsingArray(n, array);

//        Arrays.stream(array)
//              .boxed()
//              .forEach(System.out::println);

        return result;
    }

    private int testUsingArray(int n, int[] array) {
        if (n < 2) {
            array[n] = 1;
            return 1;
        }

        int value = testUsingArray(n - 2, array) + testUsingArray(n - 1, array);
        array[n] = value;

        return array[n];
    }

    // SOLUTION 2
    public int climbStairsUsingHashmap(int n) {
        if (n < 1 || n > 45) {
            System.out.println("invalid input");
            return -1;
        }

        Map<Integer, Integer> cache = new HashMap<>();
        int result = testUsingHashmap(n, cache);

//        System.out.println(cache);

        return result;
    }

    private int testUsingHashmap(int n, Map<Integer, Integer> cache) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            if (n < 2) {
                cache.put(n, 1);
                return 1;
            }

            int value = testUsingHashmap(n - 1, cache) + testUsingHashmap(n - 2, cache);
            cache.put(n, value);
            return value;
        }
    }
}
