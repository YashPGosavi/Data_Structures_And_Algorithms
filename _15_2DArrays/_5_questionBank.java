/*  
Question 1: Print the number of 7's that are in the 2d array.
Example:
Input - intlI array = { {4,7,8},{8,8, 73 };
Output - 2 
 */

// public class _5_questionBank {
//     public static void countNumber(int[][]arr,int key){
//         int count = 0;
        
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[0].length;j++){
//                 if(arr[i][j]==key){
//                     count +=1;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
//     public static void main(String[] args) {
//         int[][] arr = {{4,7,8},{8,8,7}};
//         countNumber(arr, 7);
//     }
// }




/*
Question 2: Print out the sum of the numbers in the second row of the "nums" array.
Example:
Input - int [][] nums = { {1,4,9},{11,4,3} {2,2,3} };
Output - 18
 */

//  public class _5_questionBank {
//     public static void sumOfRow(int[][]arr,int key){
//         int sum = 0;
//             for(int j=0;j<arr[0].length;j++){ // Col
//                 sum += arr[key][j];
//                 }
//         System.out.println("Sum of Row "+key+" : "+sum);
//     }
//     public static void main(String[] args) {
//         int[][] arr = { {1,4,9},{11,4,3}, {2,2,3} };
//         sumOfRow(arr, 1);
//     }
// }



/*
Question 3 : Write a program to Find Transpose of a Matrix
What is Transpose?
Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,

Matrix
a11 a12 a13
a21 a22 a23

Transposed Matrix a11 a21
a12 a22
a13 a23
 */

 public class _5_questionBank {
        public static void transposeMatrix(int[][]arr){
            int [][] transposeMatrix = new int[arr.length][arr[0].length];
            for(int i=0;i<arr.length;i++){ // Rows
                for(int j=0;j<arr[0].length;j++){ // Colomn
                    transposeMatrix[j][i]=arr[i][j];
                }
            }
            System.out.println("Original Matrix is : ");
            printMatrix(arr);

            System.out.println("Transpose Matrix is : ");
            printMatrix(transposeMatrix);
        }

        public static void printMatrix(int[][]arr){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            int[][] arr = { {1,4,9},{11,4,3}, {2,2,3} };
            transposeMatrix(arr);
        }
    }