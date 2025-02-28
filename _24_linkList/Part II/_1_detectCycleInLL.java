/*
Floyd's Cycle Finding Algorithm
    Slow-Fast pointer Aproch
 */
public class _1_detectCycleInLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    // Find Cycle in link List
    public static void findCycle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                System.out.println("Cycle is Present.");
                return;
            }
        }
        System.out.println("Cycle is Not Present.");
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head;

        findCycle();
        
    }
}
