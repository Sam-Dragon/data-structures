package learn.recurrsion;

import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String[] args) {
        System.out.println();

        System.out.println("Enter a number to calculate factorial: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Entered number is: " + n);

        System.out.println("factorial(" + n + ") = " + factorial(n));
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
