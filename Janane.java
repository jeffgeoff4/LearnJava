class Person {
    // Private attributes
    private String name;
    private int age;
    private String email;

    // Constructor
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println(" Age cannot be zero and a negative value");
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

public class Janane {
    public static void main(String[] args) {
        Person person = new Person("Nakiyingi Movia", 25, "n.movia@uict.ac.ug");

        // Accessing attributes using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Email: " + person.getEmail());

        // Modify attributes using the setter method

        person.setAge(25);
        person.setEmail("nakiyingi.movia@uict.ac.ug");

        // Displaying the update attributes
        System.out.println("Modified Age: " + person.getAge());
        System.out.println("Modified Email: " + person.getEmail());

    }

}
