package learn.recurrsion;

import java.util.Scanner;

public class SquareOfNumbers {

    public static void main(String[] args) {
        System.out.println();

        System.out.println("Enter a number to find square sum of: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Entered number is: " + n);

        System.out.println("\nsquare sum (" + n + ") = " + square(n));
    }

    private static int square(int n) {
        if (n == 1) {
            System.out.println("Square(" + n + ") = " + (n * n));
            return 1;
        }

        System.out.println("Square(" + n + ") = " + (n * n));
        return (n * n) + square(n - 1);
    }
}
