/*
Remove a Loop/Cycle in a LL

        Last Node == Null;
 */
public class _2_removeCycleFromLL {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

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

    public void add(int data, int idx) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("Linklist is empty");
            return Integer.MIN_VALUE;
        } else if (head == tail) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("Linklist is empty");
            return Integer.MIN_VALUE;
        } else if (head == tail) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        Node prev = head;
        int i = 0;
        while (i < size - 2) {
            prev = prev.next;
            i++;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Find Cycle
    public static boolean findCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // Remove isCycle
    public static void removeCycle() {

        // Cheak for cycle
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                isCycle = true;
                break;
            }
        }
        if (isCycle == false) {
            return; 
        }

        slow = head;
        // Get Node where the cycle is formed
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // Remove Link
        prev.next = null;
    }

    public static void printLinkList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = temp;

        
        System.out.println(findCycle());
        removeCycle();
        System.out.println(findCycle());
        printLinkList();

    }
}

