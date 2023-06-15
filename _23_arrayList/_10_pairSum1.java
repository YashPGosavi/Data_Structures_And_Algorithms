/*
Pair Sum - 1
Find if any pair in a Sorted ArrayList has a target sum.
list = [1, 2, 3, 4, 5, 6] 
target=5
 */

import java.util.ArrayList;

public class _10_pairSum1 {

    // Bruteforce Approch
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // Optimised Approch
    public static boolean optimisedPairSum1(ArrayList<Integer> list, int target) {
        int leftPt = 0;
        int rightPt = list.size() - 1;

        while(leftPt!=rightPt) {
            if (list.get(leftPt) + list.get(rightPt) == target) {
                return true;
            } else if (list.get(leftPt) + list.get(rightPt) > target) {
                rightPt--;
            } else {
                leftPt++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(pairSum1(list, 5));
        System.out.println(optimisedPairSum1(list, 5));
    }
}
