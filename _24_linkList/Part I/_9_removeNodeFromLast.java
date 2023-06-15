/*
Find & Remove Nth node from End ( Iterative Approach )

Nth end node from start = ( size - N + 1 )
 */
public class _9_removeNodeFromLast {
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

    // delete nth from end

    public void deletNthFromEnd(int n){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }

        if(n==size){
            head = head.next;
            return;
        }

        int i = 1;
        int iTofind = size-n;
        Node prev = head;

        while(i < iTofind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;

    }
    public static void main(String[] args) {
        _9_removeNodeFromLast ll = new _9_removeNodeFromLast();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        
        ll.printLinkList();

        ll.deletNthFromEnd(2);

        ll.printLinkList();

    }
}
