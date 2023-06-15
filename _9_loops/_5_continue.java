import java.util.*;

//continue use to skip the iteraion

// public class _5_continue {
//     public static void main(String[] args) {
//         for(int i=1;i<5;i++){
//             if(i==3){
//                 continue;
//             }else{
//                 System.out.println(i);
//             }
//         }
//     }
// }



// public class _5_continue {
//     public static void main(String[] args) {
//         do{
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter no. : ");
//             int a = sc.nextInt();
//             if(a%10==0){
//                 continue;
//             }else{
//                 System.out.println("number is :" + a);
//             }
//         }while(true);
//     }
// }

//Que. CHeak if a number is Prime number or not


public class _5_continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. : ");
        int n = sc.nextInt();
        boolean isprime = true;
        for(int i=2 ; i<Math.sqrt(n) ; i++){
            if(n%i!=0){
                isprime = false;
                break;
            }else{
                isprime = true;
            }
        }
        if(isprime==true){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
        sc.close();
    }
}