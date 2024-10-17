package com.ss.demo.a2;

import java.util.Scanner;

public class ScoreCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("enter the marks");
            int marks = sc.nextInt();
            if (marks >= 90) {
                System.out.println("score A");
            } else if (marks >= 60 && marks <= 89) {
                System.out.println("score B");
            } else if (marks >= 0 && marks <= 59) {
                System.out.println("grade C");
            } else {
                System.out.println("invalid");
            }
            System.out.println("do you want to continue? press 1 for yes and 2 for no");
             n = sc.nextInt();
            if (n == 0) {
                System.out.println("stop");
            }


        } while (n == 1);


    }
}