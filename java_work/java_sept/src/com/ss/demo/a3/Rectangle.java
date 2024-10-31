package com.ss.demo.a3;

public class Rectangle {

        double width;
        double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public void printArea() {
            double area = width * height;
            System.out.println("The area of the rectangle is: " + area);
        }

        public static void main(String[] args) {
            Rectangle rec = new Rectangle(25, 50);
            rec.printArea(); // Call the printArea method to display the area
        }
    }

