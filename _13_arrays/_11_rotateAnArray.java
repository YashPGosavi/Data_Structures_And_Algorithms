// public class _11_rotateAnArray {
//     public static void rotate(int arr[], int n, int k) {
//         int temp[] = new int[n];
//         int idx = 0;
//         int lastIdx = n - 1;

//         for (int i = k - 1; i >= 0; i--) {
//             temp[i] = arr[lastIdx];
//             lastIdx--;
//             idx++;
//         }

//         for (int i = 0; i <= lastIdx; i++) {
//             temp[idx] = arr[i];
//             idx++;
//         }

//         for (int i = 0; i < n; i++) {
//             arr[i] = temp[i];
//         }
//     }

//     public static void main(String args[]) throws Exception {
//         int arr[] = { 1, 2, 3, 4, 5 };
//         int N = 5;
//         int K = 2;

//         rotate(arr, N, K);

//         for (int i = 0; i < N; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

public class _11_rotateAnArray {

    public static void rotate(int A[], int low, int high) {

        while (low < high) {
            int temp = A[low];
            A[low] = A[high];
            A[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String args[]) throws Exception {
        int arr[] = { 1, 2, 3, 4, 5 };
        int N = 5;
        int K = 2;

        K = K % N;

        rotate(arr, 0, N - K - 1);
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}

/*
Explanation

For example, rotating nums = [1, 2, 3, 4, 5, 6, 7] by k = 3:
	1.	Reverse the entire array
        nums = [7, 6, 5, 4, 3, 2, 1]
        
	2.	Reverse the first k=3 elements
        nums = [5, 6, 7, 4, 3, 2, 1]

	3.	Reverse the remaining n-k=4 elements
        nums = [5, 6, 7, 1, 2, 3, 4] ✅ (Final result)

 */

class Solution {
    public void rotate(int[] nums, int k) {
         int n = nums.length;
         k = k % n; // Handle cases where k > n
 
         // Reverse the entire array
         reverse(nums, 0, n - 1);
 
         // Reverse the first k elements
         reverse(nums, 0, k - 1);
 
         // Reverse the remaining n - k elements
         reverse(nums, k, n - 1);
     }
 
     // Helper method to reverse a portion of the array
     private void reverse(int[] nums, int start, int end) {
         while (start < end) {
             int temp = nums[start];
             nums[start] = nums[end];
             nums[end] = temp;
             start++;
             end--;
         }
     }
 }