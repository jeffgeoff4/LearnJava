//Define the Person class
class Person {
    // Field or attribute name
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    // Method to display the infomation about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

// Main class from public class
public class Oluka {
    public static void main(String[] args) {
        // create the a Person object
        Person person1 = new Person("Ojok", 25);

        // Call the displayInfo method to print the information
        person1.displayInfo();
    }
}