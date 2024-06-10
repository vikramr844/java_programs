//package Shape_package;

import java.util.Scanner;

class Rectangle{
    private final double length;
    private final double width;

    //parameterized constructor
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    //calculate th area
    public double calculateArea(){

        return (length*width);
    }
    //calculate the perimeter
    public double calculatePerimeter(){

    return (2*(length+width));
    }
}
/*
Task 2:
Define a class named Shape_package.Circle with the following attributes:
 */
 class Circle{
    double radius;
    private final static double PI=3.14;

    //parameterized constructor
    public Circle(double radius){
        this.radius=radius;
    }

    //calculate radius
    public double calculateCircumference(){
        return (2*PI*radius);
    }
}


public class CalculateShapes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //length input from user
        System.out.println("Enter the length : ");
        double length=sc.nextDouble();

        //width input from user
        System.out.println("Enter the width : ");
        double width=sc.nextDouble();

        Rectangle r1=new Rectangle(length,width);

        //radius input from user
        System.out.println("Enter the Radius : ");
        double radius=sc.nextDouble();

        Circle c1=new Circle(radius);

        //using object to call tha method aand print the values
        System.out.println("Area of Shape_package.Rectangle :"+r1.calculateArea());
        System.out.println("Area of Parimeter :"+r1.calculatePerimeter());
        System.out.println("Area of circle :"+c1.calculateCircumference());
sc.close();
    }
}
