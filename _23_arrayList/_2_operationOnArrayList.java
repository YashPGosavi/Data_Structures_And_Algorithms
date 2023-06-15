/*
Operations

1. Add Element --> add element in the arraylist
    syntax :-
            1. arraylist_name.add(element);  --> Add at last 
            TC = O(1)

            2. arraylist_name.add(index, element);  --> Adds at provided index
             TC = O(n) 
    

2. Get Element --> extract element from required index in the arraylist
    syntax :-
            arraylist_name.get(index_of_elemet);
    TC = O(1)

3. Remove Element --> delete the element from arraylist
    syntax :-
            arraylist_name.remove(index_of_elemet);
    TC = O(n)

4. Set Element at Index --> set element at prefered index
    syntax :-
            arraylist_name.set(index_of_elemet_to_be_placed , elemet)
    TC = O(n)

5. Contains Element --> cheaks the element present or not
    syntax :-
            arraylist_name.contains(element);
    TC = O(n)

6. Size --> Provide size of Arraylist
    syntax :-
            arraylist_name.size();


 */

import java.util.ArrayList;

public class _2_operationOnArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add element
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // Get element
        int element = list.get(1);
        System.out.println(element);

        // Remove element
        list.remove(2);
        System.out.println(list);

        // Set Element at Index
        list.set(0, 12);
        System.out.println(list);

        // Contains Element
        System.out.println(list.contains(3));

        //size
        System.out.println(list.size());

        //print arraylist using forloop

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
