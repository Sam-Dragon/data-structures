package com.learning.iteration_vs_recursion.recursion.dynamic_programming.top_down_approach;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClimbingStaircaseWith1or2Steps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input");
        int input = sc.nextInt();

        int result = new ClimbingStaircaseWith1or2Steps().climbStairs(input);
        System.out.println(result);
    }

    public int climbStairs(int n) {
        if (n < 1 || n > 45) {
            System.out.println("invalid input");
            return -1;
        }

        Map<Integer, Integer> cache = new HashMap<>();
        return test(n, cache);
    }

    private int test(int n, Map<Integer, Integer> cache) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            if (n < 2) {
                cache.put(n, 1);
                return 1;
            }

            int value = test(n - 1, cache) + test(n - 2, cache);
            cache.put(n, value);
            return value;
        }
    }
}
