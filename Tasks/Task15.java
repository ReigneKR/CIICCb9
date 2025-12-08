package tasks;

import java.util.Scanner;

// 1. Define the interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// 2. Create the abstract class implementing the interface
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    // Constructor to initialize attributes
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
}

// 3. Concrete class for Circle
class Circle extends AbstractShape {
    double radius;

    public Circle(String color, double radius) {
        // Passing 0 for length/width as they don't apply to circles in this context
        super(color, 0, 0);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Concrete class for Rectangle
class Rectangle extends AbstractShape {
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// 4. Main class to execute
public class Task15 {
    public static void main(String[] args) {
        // Creating instances
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 10.0, 4.0);

        // Display results for Circle
        System.out.println("--- Circle (" + circle.color + ") ---");
        System.out.printf("Area: %.2f\n", circle.calculateArea());
        System.out.printf("Perimeter: %.2f\n", circle.calculatePerimeter());

        // Display results for Rectangle
        System.out.println("\n--- Rectangle (" + rectangle.color + ") ---");
        System.out.printf("Area: %.2f\n", rectangle.calculateArea());
        System.out.printf("Perimeter: %.2f\n", rectangle.calculatePerimeter());
    }
}