//Create an abstract class Shape with an abstract method calculateArea().
// Then, create two subclasses, Circle and Rectangle, which inherit from Shape and implement the calculateArea
// method to calculate the area of a circle and rectangle, respectively.
package com.shubham;

import java.util.Scanner;

abstract class Shape {
     abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @java.lang.Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle1 extends Shape {
    double length, breadth;

    public Rectangle1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @java.lang.Override
    double calculateArea() {
        return length * breadth;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double radius = sc.nextDouble();
        Circle c = new Circle(radius);
        double circleArea = c.calculateArea();
        System.out.print("Enter the length of the Rectangle : ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth of the Rectangle : ");
        double breadth = sc.nextDouble();
        Rectangle1 rec = new Rectangle1(length, breadth);
        double rectangleArea = rec.calculateArea();
        System.out.println("Circle Area = " + circleArea);
        System.out.println("Rectangular Area = " + rectangleArea);
    }
}
