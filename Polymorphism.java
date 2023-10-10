//Superclass

class Shape {
    public double calculateArea() {
        return 0.0; // Default area for unspecified shape
    }
}

// Subclass 1 Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width; // Calculate the area for rectangle
    }
}

// Subclass 2
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Calculate the area of Circle
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(10, 6);
        Shape shape2 = new Circle(9);
        System.out.println("Area of Rectangle: " + shape1.calculateArea());
        System.out.println("Area of Circle: " + shape2.calculateArea());

    }
}
