// public class _2_forLoop {
//     public static void main(String[] args) {
//         for(int i=0;i<10;i++){
//             System.out.println(i+" : Hallo World!");
//         }
//     }
    
// }


/* Que. Print Pattern

    *  *  *  *  
    *  *  *  *  
    *  *  *  *  
    *  *  *  *  

*/

// public class _2_forLoop {
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             System.out.println("* * * * ");
//         }
//     }
    
// }


//Que. Print reverse of the number

// public class _2_forLoop{
//     public static void main(String[] args) {
//         int n = 23052002;
//         while(n>0){
//             System.out.print(n%10+ " ");
//             n/=10;
//         }
//     }
// }

//Que. Reverse the number

public class _2_forLoop{
    public static void main(String[] args) {
        int n = 23052002;
        int revers = 0;
        while(n>0){
            int lastdigit = n%10;
            revers = (revers*10)+lastdigit;
            n=n/10;
        }
        System.out.println(revers);
    }
}