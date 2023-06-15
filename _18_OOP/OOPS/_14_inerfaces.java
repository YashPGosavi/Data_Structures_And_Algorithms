/*

Inteface :- Interface is a blueprint of a class

Need of interfaces.
1. Gives 100% Abstraction.
2. Multiple inheritance.

Properties of Interfaces
1. All methods are public, abstract & without implementation
2. Used to achieve total abstraction
3. Variables in the interface are final, public and static
 */
public class _14_inerfaces {
    public static void main(String[] args) {
     Queen q = new Queen();
     q.moves();   

     Men m = new Men();
     m.eat();
     m.walk();
    }
}

interface chasePlayer{
    void moves();
}

class Queen  implements chasePlayer{
    public void moves(){
        System.out.println("in all directions");
    }
}
class King  implements chasePlayer{
    public void moves(){
        System.out.println("in all direction by only one step");
    }
}
class Rook  implements chasePlayer{
    public void moves(){
        System.out.println("up,down,left,Right");
    }
}

//Multiple Inheritance

interface Havbihourse{
    void eat();
}

interface carnihoourse{
    void walk();
}

class Men implements Havbihourse, carnihoourse {
    public void eat(){
        System.out.println("veg and non-veg");
    }
    public void walk(){
        System.out.println("can walk on 2 and 4 legs");
    }
}