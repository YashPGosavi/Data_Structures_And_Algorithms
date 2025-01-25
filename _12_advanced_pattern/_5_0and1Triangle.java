/*
Que. 0-1 Triangle

    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1


public class ZeroOneTriangle {

    public static void printZeroOneTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int start = i % 2 == 0 ? 1 : 0; // Even rows start with 1, odd rows with 0
            
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start; // Alternate between 1 and 0
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        int n = 5;  // Number of rows
        printZeroOneTriangle(n);
    }
}
 */
public class _5_0and1Triangle {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j || (i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }

    public static void pattern2(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j || (i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(6);
    }
}
