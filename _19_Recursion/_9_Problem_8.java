/*
Problem 8
WAF to find the last occurence of an element in an array
 */
public class _9_Problem_8 {
    public static int lastOccurence(int []arr,int key,int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }

        return lastOccurence(arr, key, i-1);
    }
    public static void main(String[] args) {
        int [] arr ={1,3,2,4,2,4};
        System.out.println(lastOccurence(arr,1,arr.length-1));
    }
}
