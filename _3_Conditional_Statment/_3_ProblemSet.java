import java.util.Scanner;

/*
 Oue :-  Create The Calculator.
 */

public class _3_ProblemSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate :- ");
        double num1 = sc.nextDouble();
        char operation = sc.next().charAt(0);
        double num2 = sc.nextDouble();
        if(operation == '+'){System.out.println(num1+num2);}
        else if(operation == '-'){System.out.println(num1-num2);}
        else if(operation == '*'){System.out.println(num1*num2);}
        else if(operation == '/'){System.out.println(num1/num2);}
        else{System.out.println("Invalid Input");}
        sc.close();
    }
}
