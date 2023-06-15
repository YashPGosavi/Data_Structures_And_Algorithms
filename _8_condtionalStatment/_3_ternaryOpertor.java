/*

variable = condition ? statement1 : statement2;
---> if true then statment1 is executed.
---> if false then statment2 is executed.

*/

import java.util.*;

// public class _3_ternaryOpertor {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no. : ");
//         int n = sc.nextInt();
//         String a = (n%2==0)?"Even":"Odd";
//         System.out.println(a);
//     }
// }


//Que. Check If A Student Is Pass Or Fail
public class _3_ternaryOpertor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int n = sc.nextInt();
        String marks = (n>=35)?"Pass":"Fail";
        System.out.println(marks);
        sc.close();
    }
}
