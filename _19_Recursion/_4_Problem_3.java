/*
Problem 3
Print factorial of a number n.
 */
public class _4_Problem_3 {
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        return n*Fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(Fact(5));
        
    }
}
