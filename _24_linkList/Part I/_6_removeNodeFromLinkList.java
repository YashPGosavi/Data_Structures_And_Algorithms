/*
Remove Operation in LinkList
1) Remove First.
2) Remove Last.
 */
public class _6_removeNodeFromLinkList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
    
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode;
    }

    public void add(int data, int idx){
        if(idx==0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;
        int i = 0;

        while( i <idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printLinkList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Remove First
    public int removeFirst(){
        if(size == 0){
            System.out.println("LinkList is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size --;
        return val;
    }

    // Remove Last
    public int removeLast(){
        if(size == 0){
            System.out.println("Linklist is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        
        //prev : i = size-2
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        size --;
        tail = prev;
        return val;
    }

    public static void main(String[] args) {
        _6_removeNodeFromLinkList ll = new _6_removeNodeFromLinkList();

        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(4);
        ll.addLast(5);

        ll.add(3,2);

        System.out.println(size);

        ll.printLinkList();

        ll.removeFirst();

        ll.printLinkList();
        System.out.println(size);

        ll.removeLast();
        ll.printLinkList();
        System.out.println(size);
    }
}
