/*
Doubly link list :-
              * A more sophisticated kind of linked list is a doubly-linked list or two-way linked list.
              * Each node has two links: one points to the previous node (or points to a null value or empty listif it is the first node) and one points to the next(or points to a null value or empty list if it is the final node).
*/
public class _6_doublyLinkList{

    static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    // ADD FIRST

    public void addFirst(int data){

        Node newNode = new Node(data);
        size++;

        if(head==null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }


    // ADD LAST

    public void addLast(int data){

        Node newNode = new Node(data);
        size++;

        if(head==null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        
    }

    // REMOVE FIRST
    public int removeFirst(){
        if(head==null){
            System.out.println("Link List is Empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // REMOVE LAST
    public int removeLast(){
        if(head==null){
            System.out.println("Link List is Empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }

        Node prev = head;
        int i=0;
        while(i<size-2){
            prev = prev.next;
            i++;
        }

        int val = tail.data;
        prev.next = null;
        tail.prev = null;
        tail = prev;
        size--;
        return val;
    }

    // REVERSE LINKLIST
    public void reverseLinkList(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        tail = head;
        head = prev;
    }

    // PRINT LINKLIST
    public void printLinkList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[]args){
        
        _6_doublyLinkList dll =  new _6_doublyLinkList();
        
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(0);

        dll.addLast(3); 
        dll.addLast(4);
        dll.addLast(5);

        dll.printLinkList();

        dll.removeFirst();
        dll.removeLast();

        dll.printLinkList();

        dll.reverseLinkList();
        
        dll.printLinkList();

    }
}