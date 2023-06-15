
public class _5_sizeOfLinkList {
    public static class Node{
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

    public void addFirst(int data){

        Node newNode = new Node(data);
        size ++;
        if(head==null){
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
            head = tail = newNode;
            return;
        }

        tail.next = newNode;

        tail = newNode ;
    }

    public void printLinkList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
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

        while(i<idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String[] args) {
        _5_sizeOfLinkList ll = new _5_sizeOfLinkList();

        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        ll.addLast(4);

        ll.add(9,2);

        ll.printLinkList();

        System.out.println(size);
        
    }
}
