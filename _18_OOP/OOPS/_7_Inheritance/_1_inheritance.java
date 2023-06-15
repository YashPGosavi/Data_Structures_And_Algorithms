/*
Inheritance :- Inheritance is when properties & methods of base class are passed on to a derived class.

Types of Inheritance

1. Single Level Inheritance
2. Multi Level Inheritance
3. Hierarchial Inheritance
4. Hybrid Inheritance
5. Multiple Inhetince ( Does not implement by classes in java implement by using interfaces. )
 */

public class _1_inheritance {
    public static void main(String[] args) {
        Fish f = new Fish();
        f.eat();
    }
    
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("Breaths");
    }
}

class Fish extends Animal{
    void fins(){
        System.out.println("Have Fins");
    }
    void swims(){
        System.out.println("Can Swim");
    }
}