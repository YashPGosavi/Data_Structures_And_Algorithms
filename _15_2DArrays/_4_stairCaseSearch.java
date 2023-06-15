// Time Complexity :- O(n+m)

public class _4_stairCaseSearch {
    public static boolean stairCaseSearch(int arr[][], int n) {

        int row = 0, col = arr[0].length - 1;
        // element

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == n) {
                System.out.print("Element found at (" + row + ", " + col+")\n");
                return true;
            }
            if (arr[row][col] > n)
                col--;
            else {// if arr[row][col] < n
                row++;
            }
        }

        System.out.print("n Element not found");
        return false; // if ( row==n || col == -1 )
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int n = 3;
        stairCaseSearch(arr, n);
    }
}