package handlers;

import problems.IntervalProbs;

public class IntervalProbsHandler {

    public void runIntervalProblems() {
        var intervalProbsObj = new IntervalProbs();

        // Insert Interval
        System.out.println("Insert Interval");
        var intervals = new int[][] { { 1, 3 }, { 6, 9 } };
        var newInterval = new int[] { 2, 5 };
        intervalProbsObj.print2DArray(intervalProbsObj.insertInterval(intervals, newInterval));

        // Merge Interval
        System.out.println("Merge Interval");
        var mergeintervals = new int[][] { { 1, 3 }, { 6, 9 } };
        intervalProbsObj.print2DArray(intervalProbsObj.mergeIntervals(mergeintervals));

    }
}
