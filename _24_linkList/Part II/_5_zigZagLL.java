/*
Zig-Zag Linked List
For a linked list of the form : L(1) ->L(2) -> L(3)->L(4) ... L(n-1)->L(n)
convert it into a zig-zag form i.e. : L(1)- >L(n) -> L(2)->L(n-1) -> L(3)->L(n- 2)..
*/
public class _5_zigZagLL {
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

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

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

    public void addMiddle(int idx, int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        Node prev = head;
        int i = 0;
        while (i < idx - 1) {
            prev = prev.next;
            i++;
        }

        newNode.next = prev.next;
        prev.next = newNode;
    }

    public void printLinkList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Zig Zag Link List

    // Find Mid

    private Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid Node
    }

    public void zigZagLinkList() {

        // Reverse the half LinkList
        Node mid = findMid(head);
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Merge both LL
        Node leftHead = head;
        Node rightHead = prev;
        Node nextLeft, nextRight;
        while (leftHead != null && rightHead != null) {
            nextLeft = leftHead.next;
            leftHead.next = rightHead;

            nextRight = rightHead.next;
            rightHead.next = nextLeft;

            leftHead = nextLeft;
            rightHead = nextRight;
        }
    }

    public static void main(String[] args) {
        _5_zigZagLL ll = new _5_zigZagLL();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.printLinkList();

        ll.zigZagLinkList();

        ll.printLinkList();
    }
}
