// Grandparent class
class Animal {
    void eat() {
        System.out.println("The animal eats food.");
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

public class Cat {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited from Animal
        dog.breathe(); // Inherited from Mammal
        dog.bark(); // Specific to Dog
    }
}
