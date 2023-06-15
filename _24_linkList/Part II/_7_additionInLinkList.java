public class _7_additionInLinkList{

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public Node addLL(Node head1,Node head2){
        Node sum=null;

        while(head1 != null && head2 != null){        
            int data1 = (head1!=null)?head1.data:0;
            int data2 = (head2!=null)?head2.data:0;

            sum = new Node(data1+data2);
        }

        return sum;
    }
    public static void main(String[] args) {
        
    }
}



