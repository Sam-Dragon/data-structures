package com.learning.sliding_window;

import java.util.Scanner;

public class MaxWeeklySales {

    public static void main(String[] args) {
        System.out.println("Sales Array By Days");
//        int[] sales = {0, 3, 7, 12, 10, 5, 0, 1, 0, 15, 12, 11, 1};
//        int[] sales = {0, 3, 7, 12};
//        int[] sales = {};
        int[] sales = {0, 3, 7, 12, 10, 5, 0};
        for (int i : sales)
            System.out.print(i + ", ");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days to find max sale");
        int days = sc.nextInt();
        System.out.println("Looking for max sale for " + days + " days");

        int mostSales = findMostSalesIn7Days(sales, days);
        System.out.println("Most sales in " + days + " days = " + mostSales);
    }

    private static int findMostSalesIn7Days(int[] sales, int days) {
        int mostSales = 0, right = 0, left = 0;
        int length = sales.length;

        // Validation
        if (days - 1 > length)
            return mostSales;

        int presentSale = 0;
        while (right < length) {
            // Move right till 7
            presentSale += sales[right++];

            if (right > days) {
                presentSale -= sales[left++];
                mostSales = Math.max(mostSales, presentSale);
            } else {
                mostSales = presentSale;
            }
        }

        return mostSales;
    }
}
