package com.ss.demo.a2;

public class ContinueForLoop {
    public static void main(String[] args) {

        for (int i = 1; i<=100; i++){
            if(i%7==0){
                continue;
            }
            System.out.println("list of numbers is : " + i);
        }
    }
}
