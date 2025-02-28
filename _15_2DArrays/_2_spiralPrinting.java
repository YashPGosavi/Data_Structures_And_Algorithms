public class _2_spiralPrinting {

    public static void spiralPrint(int arr[][]) {
        int startrow = 0, endrow = arr.length - 1;
        int startcol = 0, endcol = arr[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {

            // Print the top row
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(arr[startrow][j] + " ");
            }
            startrow++;

            // Print the right column
            for (int i = startrow; i <= endrow; i++) {
                System.out.print(arr[i][endcol] + " ");
            }
            endcol--;

            // Print the bottom row if there are multiple rows
            if (startrow <= endrow) {
                for (int j = endcol; j >= startcol; j--) {
                    System.out.print(arr[endrow][j] + " ");
                }
                endrow--;
            }

            // Print the left column if there are multiple columns
            if (startcol <= endcol) {
                for (int i = endrow; i >= startrow; i--) {
                    System.out.print(arr[i][startcol] + " ");
                }
                startcol++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        spiralPrint(arr);

    }
}