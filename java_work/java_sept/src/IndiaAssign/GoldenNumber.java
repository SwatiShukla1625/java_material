package IndiaAssign;

import java.util.Scanner;

public class GoldenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        int sum = 0;
        int value = 0;
        int temp = num;
        while(num>0){
            value = num%10;
            sum = sum + (value*value*value);
            num = num/10;
        }
        if(temp == sum){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
