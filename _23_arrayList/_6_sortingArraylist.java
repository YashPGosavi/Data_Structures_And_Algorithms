/*
Sorting an ArrayList :-
            An ArrayList can be Sorted by using the sort() method of the Collections Class in Java. This sort() method takes the collection to be sorted as the parameter and returns a Collection sorted in the Ascending Order by default.

    Syntax :
        Ascending Order :-
            Collections.sort(arraylist_name);
 */

import java.util.ArrayList;
import java.util.Collections;

public class _6_sortingArraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // Descending Order :-
        Collections.sort(list, Collections.reverseOrder()); // comparitor :- Use to define sorting logic/order.
        System.out.println(list);
    }
}
