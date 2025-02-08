/*
Merge Sort : ( Divide and Conquare Approch is used in Merge Sort. )
        Best Time complexty but required more space.

 Steps :-
        1. Divide
        2. Merge with sorting

* Time Complexity = O(nlogn)
* Space Complexity = O(n) --> We use temp array of size n

 */

public class _1_mergeSort {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of the two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays
        int i = 0, j = 0; // Initial indices of the subarrays
        int k = left; // Initial index of the merged array

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        // Copy remaining elements of leftArray (if any)
        while (i < n1) {
            arr[k++] = leftArray[i++];
        }

        // Copy remaining elements of rightArray (if any)
        while (j < n2) {
            arr[k++] = rightArray[j++];
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        mergeSort(arr, 0, n - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}