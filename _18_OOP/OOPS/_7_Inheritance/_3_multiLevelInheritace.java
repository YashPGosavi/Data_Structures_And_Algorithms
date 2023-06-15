/*
Multi Level Inheritance

        Base Class
            |
            |
       Derived Class
            |
            |
        Derived Class

 */
public class _3_multiLevelInheritace {
        public static void main(String[] args) {
        Fish f = new Fish();
        f.eat();

        Dog d = new Dog();
        d.color="Brown";
        d.bread();
        d.legs();
        d.eat();
        d.breath();
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
    void fins() {
        System.out.println("Have Fins");
    }

    void swims() {
        System.out.println("Can Swim");
    }
}

class Mamals extends Animal{
    void legs(){
        System.out.println("Have legs");
    }
}

class Dog extends Mamals{
    void bread(){
        System.out.println("Have multiple breads");
    }
}

