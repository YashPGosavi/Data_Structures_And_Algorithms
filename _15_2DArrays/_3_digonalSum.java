
public class _3_digonalSum {

    public static void digonalSum(int[][] arr) {
        int diagoanl = 0;
        for (int i = 0; i < arr.length; i++) { // Row
            for (int j = 0; j < arr[0].length; j++) { // Colomn
                if (i == j) {
                    diagoanl += arr[i][j];
                } else if (i + j == arr.length - 1) {
                    diagoanl += arr[i][j];
                }
            }
        }
        System.out.println(diagoanl);
    }

    public static void optDigonalSum(int[][] arr) {
        int diagoanl = 0;

        for (int i = 0; i < arr.length; i++) {

            // Priamry Diagonal
            diagoanl += arr[i][i];

            // Secondary Diagonal
            if (i != arr.length - 1 - i) {
                diagoanl += arr[i][arr.length - 1 - i];
            }
        }
        System.out.println(diagoanl);
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        digonalSum(arr);
        optDigonalSum(arr);
    }
}
