/*
Binary Search :- Based on divide and conquer system. for this search data item should be sorted.

1) Binary search divides array into equal parts.
        Mid =LB+UB/2
2) Time complexity O(log n) :- n is no of element in array and log is binary logarithm

 */

public class _4_binarySearch {
    public static int binarySearch(int[] arr, int n) {
        int first = 0;  // It is for leftmost element.
        int last = arr.length - 1; // It is for rightmost element.

        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == n) {
                System.out.println(arr[mid] + " found  at index "+ mid);
                break;
            } else if (arr[mid] < n) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = 5;
        binarySearch(arr, n);
    }
}
