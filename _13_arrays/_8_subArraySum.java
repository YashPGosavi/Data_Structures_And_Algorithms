/*
Traditional Method
//  */
// public class _8_subArraySum {
//     public static void subArraySum(int[] arr) {
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;

//         int sum =0;

//         for (int i = 0; i < arr.length; i++) {

//             for (int j = i ; j < arr.length; j++) {
//                  sum = 0;

//                 for (int k = i; k <= j; k++) {
//                     sum += arr[k];    
//                 }
//                 System.out.println(sum);
//                 if (max<sum) {
//                     max = sum;
//                 } else if (min>sum) {
//                     min = sum;
//                 }
//             }
//         }
//         System.out.println("Maximum Sum is : " + max);
//         System.out.println("Minimum Sum is : " + min);
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, -2, 6, -1, 3 };
//         subArraySum(arr);

//     }
// }

/* ------------------------------------------------------------------------------------------------------------------------------------ */

/*
 
Prefix Method
 
*) Prefix[i] = Prefix[i-1] + arr[i];

**) Prefix[End] - Prefix[Start-1];
 */

//  public class _8_subArraySum {
//     public static void subArraySum(int[] arr) {
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;

//         int[] prefix = new int[arr.length];

//         for(int i=1;i<prefix.length;i++){
//             prefix[i]= prefix[i-1] + arr[i];
//             System.out.println(prefix[i]);
//         }

//         int sum =0;

//         for (int i = 0; i < arr.length; i++) {

//             for (int j = i ; j < arr.length; j++) {
//                  sum = 0;

//                  sum = i==0?prefix[j] : prefix[j]-prefix[i-1];

//                 System.out.println(sum);

//                 if (max<sum) {
//                     max = sum;
//                 } else if (min>sum) {
//                     min = sum;
//                 }
//             }
//         }
//         System.out.println("Maximum Sum is : " + max);
//         System.out.println("Minimum Sum is : " + min);
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, -2, 6, -1, 3 };
//         subArraySum(arr);

//     }
// }

/* ------------------------------------------------------------------------------------------------------------------------------------ */

/*
Use for Max Sum :-
 Kaddans algorithm :- If sum == -Integer{
                            sum=0;
                             }

Time Complexity : O(n);
 */

public class _8_subArraySum {
    public static void subArraySum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            max = Math.max(max, sum);
        }
        System.out.println("Maximum Sum is : " + max);
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        subArraySum(arr);

    }
}