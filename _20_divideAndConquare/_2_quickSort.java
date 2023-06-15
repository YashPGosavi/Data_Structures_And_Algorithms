/*

 Quik Sort : ( Use Pivot And Partition Technique )
  Steps : - 
            1 ) Partitioning and arrengening according to pivot.
            2 ) further dividing with the recursion.

 * Time Complexity : Average Case : O(logn)
                     Worst Case : O(n^2)
*
* Space Complexity : O(1)


* In Average case it have same time complexity as the merge sort but, Worst case time complexity is O(N^2).
* Worst case occurs when pivot is always the smallest or the largest element.

 */

public class _2_quickSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        //Base Case
        if (si >= ei) {
            return;
        }

        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                System.out.println(arr[j]+" "+ pivot);
                i++;

                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }

}
