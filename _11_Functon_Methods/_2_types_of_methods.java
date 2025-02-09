// import java.util.Scanner;

/*
 types of methods.
 1) Pre-difine Methods :-
                Alredy define in java library.
                by adding neccesary packages we can call that methods.

                example :- 
                    Math.max();
                    Math.sqrt();
                    Math.pow();

2) User-defined Methods :-
                We write this method as per iur need.  
                
*/
/*
 Static and instance methods

 static :-
        we dont have to create object to call this method.

Instance :- 
        we have to create object to call this method.
 */

// public class _2_types_of_methods {
//     public static int area(int side){
//         int areasqu = side*side;
//         return areasqu;
//     }
//     public static void main(String[] arg){
//         System.out.println(area(5));
//     }
// }

// public class _2_types_of_methods {
//     public int area(int side){
//         int areasqu = side*side;
//         return areasqu;
//     }
//     public static void main(String[] arg){
//         _2_types_of_methods c = new _2_types_of_methods();
//         int a=c.area(5);
//         System.out.println(a);
//     }
// }

/*
 Method Overloding :-
        Methos with same name but different parameter in same class.
 */
/* 
 public class _2_types_of_methods{
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
 */


//Q. Check if a number is Prime or not
//  public class _2_types_of_methods{
//        public static Boolean prime(int n){
//               boolean isPrime = true;
//               for(int i=2;i<=Math.sqrt(n);i++){
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


//Q.Print all Primes in a Range
// public class _2_types_of_methods{
//        public static Boolean prime(int n){
//               boolean isPrime = true;
//               for(int i=2;i<=Math.sqrt(n);i++){
//                      if (n%i==0){
//                             isPrime = false;
//                             break;
//                      }  
//                      isPrime = true;
//               }
//          return isPrime;
//        }
//        public static void printprime(int n){
//               for(int i=2;i<=n;i++){
//                      if(prime(i)){
//                             System.out.print (i+" ");
//                      }
//               }
// }
//        public static void main(String[] args) {
//               Scanner sc = new Scanner(System.in);
//               System.out.print("Enter Number : ");
//               int n = sc.nextInt();
//               printprime(n);
//               sc.close();
//        }
// }

