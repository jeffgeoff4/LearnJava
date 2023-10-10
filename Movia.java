// Multilevel inheritance
//Grandparent class
class Animal {
    void eat() {
        System.out.println("The Animal eats food.");
    }
}

// Parent class
class Mammal extends Animal {
    void breathe() {
        System.out.println("The mammal breathes.");
    }
}

// Child class
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Movia {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherite from Animal
        dog.breathe(); // Inherite from Birds
        dog.bark(); // Specific to Dog
    }
}
