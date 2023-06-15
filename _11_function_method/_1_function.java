public class _1_function{
    static void add(int a){ // parameter or formal parameter --> formal parameter Write on the function defination.
        a = a+10;
        System.out.println(a);
        return;
    }
    public static void main(String[] args) {
        add(19); // arguments or actual parameter --> Argument Write on the function call.
        // If function is call, it get pull in call stack. When the execution is complete it pop from the call stack.
    }
}
