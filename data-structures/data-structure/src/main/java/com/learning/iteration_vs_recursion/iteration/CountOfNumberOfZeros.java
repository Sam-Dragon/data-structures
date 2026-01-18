package com.learning.iteration_vs_recursion.iteration;

import java.util.Scanner;

public class CountOfNumberOfZeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = sc.nextInt();
        System.out.println("Input entered :: " + number);

        int count = countOfNumberOfZerosUsingForLoop(number);
        System.out.println(count);

        count = countOfNumberOfZerosUsingWhileLoop(number);
        System.out.println(count);
    }

    private static int countOfNumberOfZerosUsingForLoop(int number) {
        int count = 0;

        for (; ; ) {
            if (number == 0)
                break;

            if (number % 10 == 0)
                count++;

            number /= 10;
        }

        return count;
    }

    private static int countOfNumberOfZerosUsingWhileLoop(int number) {
        int count = 0;

        while (number > 0) {
            if (number % 10 == 0)
                count++;

            number /= 10;
        }

        return count;
    }


}
