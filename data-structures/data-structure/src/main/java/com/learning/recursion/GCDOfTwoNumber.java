package com.learning.recursion;

import java.util.Scanner;

public class GCDOfTwoNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("GCD of Two Number");

        System.out.println("Enter the First Number");
        int first = sc.nextInt();

        System.out.println("Enter the Second Number");
        int second = sc.nextInt();

        int gcdOfTwoNumber = gcdOfTwoNumber(first, second);
        System.out.println("GCD(" + first + "," + second + ")=" + gcdOfTwoNumber);
    }

    private static int gcdOfTwoNumber(int first, int second) {
        if (first == 0)
            return second;

        if (second == 0)
            return first;

        if (first > second)
            return gcdOfTwoNumber(first % second, second);
        else
            return gcdOfTwoNumber(first, second % first);
    }
}
