import java.util.*;

// public class _2_else_if {
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter Age");
//       int age = sc.nextInt();

//       if (age > 18) {
//          System.out.println("Adult");
//       } else if (age <= 18 && age > 13) {
//          System.out.println("Teen");
//       } else {
//          System.out.println("Child");
//       }
//       sc.close();
//    }
// }


// // Que. Income Tax Calculator
// public class _2_else_if {
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter Salery : ");
//       int salery = sc.nextInt();

//       if (salery < 500000) {
//          System.out.println("0% income tax");
//          System.out.println("Tax is : 0rs");
//       } else if (salery > 500000 && salery < 1000000) {
//          System.out.println("20% income tax");
//          int a = (salery * 20) / 100;
//          System.out.println("Tax is : " + a + "rs");
//       } else {
//          System.out.println("30% income tax");
//          int a = (salery * 30) / 100;
//          System.out.println("Tax is : " + a + "rs");
//       }
//       sc.close();
//    }
// }


// // Que. Print the largest of 3
// public class _2_else_if {
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter number : ");
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//       int c = sc.nextInt();

//       if (a > b && a > c) {
//          System.out.println(a + " : is greater");
//       } else if (b > c) {
//          System.out.println(b + " : is greater");
//       } else {
//          System.out.println(c + " : is greater");
//       }
//    }
// }

// Que. Check If A Student Is Pass Or Fail
public class _2_else_if {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter marks : ");
      int marks = sc.nextInt();

      if (marks > 53) {
         System.out.println(" Pass ");
      } else {
         System.out.println(" Fail ");
      }
      sc.close();
   }
}