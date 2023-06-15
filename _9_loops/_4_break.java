import java.util.Scanner;

// public class _4_break {
//     public static void main(String[] args) {
//         for(int i=0;i<10;i++){
//             if(i==5){
//                 System.out.println("null");
//                 break;
//             }else{
//                 System.out.println(i);
//             }
//         }
//     }
// }


//Que. keep entering number till it multiple of 10
public class _4_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter no. : ");
            int a = sc.nextInt();
            if(a%10==0){
                break;
            }
        }while(true);
        sc.close();
    }
}
