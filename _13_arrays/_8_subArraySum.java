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
    
    public static int subArraySum(int[] nums) {
        // Initialize variables
        int maxCurrent = nums[0]; // Tracks the maximum sum ending at the current position
        int maxGlobal = nums[0];  // Tracks the overall maximum sum found so far

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Decide whether to extend the current subarray or start a new one
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            // Update the global maximum if the current subarray sum is greater
            maxGlobal = Math.max(maxGlobal, maxCurrent);
        }

        // Return the global maximum sum
        return maxGlobal;   
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        System.out.println(subArraySum(arr));

    }
}