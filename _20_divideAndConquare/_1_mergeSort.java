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
    // For Pringting Array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int si, int ei) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        // For Dividing
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    // for merging
    public static void merge(int[] arr, int si, int mid, int ei) {

        int[] temp = new int[ei - si + 1]; // temp for the sorting element
        int i = si; // counter for left side array
        int j = mid + 1; // counter for right side array
        int k = 0; // counter dfor temp array

        while (i <= mid && j <= ei) {
            System.out.println(arr[i] + " " + arr[j]);
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // for leftover elememt
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // coping from temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        // int arr[] = { 6, 3, 9, 5, 2, 8,};
        int arr[] = { 3, 6, 1, 7, 2, 9 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}