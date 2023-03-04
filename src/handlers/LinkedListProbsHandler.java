package handlers;

import problems.LinkedListProbs;

public class LinkedListProbsHandler {

    public void runLinkedListProblems() {
        var linkedListProbsObj = new LinkedListProbs();
        var linkedList = linkedListProbsObj.createLinkedList();
        linkedListProbsObj.printLinkedList(linkedList);

        // Reverse Linked List
        System.out.println("Reverse Linked List");
        linkedListProbsObj.printLinkedList(linkedListProbsObj.reverseLinkedList(linkedList));

        // Detect linked list cycle
        System.out.println("Detect Linked List Cycle");
        var linkedListWithCycle = linkedListProbsObj.createLinkedListWithCycle();
        System.out.println(linkedListProbsObj.detectLinkedListCycle(linkedList));
        System.out.println(linkedListProbsObj.detectLinkedListCycle(linkedListWithCycle));

        // Remove nth Node from end of the list
        System.out.println("Remove nth node from Linked List");
        linkedListProbsObj.printLinkedList(linkedListProbsObj.removeNthNodeFromEnd(
                linkedListProbsObj.createLinkedList(), 2));

        // Merge two sorted list
        System.out.println("Merge two sorted Linked List");
        var head1 = linkedListProbsObj.createLinkedList();
        var head2 = linkedListProbsObj.createLinkedList();
        linkedListProbsObj.printLinkedList(linkedListProbsObj.mergeTwoSortedList(head1,
                head2));

        // Middle element of Linked list
        System.out.println("Middle element of Linked List");
        var head = linkedListProbsObj.createLinkedList();
        var middleOFtheList = linkedListProbsObj.middleOFtheList(head);
        System.out.println(middleOFtheList.value);

        // Reorder Linked List
        System.out.println("Reorder Linked List");
        var list = linkedListProbsObj.createLinkedList();
        linkedListProbsObj.printLinkedList(linkedListProbsObj.reOrderLinkedList(list));
    }

}