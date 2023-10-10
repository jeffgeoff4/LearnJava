//Example2
// Suppose we have a parent class "Vehicle"
/*
 * and we want to create child classes "car"
 * and "Bike: will inherit properties and methods from the 
 * parent class 
 */

// Parent class (base class)
class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);

    }
}

// Child class 1
class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year); // Call the constructor of the parent class
        this.numberOfDoors = numberOfDoors;
    }

    public void drive() {
        System.out.println("Driving th car");
    }
}

public class Diana {
    public static void main(String[] args) {
        Car car = new Car("Forester", 2023, 5);

        // Display information and perform specific actions
        car.displayInfo();
        car.drive();
    }
}
