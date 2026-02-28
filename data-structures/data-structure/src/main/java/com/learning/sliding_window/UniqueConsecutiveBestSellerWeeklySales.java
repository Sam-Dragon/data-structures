package com.learning.sliding_window;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueConsecutiveBestSellerWeeklySales {

    public static void main(String[] args) {
        System.out.println("Sales Array By Days");
//        String[] sales = {"book3", "book1", "book3", "book3", "book2", "book3", "book4", "book3"};
        String[] sales = {"book3", "book1", "book2"};
        for (String i : sales)
            System.out.print(i + ", ");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days to find max sale");
        int days = sc.nextInt();
        System.out.println("Looking for max sale for " + days + " days");

        boolean mostSales = findMostSalesIn7Days(sales, days);
        System.out.println("Most sales in " + days + " days = " + mostSales);
    }

    private static boolean findMostSalesIn7Days(String[] sales, int days) {
        String[] consecutiveSales = new String[sales.length];
        int right = 0, left = 0;
        boolean isConsecutiveSales = false;
        int length = sales.length;

        // Validation
        if (days - 1 > length)
            return isConsecutiveSales;

        while (right < length) {
            // Check for more than 3 numbers
            consecutiveSales[right] = sales[right];
            right += 1;

            if (right > days) {
                consecutiveSales[left] = sales[left];
                left += 1;

                isConsecutiveSales = Arrays.stream(consecutiveSales)
                                           .skip(left)
                                           .limit(days)
                                           .distinct()
                                           .count() == 3;

                if (isConsecutiveSales) {
                    Arrays.stream(consecutiveSales)
                          .skip(left)
                          .limit(days)
                          .forEach(System.out::println);
                    return isConsecutiveSales;
                }
            } else {
                isConsecutiveSales = Arrays.stream(consecutiveSales)
                                           .skip(left)
                                           .limit(days)
                                           .distinct()
                                           .count() == 3;
            }
        }

        return isConsecutiveSales;
    }
}
