import java.util.Scanner;

// public class _1_if_else{
//     public static void main(String[] args) {
//         int age =18;

//         if(age>18){
//             System.out.println("Adult");
//         }else{
//             System.out.println("Teen");
//         }
//     }
// }


// // Que. Print the largest of 2
// public class _1_if_else {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter two no. : ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if (a >= b) {
//             System.out.println(a + " : is greater");
//         } else {
//             System.out.println(b + " : is greater");
//         }

//         sc.close();
//     }
// }


// Que. Print if a number is Odd or Even
public class _1_if_else{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. :");
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        sc.close();
    }
}