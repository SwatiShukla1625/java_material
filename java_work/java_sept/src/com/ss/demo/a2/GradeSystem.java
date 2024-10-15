package com.ss.demo.a2;

public class GradeSystem {
    public static void main(String[] args) {
        int x = 75;
        if(x>=90 && x<=100){
            System.out.println("you got grade A");
        }
        else if(x>=80 && x<=89){
            System.out.println("you got grade B");
        }
        else if(x>=70 && x<=79){
            System.out.println("you got grade C");
        }
        else if(x>=60 && x<=69){
            System.out.println("you got grade D");
        }
        else{
            System.out.println("you got grade Fail");
        }
    }
}
