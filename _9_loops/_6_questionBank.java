import java.util.Scanner;

// Que. Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

// public class _6_questionBank {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number : ");
//         int n = sc.nextInt();
//         int evensum = 0;
//         int oddsum = 0;
//         for(int i=0;i<n ; i++){
//             if(i%2==0){
//                 evensum += i; 
//             }else{
//                 oddsum += i ;
//             }
//         }
//         System.out.println("Even Sum : "+evensum);
//         System.out.println("Odd Sum : "+oddsum);
//         sc.close();
//     }
// }

//Que. Write a program to find the factorial of any number entered by the user.

// public class _6_questionBank {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number : ");
//         int n = sc.nextInt();
//         int fact=1;
//        for(int i=1;i<=n;i++){
//         fact *=i;
//        }
//        System.out.println(fact);
//     }
// }

//Que. Write a program to print the multiplication table of a number N, entered by the user.

public class _6_questionBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
        sc.close();
    }
}
