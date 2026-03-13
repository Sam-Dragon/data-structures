package com.learning.perfix_sums.iteration;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Problem: Sum based on indices
 * Solution: Iterate through the one array and get sum
 */
public class ChannelViews {

    public static void main(String[] args) {

        System.out.println("Channel Views");
        int[] views = {3, 5, 4, 8, 7, 2, 5, 3, 2, 3};
        for (int i : views)
            System.out.print(i + " ");
        System.out.println();

        System.out.println("Channel Periods");
        int[][] periods = {{0, 1}, {0, 5}, {5, 8}, {3, 3}};
        for (int[] period : periods)
            System.out.println(period[0] + ", " + period[1]);
        System.out.println();

        List<Integer> sums = getChannelSums(views, periods);
        System.out.println(sums);


        sums = getChannelSumsUsingTotalSums(views, periods);
        System.out.println(sums);
    }

    // NOT FEASIBLE FOR INFINITE ARRAYS
    private static List<Integer> getChannelSumsUsingTotalSums(int[] views, int[][] periods) {
        // Prepare all sums and put in array
        Map<Integer, Integer> sumMap = new TreeMap<>();

        int sum = 0;
        for (int i = 0; i < views.length; i++) {
            sum += views[i];
            sumMap.put(i, sum);
        }

        List<Integer> sums = new LinkedList<>();
        for (int[] period : periods) {
            if (period[0] != 0)
                sums.add(sumMap.getOrDefault(period[1], 0) - sumMap.getOrDefault(period[0] - 1, 0));
            else
                sums.add(sumMap.get(period[1]));
        }
        return sums;
    }

    private static List<Integer> getChannelSums(int[] views, int[][] periods) {
        // Take Channel Period Array as First And Last Index and get elements from views array
        List<Integer> sums = new LinkedList<>();

        for (int[] period : periods) {
            int sum = 0;
            int viewsLength = views.length - 1;
            if (period[0] <= viewsLength && period[1] <= viewsLength) {
                for (int i = period[0]; i <= period[1]; i++) {
                    sum += views[i];
                }
            }
            sums.add(sum);
        }

        return sums;
    }
}
