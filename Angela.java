// Single line comments in Java
/*
 * Suppose we want to module a simple Person enity with name
 * and age
 */

//Example 1

//Define the Person class
class Person {
    // Fields(attributes)
    String name;
    int age;

    // Constructors
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Methods to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Run output in the terminal/console
public class Angela {
    public static void main(String[] args) {
        // Create a Person object
        Person person1 = new Person("Angela", 22);

        // Call the displayInfo method to print the information
        person1.displayInfo();
    }
}
