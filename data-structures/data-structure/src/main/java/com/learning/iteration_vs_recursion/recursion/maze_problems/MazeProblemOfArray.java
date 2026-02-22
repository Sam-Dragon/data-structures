package com.learning.iteration_vs_recursion.recursion.maze_problems;

import java.util.ArrayList;
import java.util.List;

public class MazeProblemOfArray {

    public static void main(String[] args) {

        // Maze problem - DOWN AND RIGHT
//        System.out.println(countUsingDownAndRight(3, 3));
//        countPathsUsingDownAndRight("", 3, 3);
//        System.out.println(savePathsUsingDownAndRight("", 3, 3));

        // Maze problem - DOWN, DIAGONAL AND RIGHT
        System.out.println(savePathsUsingDownDiagonalAndRight("", 3, 3));
    }

    private static int countUsingDownAndRight(int row, int col) {
        if (row == 1 || col == 1)
            return 1;

        int left = countUsingDownAndRight(row - 1, col);
        int right = countUsingDownAndRight(row, col - 1);

        return left + right;
    }

    private static void countPathsUsingDownAndRight(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(processed);
            return;
        }

        if (row > 1)
            countPathsUsingDownAndRight(processed + "D", row - 1, col);

        if (col > 1)
            countPathsUsingDownAndRight(processed + "R", row, col - 1);

    }

    private static List<String> savePathsUsingDownAndRight(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        List<String> totalList = new ArrayList<>();

        if (row > 1)
            totalList.addAll(savePathsUsingDownAndRight(processed + "D", row - 1, col));

        if (col > 1)
            totalList.addAll(savePathsUsingDownAndRight(processed + "R", row, col - 1));

        return totalList;
    }

    private static List<String> savePathsUsingDownDiagonalAndRight(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        List<String> totalList = new ArrayList<>();


        if (row > 1) {
            totalList.addAll(savePathsUsingDownDiagonalAndRight(processed + "V", row - 1, col));
        }


        if (col > 1) {
            totalList.addAll(savePathsUsingDownDiagonalAndRight(processed + "H", row, col - 1));
        }

        if (row > 1 && col > 1) {
            totalList.addAll(savePathsUsingDownDiagonalAndRight(processed + "D", row - 1, col - 1));
        }

        return totalList;
    }
}
