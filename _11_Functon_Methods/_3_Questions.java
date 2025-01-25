import java.util.Scanner;
/*
 Q.1) Make a function to add 2 number and returns the sum.
 */
// public class _3_Questions{
//     public int sum(int a, int b){
//           int sum=a+b;
//           return sum;
//     }
//    public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);
//           System.out.println("Enter No. ");
//           int a=sc.nextInt();
//           int b=sc.nextInt();
//           _3_Questions c = new _3_Questions();
//           System.out.println("Sum is : "+c.sum(a,b));
//           sc.close();
//    }
// }

/*
 Q.2) Make a functioin multipy two number and return the product.
 */

// public class _3_Questions{
//    static int mul(int a, int b){
//         return a*b;
//     }
//     public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();       
//        System.out.println("Multiplication is :" + mul(a,b));
//        sc.close();
//     }
//  }

/*
 Q.3) Find factorial of the number.
 */
// public class _3_Questions{
//     static int fact(int n){
//           int fact=1;
//             if( n==0){
//                 return fact;
//                }else{
//         for(int i=1;i<=n;i++){
//                fact=fact*i;
//             }
//         }
//         return fact;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.println(fact(a));
//         sc.close();
//     }
// }

//Q. Check if a number is Prime or not
//  public class _3_Questions{
//        public static Boolean prime(int n){
//               boolean isPrime = true;
//               for(int i=2;i<Math.sqrt(n);i++){
//                      if (n%i==0){
//                             isPrime = false;
//                             break;
//                      }  
//                      isPrime = true;
//               }
//          return isPrime;
//        }
//        public static void main(String[] args) {
//               Scanner sc = new Scanner(System.in);
//               System.out.print("Enter Number : ");
//               int n = sc.nextInt();
//               System.out.println(prime(n));
//               sc.close();
//        }
// }


// //Q.Print all Primes in a Range
// public class _3_Questions{
//     public static Boolean prime(int n){
//            boolean isPrime = true;
//            for(int i=2;i<=Math.sqrt(n);i++){
//                   if (n%i==0){
//                          isPrime = false;
//                          break;
//                   }  
//                   isPrime = true;
//            }
//       return isPrime;
//     }
//     public static void printprime(int n){
//            for(int i=2;i<=n;i++){
//                   if(prime(i)){
//                          System.out.print (i+" ");
//                   }
//            }
// }
//     public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter Number : ");
//            int n = sc.nextInt();
//            printprime(n);
//            sc.close();
//     }
// }

// Q. Convert from Binary to Decimal

// public class _3_Questions{
//     public static void binaryToDecimal(int binary){
//         int pow = 0;
//         int decimal = 0;
//         while(binary>0){
//             int lastdigit = binary%10;
//             decimal = decimal + (lastdigit* (int)Math.pow(2, pow));
//             pow ++;
//             binary = binary/10;
//         }
//         System.out.println("binaryToDecimal : "+decimal);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Binary : ");
//         int a = sc.nextInt();
//         binaryToDecimal(a);
//         sc.close();
//     }
// }


// Q. Convert from Decimal to Binary 

public class _3_Questions{
    public static void decimalToBinary(int decimal){
        int pow = 0;
        int binary = 0;
        while(decimal>0){
            int remainder = decimal%2;
            binary =  binary +(remainder * (int)Math.pow(10, pow));
            pow ++;
            decimal = decimal/2;
        }
        System.out.println("decimalToBinary : "+binary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal No : ");
        int a = sc.nextInt();
        decimalToBinary(a);
        sc.close();
    }
}

