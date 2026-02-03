package com.learning.search.binary.iteration;

import java.util.Scanner;

public class FloorOfNumberInArray {

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 9, 14, 16, 18};
        System.out.println("Input Array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to floor");
        int target = sc.nextInt();
        System.out.println("Element to floor = " + target);

        int low = 0, high = array.length - 1;
        int findFloorOfNumberUsingForLoop = findFloorOfNumberUsingForLoop(low, high, array, target);
        System.out.println(target + " is Floor at number = " + findFloorOfNumberUsingForLoop);

        int findFloorOfNumberUsingWhileLoop = findFloorOfNumberUsingWhileLoop(low, high, array, target);
        System.out.println(target + " is Floor at number = " + findFloorOfNumberUsingWhileLoop);
    }

    private static int findFloorOfNumberUsingForLoop(int low, int high, int[] array, int target) {
        for (; low <= high; ) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target)
                return array[mid];

            if (target > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (low > array.length || high < 0)
            high = array.length - 1;

        return array[high];
    }

    private static int findFloorOfNumberUsingWhileLoop(int low, int high, int[] array, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target)
                return array[mid];

            if (target > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (low > array.length || high < 0)
            high = array.length - 1;

        return array[high];
    }
}
