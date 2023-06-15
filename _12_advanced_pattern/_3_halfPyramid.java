/* 
Que.3 INVERTED HALF-PYRAMID with Numbers

        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2 
        1

*/

public class _3_halfPyramid {
    public static void pattern(int n) {
        for (int i = n; i >= 1; i--) { // Column

            for (int j = 1; j <= i; j++) { // Row
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(5);
    }
}
