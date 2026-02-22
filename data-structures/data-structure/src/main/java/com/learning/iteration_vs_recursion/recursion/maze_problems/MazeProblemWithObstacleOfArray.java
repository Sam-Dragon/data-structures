package com.learning.iteration_vs_recursion.recursion.maze_problems;

import java.util.ArrayList;
import java.util.List;

public class MazeProblemWithObstacleOfArray {

    public static void main(String[] args) {

        // Maze problem - DOWN, DIAGONAL AND RIGHT
        System.out.println(savePathsUsingDownDiagonalAndRight("", 3, 3));

        boolean[][] array = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        System.out.println(savePathsUsingDownDiagonalAndRightUsingArray("", array, 0, 0));
    }

    private static List<String> savePathsUsingDownDiagonalAndRight(String processed, int row, int col) {
        if (row == 1 && col == 1) {
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        List<String> totalList = new ArrayList<>();

        if (row > 1 && col != 2) {
            totalList.addAll(savePathsUsingDownDiagonalAndRight(processed + "V", row - 1, col));
        }

        if (col > 1 && row != 2) {
            totalList.addAll(savePathsUsingDownDiagonalAndRight(processed + "H", row, col - 1));
        }

        return totalList;
    }

    private static List<String> savePathsUsingDownDiagonalAndRightUsingArray(String processed, boolean[][] array,
                                                                             int row,
                                                                             int col) {
        if (row == array.length - 1 && col == array[0].length - 1) {
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }


        List<String> totalList = new ArrayList<>();

        if (!array[row][col])
            return totalList;

        if (row < array.length - 1)
            totalList.addAll(savePathsUsingDownDiagonalAndRightUsingArray(processed + "V", array, row + 1, col));

        if (col < array[0].length - 1)
            totalList.addAll(savePathsUsingDownDiagonalAndRightUsingArray(processed + "H", array, row, col + 1));

        return totalList;
    }
}
