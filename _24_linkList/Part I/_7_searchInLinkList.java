/*
Iterative Search (Iterative)
    Search for a key in a Linked List. Return the position where it is found. If not found, return -1.

Search (Recursive)
    Search for a key in a Linked List. Return the position where it is found. If not found, return -1. Use Recursion.
 */
public class _7_searchInLinkList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printLinkList() {
        if (head == null) {
            System.out.println("LinkList is Empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Search (Iterative)
    public int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    // Search (Recursion)

    public int helper(int key, Node hNode) {

        if (head == null) {
            return -1;
        }

        if (hNode.data == key) {
            return 0;
        }

        int idx = helper(key, hNode.next);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recursiveSearch(int key) {
        return helper(key, head);
    }

    public static void main(String[] args) {
        _7_searchInLinkList ll = new _7_searchInLinkList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        // ll.printLinkList();

        // System.out.println(size);

        // System.out.println(ll.iterativeSearch(3));

        System.out.println(ll.recursiveSearch(3));

    }
}
