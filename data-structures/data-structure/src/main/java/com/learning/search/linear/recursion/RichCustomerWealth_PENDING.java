package com.learning.search.linear.recursion;

public class RichCustomerWealth_PENDING {

    public static void main(String[] args) {
        int[][] accounts = {{3, 2, 1}, {1, 2, 3}};
//        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
//        int[][] accounts = {};
        for (int[] account : accounts) {
            for (int val : account)
                System.out.print(val + ", ");
            System.out.println();
        }
        System.out.println();

        int richest = findRichCustomerWealth(accounts);
        System.out.println("Rich customer wealth = " + richest);
    }

    private static int findRichCustomerWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int accountSum = 0;
            for (int val : account) {
                accountSum += val;
            }
            max = Math.max(accountSum, max);
        }

        return max;
    }
}
