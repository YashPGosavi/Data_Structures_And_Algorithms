/*
Swap 2 Numbers
list = 2, 5, 9, 3, 6
index : idx=1 idx= 2
*/
import java.util.ArrayList;

public class _5_swapArraylist {

    public static void swap(ArrayList<Integer> list, int n, int m ){    
        int temp = list.get(n);
        list.set(n,list.get(m));
        list.set(m,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        swap(list, 1, 2);
        System.out.println(list);
    }
    
}
