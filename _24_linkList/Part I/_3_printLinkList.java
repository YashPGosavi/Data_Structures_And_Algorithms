public class _3_printLinkList {
    
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

        if (head == null) // If LinkList is Null
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
        tail.next = newNode;

        // Step 3 --> tail = newNode;
        tail = newNode;
    }

    public void printLinkList(){
        if(head==null){
            System.out.println("LinkList is Empty...");
        }

        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+" -->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        _3_printLinkList ll = new _3_printLinkList();

        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        ll.addFirst(0);
        ll.addFirst(-1);

        ll.addLast(3);
        ll.addLast(4);

        ll.printLinkList();


    }
}
