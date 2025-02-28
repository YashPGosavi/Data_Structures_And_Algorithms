/*  
Question: Use the following sorting algorithms to sort an array in DESCENDING order :
a. Bubble Sort
b. Selection Sort
c. Insertion Sort
d. Counting Sort

You can use this array as an example: [3, 6, 2, 1, 8, 7, 4, 5, 3, 1]
 */

public class _6_questionBanks {

    // Buble Sort
    public static void Bubble(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    // Selection Sort
    public static void Selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    // Counting Sort

    public static void countingSort(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        int freq[] = new int[max+1];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 3, 2, 5, 4 };
        // Bubble(arr);
        // Selection(arr);
        // insertionSort(arr);
        countingSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}