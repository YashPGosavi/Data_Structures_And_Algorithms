/*
Problem 4
Print sum of first n natural numbers.
   
*/ 
public class _5_Problem_4 {
    public static int printSum(int n){
        if(n==1){
            return 1;
        }
        return n+printSum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(printSum(5));
    }
}
