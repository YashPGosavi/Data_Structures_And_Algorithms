import java.util.*;

// // Binary To Decimal
// public class _7_binaryDecimalConversion {
//     public static int binToDec(int n){
//         int dec = 0;
//         int pow = 0;
//        while(n>0){
//             int lastDigit = n%10;
//             dec = dec+ (lastDigit * (int) Math.pow(2, pow));
//             n=n/10;  
//             pow ++;
//         }
//         return dec;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(binToDec(n));
//         sc.close();
//     }
// }



// Decimal to Binary
public class _7_binaryDecimalConversion {
    public static int decToBin(int n){
        int Bin = 0;
        int pow = 0;
       while(n>0){
            int rem = n%2;
            Bin =  Bin+(rem *  (int) Math.pow(10, pow));
            n=n/2;  
            pow ++;
        }
        return Bin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(decToBin(n));
        sc.close();
    }
}
