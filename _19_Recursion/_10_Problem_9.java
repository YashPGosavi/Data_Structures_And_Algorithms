/*
Problem 9
Print x^n
 */
// public class _10_Problem_9 {
//     public static int printPower(int n, int i){
//         if(i<1){
//             return 1;
//         }
//         return n * printPower(n, i-1);
//     }
//     public static void main(String[] args) {
//         System.out.println(printPower(10, 3));
//     }
// }

/*
Optimise Way
 */

public class _10_Problem_9 {
    public static int printPower(int n, int i) {
        if (i == 0) {
            return 1;   
        }
        int halfPower = printPower(n, i/2);

        int halfPowerSequare = halfPower * halfPower;

        if (i%2 != 0) {
            halfPowerSequare = n * halfPowerSequare;
        }

        return halfPowerSequare;
    }

    public static void main(String[] args) {
        System.out.println(printPower(10, 3));
    }
}