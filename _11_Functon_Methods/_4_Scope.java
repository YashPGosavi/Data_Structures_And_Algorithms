
public class _4_Scope {
    public static void main(String[] args) {
        int m = 10; //Method scope can use every-vere inside class
        {
            int b = 10; // Block scope cannot be used outside of block

            System.out.println(m);  //Method scope can use every-vere inside class
        }
        System.out.println(m);  //Method scope can use every-vere inside class

//        System.out.println(b); // Block scope cannot be used outside of block


    }

}
