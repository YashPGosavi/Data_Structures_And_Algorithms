import java.util.LinkedList;

public class _3_collectionFramework {
    public static void main(String[] args) {

        // Create
        LinkedList <Integer> ll = new LinkedList<>();

        // Add
        ll.addFirst(1);
        ll.add(1, 2);
        ll.add(2, 3);
        ll.add(3, 4);
        ll.add(4, 5);
        ll.add(5, 6);
        ll.addLast(7);
        
        // Remove
        ll.removeFirst();
        ll.removeLast();

        // Print
        System.out.println(ll);

        // isEmpty()
        System.out.println(ll.isEmpty());

        // Size
        System.out.println(ll.size());

    }
}
