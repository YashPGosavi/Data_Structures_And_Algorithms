/*

Single level Inheritance

        Single Base Class
                |
                |
        Single Derived Class

 */


public class _2_SingleLeveleInheritace {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.eat();
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
