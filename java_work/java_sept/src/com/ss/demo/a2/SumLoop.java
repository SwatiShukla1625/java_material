package com.ss.demo.a2;

import java.util.Scanner;

public class SumLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        System.out.println("enter the number n whose sum you want");
        int n = sc.nextInt();
        while(i<=n){

            sum = sum + i;
            i++;
        }
        System.out.println("sum of  numbers is : " + sum);
    }
}
