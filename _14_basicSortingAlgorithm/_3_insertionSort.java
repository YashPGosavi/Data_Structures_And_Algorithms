/*
 Insertion Sort :- Pick an element(from unsorted part) & place in the right pos in sorted part. 
 Time complexity :- O(n^2)

** INSERTION SORT ALGORITHM
1. SET A MARKER FOR THE SORTED SECTION AFTER THE FIRST ELEMENT
2. REPEAT THE FOLLOWING UNTILL UNSORTED
        SECTION IS EMPTY:
                1. SELECT THE FIRST UNSORTED ELEMENT SWAP OTHER ELEMENTS TO THE RIGHT TO CREATE
                2. THE CORRECT POSITION AND SHIFT THE UNSORTED ELEMENT.
                3. ADVANCE THE MARKER TO THE RIGHT ONE ELEMENT
 */

public class _3_insertionSort {
    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;

            // finding out the correct position to insert
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = current;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int optimize_insertion_sort(int[] v) {
        for (int i = 1; i < v.length; i++) {
            int current = v[i];
            int prev = i - 1;

            // finding out the correct position to insert
            while (prev >= 0 && (current < v[prev])) {
                v[prev + 1] = v[prev];
                prev--;
            }
            // insertion
            v[prev + 1] = current;
        }

        int mid = v.length / 2;

        if (v.length % 2 == 0) {
            if (mid == 1) {
                return (v[mid] + v[mid - 1]) / 2;
            }
            return (v[mid] + v[mid + 1]) / 2;
        }

        return v[mid];
    }

    public static void main(String[] args) {
        int[] arr = { 19, 11, 12, 5, 6, 3};
        insertionSort(arr);

        // System.out.println(insertionSort(arr));
    }
}
