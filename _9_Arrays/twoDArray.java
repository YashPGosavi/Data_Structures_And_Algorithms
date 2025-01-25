import java.util.Scanner;
/*
Q.1) Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.
 */
// public class twoDArray{
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter array size : ");
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int [][]arr = new int[n][m];

//        System.out.println("Enter Input :-");
//        for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             arr[i][j]=sc.nextInt();
//         }
//     }

//     System.out.println("Enter X value : ");
//     int x =sc.nextInt();

//     for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             if(arr[i][j]==x){
//                 System.out.println(x + " is found at index ("+i+","+j+")");
//             }
//         }
//     }

//     System.out.println("The Array is :-");

//     for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             System.out.print(arr[i][j]+" ");
//         }
//         System.out.println();
//     }
//     sc.close();
// }
// }

/*
Q.2)For a given matrix of N x M, print its transpose.
 */
// public class twoDArray{
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter array size : ");
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int [][]arr = new int[n][m];

//        System.out.println("Enter Input :-");
//        for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             arr[i][j]=sc.nextInt();
//         }
//     }
//     System.out.println("The Transpose is :-");

//     for(int i=0;i<arr.length;i++){
//         for(int j=0;j<arr.length;j++){
//             System.out.print(arr[j][i]+" ");
//         }
//         System.out.println();
//     }
//     sc.close();
// }
// }

/*
Q.3) Print the spiral order matrix as output for a given matrix of numbers.
[Difficult for Beginners]
 */
public class twoDArray{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter array size : ");
       int n = sc.nextInt();
       int m = sc.nextInt();
       int [][]arr = new int[n][m];

       System.out.println("Enter Input :-");
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
        }
    }

    sc.close();
}
}
