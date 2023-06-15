// Check if a number is Odd or Even

/*
 
if LSB = 0 (Even)
if LSB = 1 (Odd)

 */
public class Question1 {

    public static void oddEven(int n){
        if((n&1)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        int n = 1101;
        // if(n%10==0){
        //     System.out.println("number is Even");
        // }else{
        //     System.out.println("number is odd");
        // }

        oddEven(n);
    }
}
