/*
Problem 7
WAF to find the first occurence of an element in an array
 */

public class _8_Problem_7_ {
    public static int firstOccurence(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, (i+1));
    }
public static void main(String[] args) {
    int[] arr = { 2, 3, 4, 3, 4 };
    System.out.println(firstOccurence(arr, 4, 0));
}
}