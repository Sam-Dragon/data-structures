package learn.recurrsion;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        System.out.println();

        System.out.println("Enter a number to find sum: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Entered number is: " + n);

        System.out.println("Numbers to sum are ::");
        System.out.println("\nsum(" + n + ") = " + sum(n));
    }

    private static int sum(int n) {
        if (n == 1) {
            System.out.print("1");
            return 1;
        }

        int sum = n + sum(n - 1);
        System.out.print(", " + n);

        return sum;
    }
}
