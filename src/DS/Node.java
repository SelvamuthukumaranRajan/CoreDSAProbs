package DS;

public class Node {
    public int value;
    public Node nextNode;

    public Node() {

    }

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node [value=" + value + ", nextNode=" + nextNode + "]";
    }
}