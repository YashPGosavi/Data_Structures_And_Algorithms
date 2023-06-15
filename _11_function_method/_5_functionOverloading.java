/*
 Method Overloding :-
        Methos with same name but different parameter in same class.

Fuction Overloading done using :

1) Parameter
2) Data Type

// Overloading done in same class and overriding in diffirent class
 */

 public class _5_functionOverloading{
       public static int add(){
              System.out.print("This is addtion :");
              return -1;
       }
       public static int add(int a){ // Using Parameter
              System.out.println(a+10);
              return a;
       }
       public static float add(float a){  //Using Data type
              System.out.println(a+5.35);
              return a;
       }
       public static void main(String[] args) {
              add();
              add(5);
              add(5.0f);  
         
       }
 }
 
