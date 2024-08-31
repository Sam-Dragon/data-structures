package learn.recurrsion;

import java.util.Scanner;

public class CubeOfNumbers {

    public static void main(String[] args) {
        System.out.println();

        System.out.println("Enter a number to find cube sum of: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Entered number is: " + n);

        System.out.println("\ncube sum (" + n + ") = " + cube(n));
    }

    private static int cube(int n) {
        if (n == 1) {
            System.out.println("cube(" + n + ") = " + (n * n * n));
            return 1;
        }

        System.out.println("cube(" + n + ") = " + (n * n * n));
        return (n * n * n) + cube(n - 1);
    }
}
