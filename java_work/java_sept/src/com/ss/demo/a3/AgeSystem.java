package com.ss.demo.a3;

import java.util.Scanner;

public class AgeSystem {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();

        if(age<13) {
            System.out.println("child");
        }
        else if(age>=13 && age<=19){
            System.out.println("teenager");
        }
        else if(age>=20 && age<=59){
            System.out.println("adult");
        }
        else{
            System.out.println("senior");
        }

}
    }


