/*

Multi Level Inheritance

               Base Class
                /      \
               /        \
     Derived Class    Derived Class 

*/

public class _4_hierarchialInheritance {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.eat();

        Mamals m = new Mamals();
        m.eat();

        Bird b = new Bird();
        b.eat();


    }

}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("Breaths");
    }
}

class Fish extends Animal {
    void swims() {
        System.out.println("Can Swim");
    }
}

class Mamals extends Animal {
    void Walks() {
        System.out.println("Have Walk");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Can Fly");
    }
}

