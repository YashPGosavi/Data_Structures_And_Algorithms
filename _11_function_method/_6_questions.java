import java.util.*;

//Que. Check if a number is Prime or not

// public class _6_questions{
//     public static boolean prime(int n){
//         if(n==2){
//             return true;
//         }
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number : ");
//         int n = sc.nextInt();
//         if(prime(n)==true){
//             System.out.println("Prime");
//         }else{
//             System.out.println("Not Prime");
//         }
//     }
// }

// Que . Print all Primes in a Range

public class _6_questions {
    public static boolean prime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printprime(int n) {
        for (int i = 2; i <= n; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        printprime(n);
        sc.close();
    }
}
