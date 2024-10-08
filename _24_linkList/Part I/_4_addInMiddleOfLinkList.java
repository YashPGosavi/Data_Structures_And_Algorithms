/*
Time Complexity :- O(n)
 */
public class _4_addInMiddleOfLinkList {

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


    public void addFirst(int data){

        Node newNode = new Node(data);

        if(head==null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
    }

    public void addLast(int data){
    
        Node newNode = new Node(data);

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

    // Add in Middle
    public void add(int data, int indx){
        if(indx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while(i<indx-2){
            temp = temp.next;
            i++;
        }

        // when i = inx-1;
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public static void main(String[] args) {
        _4_addInMiddleOfLinkList ll = new _4_addInMiddleOfLinkList();

        ll.addFirst(2);
        ll.addFirst(1);

        ll.addLast(3);
        ll.addLast(4);

        ll.add(9,2);

        ll.printLinkList();
        
    }
}
