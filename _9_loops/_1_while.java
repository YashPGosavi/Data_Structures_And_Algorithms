import java.util.Scanner;
// public class _1_while {
//     public static void main(String[] args) {
//         int i=0;
//         while(i<10){
//             System.out.println(i+" : hallo world!");
//             i++;
//         }
//     }
// }


//// Que. Print Number From 1 To 10
// public class _1_while{
//     public static void main(String[] args) {
//         int i = 1;
//         while(i<=10){
//             System.out.println(i);
//             i++;
//         }
//     }
// }


// //Que. Print number from 1 - n 
// public class _1_while{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no. ");
//         int n = sc.nextInt();
//         int i = 1;
//         while(i<=n){
//             System.out.println(i);
//             i++;
//         }
//         sc.close();
//     }
// }


//Que. Sum Of First n Natural Numbers
public class _1_while{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.  : ");
        int n = sc.nextInt();
        int i=1;
        int sum = 0;
        while(i<=n){
            sum = sum+i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}