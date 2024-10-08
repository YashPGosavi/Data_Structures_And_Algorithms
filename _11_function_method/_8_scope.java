
public class _8_scope {

    static int abs = 100; // Static variable // Everyweare inside the class;
    
    public static void main(String[] args) {
        int m = 10;// instance veriable //Method scope can use every-where inside class
        
        {
            int b = 10; // Local Variable// Block scope can not be used outside of block

            System.out.println(b);
            System.out.println(m);  //Method scope can use every-where inside class
        }

        System.out.println(m);  //Method scope can use every-vewherere inside class

         // System.out.println(b); // Block scope cannot be used outside of block

        System.out.println(abs);

    }

}
