
public class _2_callByValue {
    public static void swap(int a, int b) { // Simple Swapping Code Function.
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a (Formal Parameter) : " + a);
        System.out.println("b (Formal Parameter) : " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b); // call by value ---> variable copy goes in to the function call. 
                    // callByRefernce doesn't work in java.
        System.out.println("a (Arguments) : " + a);
        System.out.println("b (Arguments) : " + b);
    }
}
