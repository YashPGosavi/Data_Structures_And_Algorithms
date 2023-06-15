
// Check if a number is a Power of 2 or not.

public class Question2 {

    public static boolean twoPower(int n){
        return(n &(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(twoPower(16));
    }
}
