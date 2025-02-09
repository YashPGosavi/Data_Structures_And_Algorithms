/*

* Recursive Bubble Sort in Java : It is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

    1. Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
    2. The recursive version of Bubble Sort reduces the problem size by one in each recursive call.
    3. Time Complexity: O(n²) in the worst and average cases.
    4. Space Complexity: O(n) due to the recursion stack.

 */

public class RecursiveBubbleSort {

    // Method to perform Recursive Bubble Sort
    public static void recursiveBubbleSort(int[] arr, int n) {
        // Base case: if the array has only one element, it's already sorted
        if (n == 1) {
            return;
        }

        // Perform a single pass of bubble sort
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap arr[i] and arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursively sort the remaining (n-1) elements
        recursiveBubbleSort(arr, n - 1);
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Main method to test the Recursive Bubble Sort implementation
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        recursiveBubbleSort(arr, n);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}