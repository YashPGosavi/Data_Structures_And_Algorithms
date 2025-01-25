import java.util.Scanner;

/*
Q.1) Take an array as input from the user. Search for a given number x and print the index at which it occurs.
 */

//  public class oneDArray{
//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter array size : ");
//         int n = sc.nextInt();

//         int []arr = new int[n];

//         System.out.println("Enter array input : ");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }

//         int x =sc.nextInt();
//         System.out.println("Array is :-");
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==x){
//                 System.out.println(x + " is found at index "+i);
//                 break;
//         }
//                 }
//         sc.close();
//      }
//  }

/*
Q.2) Take an array of names as input from the user and print them on the screen.
 */
// public class oneDArray{
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter array size : ");
//        int n = sc.nextInt();

//        String []arr = new String[n];

//        System.out.println("Enter array input : ");
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.next();
//        }

//        System.out.println("Array is :-");
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        sc.close();
//     }
// }

/*
Q.3) Find the maximum & minimum number in an array of integers.
 */

//  public class oneDArray{
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter array size : ");
//        int n = sc.nextInt();

//        int []arr = new int[n];

//        System.out.println("Enter array input : ");
//        for(int i=0;i<arr.length;i++){
//         arr[i]=sc.nextInt();
//        }
//         int a=arr[0];
//         int b=arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>a){
//                 a=arr[i];
//             }
//             if(arr[i]<b){
//                 b=arr[i];
//             }
//         }
//         System.out.println("Maximum value : "+a);
//         System.out.println("Minimum value : "+b);
//         sc.close();
//     }
//  }

/*
 Q.4) Take an array of numbers as input and check if it is an array sorted in ascending order.
 */

//  public class oneDArray{
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter array size : ");
//        int n = sc.nextInt();

//        int []arr = new int[n];

//        System.out.println("Enter array input : ");
//        for(int i=0;i<arr.length;i++){
//         arr[i]=sc.nextInt();
//        }
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i]>arr[i+1]){
//                 System.out.println("Not sorted");
//                 break;
//             }else{
//                 System.out.println("Sorted");
//                 break;
//             }
//         }
       
//         sc.close();
//     }
//  }
