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
        System.out.println("Driving the car");
    }
}

// Child class 2
class Bicycle extends Vehicle {
    int numberOfGears;

    public Bicycle(String brand, int year, int numberOfGears) {
        super(brand, year);
        this.numberOfGears = numberOfGears;
    }

    public void pedal() {
        System.out.println("Pedaling the bicycle");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 4);
        Bicycle bicycle = new Bicycle("Schwinn", 2021, 7);

        // Display information and perform specific actions
        car.displayInfo();
        car.drive();

        bicycle.displayInfo();
        bicycle.pedal();
    }
}
