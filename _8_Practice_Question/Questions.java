import java.util.Scanner;

/*
 Q.1) Enter 3 numbers from the user & make a function to print their average.
 */

// public class Questions{
//     static int avg(int a,int b,int c){
//         return (a+b+c)/3;
//     }
//     public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      System.out.println("Enter Three Number : ");
//      int a = sc.nextInt();   
//      int b = sc.nextInt();   
//      int c = sc.nextInt();   
//      System.out.println("Average is : " + avg(a,b,c));
//      sc.close();
//     }
// } 


/*
 Q.2) Write a function to print the sum of all odd numbers from 1 to n.
 */

// public class Questions{
//     static int oddsum(int n){
//         int a=0;
//         for(int i=0;i<=n;i++){
//             if(i%2!=0){
//                 a=a+i;
//             }
//         }
//         return a;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter No. : ");
//         int a = sc.nextInt();
//         System.out.println("Sum Of Odd Number is : "+ oddsum(a));
//         sc.close();
//     }
// } 

/*
Q.3) Write a function which takes in 2 numbers and returns the greater of those two.
 */
// public class Questions{
//     static int compare(int n,int m){
//         if(n>m){
//             System.out.println(n +" --> is greater number.");
//         }else if(n==m){
//             System.out.println("Both are same");
//         }else{
//             System.out.println(m +" --> is greater number.");
//         }
//         return 0;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter No. :");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         compare(a, b);
//         sc.close();
//     }
// }

/*
Q.4) Write a function that takes in the radius as input and returns the circumference of a circle.
 */

// public class Questions{
//     static double circumference(Double r){
//         return 2*Math.PI*r;
//     }
//     public static void main(String[] args) {
//         System.out.print("Enter redius : ");
//         Scanner sc = new Scanner(System.in);
//         double r=sc.nextDouble();
//         System.out.println("The circumference is : "+circumference(r));
//         sc.close();
//     }
// }


/*
Q.5) Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
 */

// public class Questions{
//     static int age(int n){
//         if(n>=18){
//             System.out.println("You are Eligible to vote");
//         }else{
//             System.out.println("You are not eliglible to vote");
//         }
//         return n;
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter Your age : ");
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         age(a);
//         sc.close();
//     }
// }


/*
Q.6) Write an infinite loop using do while condition.
 */

// public class Questions{
//     public static void main(String[] args) {
//         while(true){
//             System.out.println("Infinite");
//         }
//     }
// }

/*
Q.7) Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
 */

// public class Questions{
//     public static void main(String[] args) {
//         int p =0,n=0,z=0,c;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Total No. You Want to insert : ");
//         c =  sc.nextInt();
//     for(int i=1;i<=c;i++){
//         System.out.println("Enter No. : ");
//         int j = sc.nextInt();
//             if(j>0){
//                 p++;
//             }
//             else if(j<0){
//                 n++;
//             }else{
//                 z++;
//             }
//         }
//         System.out.println("Result : ");
//         System.out.println("Possitive : "+p+"\n"+"Negative : "+n+"\n"+"Zeros : "+z);
//     }
// }

/*
Q.8) Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x"
 */

//  public class Questions{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter No.");
//         int x =  sc.nextInt();        
//         System.out.println("Enter Its Power.");
//         int n =  sc.nextInt();
//         int ans=1;
//        for(int i=1;i<=n;i++){
//         ans*=x;
//            }
//         System.out.println("The result is : "+ans);
//     }
//  }

/*
Q.9) Write a function that calculates the Greatest Common Divisor of 2 numbers.
 */

// public class Questions{
//     public static void main(String[] args) {
        
//     }
// } 

/*
Q.10)Write a program to print Fibonacci series of n terms where n is input by user:
0 1 1 2 35 8 13 24
In the Fibonacci series, a number is the sum of the previous 2 numbers that
came before it.
 */


// public class Questions{
//     static int a = 0, b = 1,c;
//     static void fib(int n){
//         if(n>0){    
//              c = a+b;
//             System.out.print(" "+c);
//             a=b;
//             b=c;
//             fib(n-1);
//         }
//     }
//     public static void main(String[] args) {
//         System.out.print(a+" "+b);
//         fib(24);
        
//     }
// } 