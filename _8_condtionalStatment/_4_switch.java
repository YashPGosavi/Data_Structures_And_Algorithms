import java.util.Scanner;

// public class _4_switch {
//     public static void main(String[] args) {
//         char a = 'b';
//         switch (a) {
//             case 'a':
//                 System.out.println("a");
//                 break;
//             case 'b':
//                 System.out.println("b");
//                 break;
//             case 'c':
//                 System.out.println("c");
//                 break;
//             default:
//                 System.out.println("default");
//                 break;
//         }
//     }
// }


// Que. Make a calculator
public class _4_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no.");
        int a = sc.nextInt();

        System.out.println("Enter Oprator(+,-,*,/) : ");
        char symbol = sc.next().charAt(0);

        System.out.println("Enter 2nd no.");
        int b = sc.nextInt();
        
        System.out.print(a + " " + symbol + " " + b + " = ");
        switch (symbol) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("wrong input");
                break;
        }
        sc.close();
    }
}