import handlers.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Linked List Problems
        var linkedListProbsObj = new LinkedListProbsHandler();
        linkedListProbsObj.runLinkedListProblems();

        // Interval Problems
        var intervalProbsObj = new IntervalProbsHandler();
        intervalProbsObj.runIntervalProblems();

        // Interval Problems
        var stringProbsObj = new StringProbsHandler();
        stringProbsObj.runStringProblems();
    }
}
