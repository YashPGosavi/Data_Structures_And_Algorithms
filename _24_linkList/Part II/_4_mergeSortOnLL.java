// TC --> n(lon n)
public class _4_mergeSortOnLL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printLinkList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Merge Sort

    // Finding Middle Node
    private Node middleNode(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid Node
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Find Node
        Node midNode = middleNode(head);

        // Left and Right Merge Sort
        Node rightHead = midNode.next;
        midNode.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Merge
        return merge(newLeft, newRight);
    }


    // Merging two link list
    private Node merge(Node lNode, Node rNode) {
        Node mergeLL = new Node(-1); // dummy node helps in merging
        Node temp = mergeLL;

        while (lNode != null && rNode != null) {
            if (lNode.data <= rNode.data) {
                temp.next = lNode;
                lNode = lNode.next;
                temp = temp.next;
            } else {
                temp.next = rNode;
                rNode = rNode.next;
                temp = temp.next;
            }
        }

        while (lNode != null) {
            temp.next = lNode;
            lNode = lNode.next;
            temp = temp.next;
        }

        while (rNode != null) {
            temp.next = rNode;
            rNode = rNode.next;
            temp = temp.next;
        }

        return mergeLL.next; // merged list at every recursion stack level;
    }


    public static void main(String[] args) {
        _4_mergeSortOnLL ll = new _4_mergeSortOnLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);

        ll.printLinkList();

        head = ll.mergeSort(head);

        ll.printLinkList();
    }
}
