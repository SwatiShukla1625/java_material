package com.ss.demo.a3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int fact = 1;
        int i = 1;
        do{
            fact = fact * i;
            i++;
        }while(i<=n);
        System.out.println("factorial of the number is : " + fact);
    }
}
