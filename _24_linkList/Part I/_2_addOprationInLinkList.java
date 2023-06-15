/*
Adding a new node in linklist has two ways

1. Add First

2. Add Last
 
 */
public class _2_addOprationInLinkList {

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

    // Adding Element At Firt Possion --> TC = O(1)
    public void addFirst(int data) {

        // Step 1 --> Create New Node.
        Node newNode = new Node(data);

        if (head == null)  // If LinkList is Null
        {
            head = tail = newNode;
            return;
        }

        // Step 2 --> newNode next = head
        newNode.next = head;

        // Step 3 --> head = newNode
        head = newNode;

    }

    // Adding Element At Last Possion
    public void addLast(int data) {

        // Step 1 --> Create a New Node
        Node newNode = new Node(data);

        if (head == null) // If LinkList is Null
        {
            head = tail = newNode;
            return;
        }

        // Step 2 --> tail next = newNode;
        tail.next=newNode;
        
        // Step 3 --> tail = newNode;
        tail = newNode;
    }

    public static void main(String[] args) {
        _2_addOprationInLinkList ll = new _2_addOprationInLinkList();

        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        
        ll.addFirst(0);
        ll.addFirst(-1);

        ll.addLast(3); 
        ll.addLast(4);

    }

}
