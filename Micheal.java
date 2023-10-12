import java.util.Scanner;

//Superclass
class Shape {
    public double calculateArea() {
        return 0.0; // Area for an unspecified shape
    }
}

// Subclass 1
class Rectangle extends Shape {
    private double length; // Lenght of Rectangle
    private double width; // Width of Rectangle

    // Constractors
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Display Scanner to input values in the terminal
public class Micheal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();

        Shape shape1 = new Rectangle(rectangleLength, rectangleWidth);

        System.out.println("Area of Rectangle: " + shape1.calculateArea());

        scanner.close(); // Close the scanner when done

    }
}