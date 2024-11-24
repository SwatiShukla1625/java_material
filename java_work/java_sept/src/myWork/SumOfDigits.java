package IndiaAssign;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits whose sum you want to calculate");
        int num = sc.nextInt();
        int sum = 0;
        int temp = 0;


        while(num>0){
            temp = num%10;
            num = num/10;
            sum +=  temp;
        }
        System.out.println("the sum of digits is " + sum);
    }
}
