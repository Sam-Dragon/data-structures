package com.learning.iteration_vs_recursion.recursion.dynamic_programming.top_down_approach;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonacciSeriesOfNumber {

    static int iterations = 0, cacheRead = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for fibonacci series");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please provide Valid Number");
            return;
        }

        Map<Integer, Integer> cacheMap = new HashMap<>();
        int fibonacciSeriesTotal = fib(number, cacheMap);
        System.out.println("fib(" + number + ") = " + fibonacciSeriesTotal);
        System.out.println(
                "Total Iterations :: " + iterations + ", Cache Read :: " + cacheRead + ", Actual Execution :: " + (iterations - cacheRead));
//        System.out.println("cache map :: " + cacheMap);
    }

    private static int fib(int number, Map<Integer, Integer> cacheMap) {
        iterations++;
        if (cacheMap.containsKey(number)) {
            cacheRead++;
            return cacheMap.get(number);
        } else {
//            System.out.println("Execution Number :: " + number);
            if (number < 2) {
                cacheMap.put(number, number);
                return number;
            } else {
                int sum = fib(number - 1, cacheMap) + fib(number - 2, cacheMap);
                cacheMap.put(number, sum);
                return sum;
            }
        }
    }
}
