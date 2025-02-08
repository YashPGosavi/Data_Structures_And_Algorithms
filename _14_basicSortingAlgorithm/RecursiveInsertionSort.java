/*
 * Recursive Insertion Sort : it is a simple sorting algorithm that builds the final sorted array one item at a time. 
 * steps : -
        * 1. Recursive Insertion Sort is a variation of the Insertion Sort algorithm.
        * 2. In Recursive Insertion Sort, we recursively sort the first (n-1) elements and then insert the nth element into its correct position.
        * 3. Time Complexity: O(n^2) in the worst case.
        * 4. Space Complexity: O(n) due to the recursion stack.
 *
 */

public class RecursiveInsertionSort {


    // Method to perform Recursive Insertion Sort
    public static void recursiveInsertionSort(int[] arr, int n) {
        // Base case: if the array has only one element, it's already sorted
        if (n <= 1) {
            return;
        }

        // Sort the first (n-1) elements recursively
        recursiveInsertionSort(arr, n - 1);

        // Insert the nth element into the sorted (n-1) elements
        int last = arr[n - 1]; // Last element of the current subarray
        int j = n - 2; // Index of the second-to-last element

        // Move elements greater than 'last' one position ahead
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }

        // Place 'last' in its correct position
        arr[j + 1] = last;
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    // Main method to test the Recursive Insertion Sort implementation
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        recursiveInsertionSort(arr, n);

        System.out.println("Sorted array:");
        printArray(arr);
    }

}