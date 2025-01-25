/*
1)if_elseif_else :-
        if(Condition){
            //body.
         }

         else if(Condition){
            //Body  --> if condition is fails then is comes to cheak whether else if condition is true or false, if true then it perform this operation. 
         }

         else{
            //Body  --> when both condions are false then the else condion execute.
         }

2)Tevnary Operator(?)

 */
import java.util.Scanner;

public class _2_java_conditional_statment {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       /*  //if_elseif_else
        System.out.println("Your Age : ");
        int a = sc.nextInt();

        if(a>=18){
            System.out.println("You can Get Licanse.");
        }

        else if(a>=16 && a<18){
            System.out.println("You can get Learning Licanse.");
        }

        else{
            System.out.println("You Are not Eligible to get licanse.");
        } */

        System.out.println("Enter Marks : ");
        int marks = sc.nextInt();

        String result = (marks>=50) ? "Pass" : "fail";
        System.out.println(result);
        
    }
}
