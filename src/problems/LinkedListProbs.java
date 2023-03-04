package problems;

import DS.*;

public class LinkedListProbs {
    // To populate linked list
    public Node createLinkedList() {
        var node = new Node(1);
        var temp = node;
        for (int i = 2; i < 6; i++) {
            temp.nextNode = new Node(i);
            temp = temp.nextNode;
        }
        return node;
    }

    // To populate linked list with cycle
    public Node createLinkedListWithCycle() {
        var node = new Node(1);
        var temp = node;
        Node someNode = null;
        for (int i = 2; i < 6; i++) {
            if (i == 3)
                someNode = temp;
            temp.nextNode = new Node(i);
            temp = temp.nextNode;
        }
        temp.nextNode = someNode;
        return node;
    }

    // To print linked list
    public void printLinkedList(Node head) {
        System.out.println("The elements of linkedlist are: ");
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.nextNode;
        }
        System.out.println("");
    }

    /********* LinkedList Problems *********/

    public Node reverseLinkedList(Node head) {
        // Base condition
        if (head == null || head.nextNode == null) {
            return head;
        }

        Node result = null;
        while (head != null) {
            var temp = head;
            head = head.nextNode;
            temp.nextNode = result;
            result = temp;
        }
        return result;
    }

    public boolean detectLinkedListCycle(Node head) {
        // Base condition
        if (head == null || head.nextNode == null) {
            return false;
        }

        Node fast = head;
        Node slow = head;
        while (fast != null && fast.nextNode != null) {
            if (slow.value == fast.value)
                return true;
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
        }
        return false;
    }

    public Node removeNthNodeFromEnd(Node head, int n) {
        // Base condition
        if (head == null || head.nextNode == null) {
            return head;
        }

        Node left = head;
        Node right = head;
        for (int i = 0; i < n; i++) {
            right = right.nextNode;
        }
        if (right == null)
            return head.nextNode;
        while (right.nextNode != null) {
            right = right.nextNode;
            left = left.nextNode;
        }
        left.nextNode = left.nextNode.nextNode;
        return head;
    }

    public Node mergeTwoSortedList(Node head1, Node head2) {
        // Base condition
        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }

        Node result = new Node();
        Node temp = result;
        while (head1 != null && head2 != null) {
            if (head1.value <= head2.value) {
                temp.nextNode = head1;
                head1 = head1.nextNode;
            } else {
                temp.nextNode = head2;
                head2 = head2.nextNode;
            }
            temp = temp.nextNode;
        }

        while (head1 != null) {
            temp.nextNode = head1;
            head1 = head1.nextNode;
        }
        while (head2 != null) {
            temp.nextNode = head2;
            head2 = head2.nextNode;
        }

        return result.nextNode;
    }

    public Node middleOFtheList(Node head) {
        var slow = head;
        var fast = head;

        while (fast != null && fast.nextNode != null) {
            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;
        }

        return slow;
    }

    public Node reOrderLinkedList(Node head) {
        var result = new Node();
        var reverseLinkedList = reverseLinkedList(head);
        var middleOFtheList = middleOFtheList(head);
        var temp = result;

        while (head.value != middleOFtheList.value) {
            temp.nextNode = head;
            temp = temp.nextNode;
            temp.nextNode = reverseLinkedList;
            temp = temp.nextNode;
            head = head.nextNode;
            reverseLinkedList = reverseLinkedList.nextNode;
        }

        return result.nextNode;
    }
}