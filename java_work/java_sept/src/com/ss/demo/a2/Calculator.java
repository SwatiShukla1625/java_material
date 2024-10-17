package com.ss.demo.a2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        System.out.println("enter the number from calculator");
        int x = sc.nextInt();
        if (x == 1) {
            int sum = num1 + num2;
            System.out.println("sum of two numbers is : " + sum);
        } else if (x == 2) {
            int sub = num1 - num2;
            System.out.println("sub of num1 and num2 is : " + sub);
        } else if (x == 3) {
            int mul = num1 * num2;
            System.out.println("multiplication of num1 and num2 is " + mul);
        } else if (x == 4) {
            int div = num1 / num2;
            System.out.println("division of num1 and num2 is :" + div);
        } else if (x == 5) {
            int mod = num1 % num2;
            System.out.println("modulus of num1 and num2 is " + mod);
        } else {
            System.out.println("invalid number. try again");

        }
    }
}