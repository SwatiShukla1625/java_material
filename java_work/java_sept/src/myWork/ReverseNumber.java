package IndiaAssign;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to reverse");
        int num = sc.nextInt();

        int value = 0;

        while (num > 0) {
            int temp = num % 10;
            num = num / 10;
            value = 10 * value + temp;
        }
            System.out.println("the reversed number is : " + value);

    }
}
