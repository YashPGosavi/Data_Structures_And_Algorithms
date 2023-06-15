/*
 Check if LinkList is a Palindrome
 */
public class _10_cheakPalindrome {
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

    //  Check if LinkList is a Palindrome

    // Step 1 ->  Find the mid Node
    public Node findNode(Node head){
        Node slow = head;
        Node fast = head;

        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }



    // Cheacking equality.
    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        Node midNode = findNode(head);
        // step 2 -- > reverse Second half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node rightHalfHead = prev;
        Node lefthHalfHead = head;

        //step3 - check left half & right half

        while(rightHalfHead != null){
            if(lefthHalfHead.data != rightHalfHead.data) {
                return false;
            }
            lefthHalfHead = lefthHalfHead.next;
            rightHalfHead = rightHalfHead.next;
        }
        return true;

    }


    public static void main(String[] args) {
        _10_cheakPalindrome ll = new _10_cheakPalindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        
        ll.printLinkList();

        System.out.println(ll.checkPalindrome());
        
    }
}
