package OOPs_Package.Polymorphism_package;

/*
Task: Inheritance.Inheritance_package.Polymorphism_package.Polymorphism(OOPs)

Create a Java program that demonstrates polymorphism.
 Define a base class called Inheritance.Inheritance_package.Polymorphism_package.Shape with a method named draw(),
 which simply prints "Drawing a shape".
 Then, create two subclasses of Inheritance.Inheritance_package.Polymorphism_package.Shape named Circle and Rectangle.
  Override the draw() method in each subclass to print "Drawing a circle" for Circle and "Drawing a rectangle" for Rectangle.
   In the main method, create objects of type Inheritance.Inheritance_package.Polymorphism_package.Shape, Circle, andRectangle,and call the draw() method on each object.
 */
class Shape{
    public void draw() {
        System.out.println("Drawing a Inheritance.Inheritance_package.Polymorphism_package.Shape");
    }
}
class Circles extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a Circle");
    }
}
class Rectangles extends Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }
}



public class Polymorphism {
    public static void main(String[] args) {
        Shape c1=new Circles();
        Shape r1=new Rectangles();
        c1.draw();
        r1.draw();
    }
}
