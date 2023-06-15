/*
 Sub-Array :- a continuous part of array.


 Input :-
        arr = {1,2,3,4,5};

 Output :-

        1 
        1 2 
        1 2 3 
        1 2 3 4 

        2 
        2 3 
        2 3 4 

        3 
        3 4 

        4 

 */

public class _7_subArray {
    public static void subArray(int[] arr) {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i ; j < arr.length; j++) {
                sum =0;
                for (int k = i; k < j; k++) {
                    System.out.print(arr[k] + " ");
                    sum +=arr[k];
                }
                System.out.print(" : Sum is :" + sum);
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        subArray(arr);
        int total_subArray = (arr.length*(arr.length-1)) / 2;
        System.out.println("Total subarray count is :- "+total_subArray);
    }
}