package MethodOverPractice;

public class Circle extends Shape {
    double radius;

    public Circle(double radius){

        this.radius = radius;
    }

    @Override
    public void printArea() {
        super.printArea();
        area = 3.14*radius*radius;
        System.out.println("the area of circle is : " + area);
    }
}
