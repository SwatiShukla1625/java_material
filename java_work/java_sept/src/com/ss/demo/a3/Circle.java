package com.ss.demo.a3;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = 3.14 * radius * radius;
        //System.out.println("the area of circle is :" + area);
        return area;
    }

    public double getCircumference() {
        double circumference = 2 * 3.14 * radius;
        //System.out.println("the circumference of circle is :" + circumference);
        return circumference;
    }

    public void printInfo() {
        System.out.println("the area of circle is : " + getArea());
        System.out.println("the circumference of circle is :" + getCircumference());
        System.out.println("the radius of circle is " + radius);
    }

    public static void main(String[] args) {
        Circle c = new Circle(10.25);
        c.printInfo();
    }
}