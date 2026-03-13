package com.learning.perfix_sums.iteration;

public class BalancePoint {

    public static void main(String[] args) {

        System.out.println("Input Array");
        int[] array = {3, 5, -2, 7, 2, 2, 2};
//        int[] array = {3, 5, -2, 7, 2, 2};
//        int[] array = {};
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();

        System.out.println("Balance Point Index");
        int balancePoint = getBalancePoint(array);
        System.out.println(balancePoint);
    }

    private static int getBalancePoint(int[] array) {

        int left = 0, right = array.length - 1;
        int leftSum = 0, rightSum = 0;

        // Validate boundary condition
        while (left < array.length && right >= 0) {
            leftSum += array[left];
            rightSum += array[right];

            if (leftSum == rightSum && left != array.length - 1 && right != 0)
                return left + 1;

            left++;
            right--;
        }

        return -1;
    }
}
