package com.ss.demo.a4;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("welcome to XYZ Bank");
        Scanner sc = new Scanner(System.in);
        int option = 1;
        int balance = 0;
        while(option !=4){
            System.out.println("the bank menu is : ");
            System.out.println("1)initial balance \n2)deposit \3)withdraw \n4)exit");
            System.out.println("you can select one option");
            option = sc.nextInt();

            switch(option){
                case 1 :
                    System.out.println("initial balance");
                    System.out.println("initial balance is 0");
                    break;
                case 2 :
                    System.out.println("deposit");
                    System.out.println("enter the amount you want to deposit");
                    int x = sc.nextInt();
                    balance += x;
                    System.out.println("amount deposited is :" + balance);
                    break;
                case 3:
                    System.out.println("withdraw");
                    System.out.println("enter the amount you want to withdraw");
                    int y = sc.nextInt();
                    if(y>balance){
                        System.out.println("there is an error. please try again");
                    }
                    else{
                     balance -= y;
                        System.out.println("amount withdrawn is " + balance);
                    }
                    break;
                case 4 :
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("invalid option. please try again");
                    option ++;

            }

        }
    }
}
