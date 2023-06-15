
public class _8_scope {
    public static void main(String[] args) {
        int m = 10; //Method scope can use every-where inside class
        {
            // int b = 10; // Block scope can not be used outside of block

            System.out.println(m);  //Method scope can use every-where inside class
        }
        System.out.println(m);  //Method scope can use every-vewherere inside class

         // System.out.println(b); // Block scope cannot be used outside of block


    }

}
