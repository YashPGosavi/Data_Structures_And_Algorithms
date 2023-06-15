/*
 types of methods.
 1) Pre-difine Methods :-
                Alredy define in java library.
                By adding neccesary packages we can call that methods.

            Example :- 
                    Math.max();
                    Math.sqrt();
                    Math.pow();

2) User-defined Methods :-
                We write this method as per our need.  
                
*/
/*
 Static and instance methods

    1.  Static :-
            We dont have to create object to call this method.

    2.  Instance :- 
            We have to create object to call this method.
 */

public class _4_typesOfMethod {
    public static int area1(int side) {
        int areasqu = side * side;
        return areasqu;
    }

    public int area2(int side) {
        int areasqu = side * side;
        return areasqu;
    }

    public static void main(String[] arg) {
        System.out.println(area1(5)); // Static method.

        _4_typesOfMethod c=new _4_typesOfMethod();int a=c.area2(5); // instance method.
        System.out.println(a);

    }
}
