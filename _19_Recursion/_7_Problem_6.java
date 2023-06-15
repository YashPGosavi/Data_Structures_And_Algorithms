/*
Problem 6
assenting
Check if a given array is sorted or not.  
 */

public class _7_Problem_6 {
    public static boolean isSort(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
         return isSort(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,6,4,5};
        System.out.println(isSort(arr,0));
    }
}
