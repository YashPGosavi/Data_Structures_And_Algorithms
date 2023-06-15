/*
LinkList :- ( Linear Data-Structure )

       A linked list is a collection of nodes, where each node contains some data along with information about the next node 
       A linked list uses non-contiguous memory locations and hence requires each node to remember where the next 

       * A linked list is a series of connected nodes 
       * Each node contains at least :– 
                                1) A piece of data (any type) 
                                2) Pointer to the next node in the list 
       * Head :- Pointer to the first node. 
       * Tail :- Last Valid node is called tail.
       * The last node points to NULL.


What is a NODE?          
        Node is a combination of DATA and LINK. 


Type of link list

       1. Singly link list :-
              * The simplest kind of linked list is a singly-linked list (or slist for short) which has one link per node.
              * This link points to the next node in the list, or to a null value or empty list if it is the final node.
       ￼
       2. Doubly link list :-
              * A more sophisticated kind of linked list is a doubly-linked list or two-way linked list.
              * Each node has two links: one points to the previous node, or points to a null value or empty listif it is the first node; and one points to the next, or points to a null value or empty list if it is the final node.
       ￼
       3. Circular link list :-
              * In CLL. the first and final nodes are linked together. 
              * To traverse a circular linked list, you begin at any node and follow the list in either direction until you return to the original node.
              * Viewed another way, circularly-linked lists can be seen having no beginning or end.
              * This can be done for both singly and doubly linked lists.
       ￼
 */

public class _1_introductionToLinkList {

       
       // Creating Node class to implement LinkList
       public static class Node {
              int data;
              Node next; // Creatin the next variable pointer by using the the class refernce.
       
              public Node(int data) {
                     this.data = data; // Providing date to data variable.
                     this.next = null; // Providing referance of next node to next variable. 
              }
       }
       
              public static Node head; // Creating Head of the linklist.
              public static Node tail; // Creating Tail of the linklist.

       public static void main(String[] args) {
              head = new Node(1);
              head.next = new Node(2);
       }
}