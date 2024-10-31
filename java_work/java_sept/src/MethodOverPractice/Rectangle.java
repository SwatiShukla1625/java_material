package MethodOverPractice;

public class Rectangle extends Shape{
    double length;
    double width;


    public Rectangle(double length, double width){

        this.length = length;
        this.width = width;
    }

    @Override
    public void printArea() {
        super.printArea();
        area = length*width;
        System.out.println("area of rectangle is : " + area);
    }
}

