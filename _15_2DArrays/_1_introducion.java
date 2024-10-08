import java.util.Scanner;

/*

2D Arrays :-MATRIX (ROWS & COLUMNS)

Real life Example :- lenght and breadth

 Matrix :- ( n*m ) = total no of cells = rows * columns

                0       1       2
            -------------------------
         0  | (0,0) | (0,1) | (0,2) |
            -------------------------
         1  | (1,0) | (1,1) | (1,2) |
            -------------------------
         2  | (2,0) | (2,1) | (2,2) |
            -------------------------
   
            
Length of Rows = matrix.length.
Lenght og columns = matrix[0].lenght.
 */

/*
2D arrays stores data in memory in some manners such as.

1) Row-Mejor
2) Column-Mejor

but in java it stores
                                                                     -------------
            ------------      -------------            ------------> | int [] [] |
           | int [] [] |      | int [] [] |           |              -------------
            ------------      -------------           |              | 0 : int[] |
           | 1 | 2 | 3 |      | 0 : int[] | -----------              -------------
            ------------ ==>  -------------                          | 1 : int[] |
           | 4 | 5 | 6 |      | 1 : int[] | -----------              -------------
            ------------      -------------            |             | 2 : int[] |
           | 7 | 8 | 9 |      | 2 : int[] |---         |             -------------
            ------------      -------------  |         |
                                             |         |
                                             |         |              -------------
                                             |         -------------> | int [] [] |
                                             |                       -------------
                                             |                        | 0 : int[] |
                                             |                        -------------
                                             |                        | 1 : int[] |
                                             |                       ------------
                                             |                        | 2 : int[] |
                                             |                        -------------
                                             |
                                             |
                                             |  
                                             |                       ------------
                                             --------------------->  | int [] [] |
                                                                     -------------
                                                                     | 0 : int[] |
                                                                     -------------
                                                                     | 1 : int[] |
                                                                     ------------
                                                                     | 2 : int[] |
                                                                     -------------
           


*/

public class _1_introducion {
   public static void search2DArray(int[][] arr, int key) {
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[0].length; j++) {

            // Searching
            if (arr[i][j] == key) {
               System.out.println("Key found at location : (" + i + ", " + j + ")");
            }

            // Maximum value
            if (max < arr[i][j]) {
               max = arr[i][j];
            }

            // Minimum value
            if (min > arr[i][j]) {
               min = arr[i][j];
            }
         }
      }
      System.out.println("Maximum Number is :" + max);
      System.out.println("Minimum Number is :" + min);
   }

   public static void main(String[] args) {
      int n = 3;
      int m = 3;
      int arr[][] = new int[n][m];

      Scanner sc = new Scanner(System.in);

      // Input
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            System.out.print("Enter no at location (" + i + "," + j + ") ; ");
            arr[i][j] = sc.nextInt();
         }
      }

      // Printing
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < m; j++) {
            System.out.print(arr[i][j] + " ");
         }
         System.out.println();
      }

      // Searching
      search2DArray(arr, 3);

      sc.close();
   }
}