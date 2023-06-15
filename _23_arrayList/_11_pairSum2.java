/*
Pair Sum - 2
Find if any pair in a Sorted & Rotated ArrayList has a target sum.
list = [11, 15, 6, 8, 9, 10]
target-16
 */

import java.util.ArrayList;

public class _11_pairSum2 {

    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int piviot = -1;
        int n = list.size();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                piviot = i;
                break;
            }
        }

        int lp = piviot + 1;
        int rp = piviot;

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(pairSum2(list, 16));
    }
}
