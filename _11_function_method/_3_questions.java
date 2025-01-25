import java.util.Scanner;

// Que. Product of two number. 

// public class _3_questions {
//     public static int product(int a, int b){
//         int product = a*b;
//         return product;
//     }
// public static void main(String[] args) {
//     System.out.println(product(2, 3));
// }
// }

//Que. find factorial

// public class _3_questions {
//     public static int fact(int n){
//         int fact = 1;
//         for(int i=1;i<=n;i++){
//             fact *=i;
//         }
//         return fact;
//     }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter number : ");
//     int a = sc.nextInt();
//     System.out.println(fact(a));
//     sc.close();
// }
// }

/*

Que. Binomial Coefficient
n       n! 
 C = _________
  r   r!(n-r)!

*/

public class _3_questions {

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int BinCoe(int n, int r) {
        int a = fact(n);
        int b = fact(r) * fact(n - r);
        int BinCoe = a / b;
        return BinCoe;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter Value of r: ");
        int r = sc.nextInt();
        System.out.println("The ans is : " + BinCoe(n, r));
        sc.close();
    }
}