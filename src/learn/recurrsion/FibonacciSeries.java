package learn.recurrsion;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        FibonacciSeries fib = new FibonacciSeries();
        System.out.println();

        System.out.println("Enter a number for fibonacci series : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Entered number is: " + n);

        System.out.println("\nfibonacci series(" + n + ") = " + fib.fibonacci_series(n));
    }

    private int fibonacci_series(int n) {
        if (n == 1) {
            System.out.print("0 ,");
            return 0;
        }
        if (n == 2) {
            System.out.print("1 ,");
            return 1;
        }

        return fibonacci_series(n - 1) + fibonacci_series(n - 2);
    }
}
