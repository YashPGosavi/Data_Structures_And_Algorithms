import java.util.Arrays;

public class _4_inbuildSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 3, 2 };
        // insertiontionSort(arr);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}