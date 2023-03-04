package problems;

import java.util.*;

public class IntervalProbs {
    public int[][] insertInterval(int[][] intervals, int[] newInterval) {
        int[][] merged = new int[intervals.length + 1][];
        int index = 0;
        for (int[] i : intervals) {
            merged[index++] = i;
        }
        merged[intervals.length] = newInterval;
        Arrays.sort(merged, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        for (int[] arr : merged) {
            if (result.size() == 0)
                result.add(arr);
            else {
                int[] prevArr = result.get(result.size() - 1);
                if (arr[0] <= prevArr[1]) {
                    prevArr[1] = Math.max(prevArr[1], arr[1]);
                } else
                    result.add(arr);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    public int[][] mergeIntervals(int[][] intervals) {
        if (intervals.length == 0)
            return intervals;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        int[] temp = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (temp[1] >= intervals[i][0]) {
                temp[1] = Math.max(temp[1], intervals[i][1]);
            } else {
                result.add(temp);
                temp = intervals[i];
            }
        }
        result.add(temp);
        return result.toArray(new int[result.size()][]);
    }

    public void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
