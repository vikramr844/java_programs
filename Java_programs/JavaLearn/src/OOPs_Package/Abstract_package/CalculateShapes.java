package OOPs_Package.Abstract_package;
/*
TASK:6 (Abstraction)
    Define an abstract class named "Shape" with the following abstract methods:
        calculateArea(): to calculate the area of the shape.
        calculatePerimeter(): to calculate the perimeter of the shape.

    Create concrete subclasses such as "Circle" and "Rectangle" that extend the Shape class.

    Implement the abstract methods in each subclass to calculate the area and perimeter specific to that shape.

    In the main method, create objects of type Circle and Rectangle,
    and call their respective methods to calculate and display the area and perimeter.
 */
abstract class Shape {
    // Abstract method (does not have a body)
    public abstract double area();

    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method
    public double area() {
        return length * width;
    }
}

class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method
    public double area() {
        double PI = 13.14;
        return PI * radius * radius;
    }
}

public class CalculateShapes {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(5, 4);
        Shape shape2 = new Circle(3);

        shape1.display();
        System.out.println("Area of rectangle: "+shape1.area());

        shape2.display();
        System.out.println("Area of circle:"+shape2.area());
    }
}
