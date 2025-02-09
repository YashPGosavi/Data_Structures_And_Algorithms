// import java.util.Scanner;
/* 
public class _1_introduction{
    static double sum(double a,double b){ // Here the input double a,double b i called parameter or formal parameter, formal parameter Write on the  function defination.
        double c = a+b; 
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("The Result is : " + sum(a,b)); // Here the input double a,double b i called argument or actual parameter. Argument Write on the function call.
        //If function is call it get pull in call stack when the execution is complete it pop from the call stack.
    }
}
*/

/* 
// Swapping
public class _1_introduction{
    static void swap(double a, double b){
        double temp = a;
        a=b;
        b=temp;
        System.out.println(a+"   "+b);
    }
    public static void main(String[] args) {
       swap(12, 10);
    }
}
*/

/* 
// Call By Value
public class _1_introduction{
    static void callByValue(double a){
        a = 10;
    }
    public static void main(String[] args) {
        double a = 5;
        callByValue(a); // call by value ---> variable copy goes in to the function call. callByRefernce doesn't work in java 
        System.out.println(a);
    }
}
*/

/* 
// Que. Find Product of a & b.

public class _1_introduction{
    static double produ(double a, double b){
        double c = a*b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println(produ(a, b));
        sc.close();
        }
}
*/

/* 
// Que. Factorial of a number, n

public class _1_introduction{
    static double fact(double n){
        double f =1;
        for(double i=1 ; i<=n ; i++){
             f = f * i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        double n = sc.nextDouble();
        System.out.println(fact(n));
        sc.close();
        }
}
*/

/* 
 
public class _1_introduction{
    static double fact(double n){
        double f =1;
        for(double i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    static double BioCoe(double n, double r){
        double bc = fact(n)/(fact(r)*fact(n-r));
        return bc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and r : ");
        double n = sc.nextDouble();
        double r = sc.nextDouble();
        System.out.println(BioCoe(n, r));
        sc.close();
        }
}
*/