/*
Hybrid Inheritance :- Combination of more than one type of inheritance
 */
public class _5_hybridInheritance {
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

class Bird extends Animal{
    void fly(){
        System.out.println("Can Fly");
    }
}
