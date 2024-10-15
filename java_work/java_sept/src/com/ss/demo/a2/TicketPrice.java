package com.ss.demo.a2;

import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day x of the week");
        int x = sc.nextInt();

        if(x==1 || x==2|| x==3|| x==4 || x==5 ) {
            System.out.println("ticket price is $15");
        }
            else if(x==7){
                System.out.println("ticket price is $12");
            }
            else if(x==6){
            System.out.println("ticket price is $10");
            }
            else{
            System.out.println("invalid input. please try the number from 1-7");
        }
    }
}
