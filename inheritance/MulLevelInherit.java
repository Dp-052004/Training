package inheritance;

// Grandparent class
class Animal1 {
    String type = "Animal";

    void eat() {
        System.out.println(type + " eats food");
    }
}

// Parent class
class Mammal1 extends Animal1 {
    int legs = 4;

    void walk() {
        System.out.println("Mammal walks on " + legs + " legs");
    }
}

// Child class
class Dog1 extends Mammal1 {
    String breed = "Labrador";

    void bark() {
        System.out.println("Dog breed is " + breed);
    }
}


public class MulLevelInherit {
    public static void main(String[] args) {

        Dog1 d = new Dog1();

        d.eat();    
        d.walk();   
        d.bark();   
    }
}
