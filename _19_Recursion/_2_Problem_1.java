/*
Problem 1
Print numbers from n to 1 (Decreasing Order)
 */
public class _2_Problem_1 {
    public static void printNum(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printNum(n-1);
    }
    public static void main(String[] args) {
        printNum(10);
    }
    
}
