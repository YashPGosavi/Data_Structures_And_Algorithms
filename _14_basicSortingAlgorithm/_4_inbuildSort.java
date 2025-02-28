import java.util.Arrays;

public class _4_inbuildSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };
        // insertiontionSort(arr);
        Arrays.sort(arr); // It take time complexity of O(nlogn) in java in the background it uses quick sort
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}