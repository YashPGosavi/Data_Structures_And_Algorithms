/* 
******************************************************************************************************************************************************************
 Loops :- Set of statment or instruction that are repeted for fixed number of time (or) untile the condition remains true.
 1)for loop :-
            i) for loop is Entry control loop.
            ii) We use the for loop when we know that how many times that we have to iterat.
        Syntax :-
            for( initialization ; test_condition ; Changes(incremental/decremental));

            there is inhanced For Loop : - Know as forEach loop

1.2)For Each Loop :-
            there is inhanced For Loop : - Know as forEach loop
        Syntax :-
            for(data_type element_variable : name_of_collection/array);
         
 ******************************************************************************************************************************************************************          
 2)While loop
            i) It is used for infinte condition where we have to do some sudden operation.
        Syntax :-
            initiallization
            while(test){
                segments;
                change;
            }
    
 ******************************************************************************************************************************************************************
 3)Do While loop
            i) It use to the condition where we have to perform the operation atlest one time.
            ii) do while loop exicute atleat one time.
            iii) Exit control loop.

        Syntax :-
            initiallization
            do{
                segments;
                change;
            }while(test); 
 ******************************************************************************************************************************************************************
 */

import java.util.Scanner;

import javax.lang.model.element.Element;

/* 
for loop
public class _1_Loops{
    public static void main(String[] args) {
        System.out.println("Enter No. : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int fact = 1;
        for(int i=n; i>1;i--){
            if(n<=0){
                System.out.println("Error");
            }
            else
            fact = fact * i;
        }
        System.out.println(fact);
    }
 } */

 /*
 //for each loop
public class _1_Loops{
    public static void main(String[] args) {
        int []arr={1,2,3};
        for(int e : arr){
            System.out.println(e);
        }       
    }
 } */

/* 
//while loop
public class _1_Loops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 1;

        System.out.println("Enter No. : ");
        int x = sc.nextInt();
        System.out.println("Enter Power :");
        int n = sc.nextInt();
        
        int i = 1;
    while(i<=n){
        ans = ans*x;
        i++;
    }
    System.out.println("Ans is : " +ans);
    }
 } */

/* 
//do while
public class _1_Loops{
    public static void main(String[] args) {
        //You have to take input untile user entered possitive number
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Enter No. :");
             n=sc.nextInt();
        }while(n<0);
    }
} */

