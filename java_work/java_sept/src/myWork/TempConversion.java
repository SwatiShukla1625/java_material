package myWork;

import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        System.out.println("welcome to temp conversion system");
        Scanner sc = new Scanner(System.in);
        int x = 1;
        while (x != 3) {



            double ft = 0.0;
            double c = 0;
            System.out.println("selct from the following option");
            System.out.println("1)Celcius \n2)Fahrenheit \n3)exit");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("enter the value");
                    ft = sc.nextInt();
                    c = (ft - 32) * 5 / 9;
                    System.out.println("the temp in celcius is : " + c);
                    break;
                case 2:
                    System.out.println("enter the value");
                    c = sc.nextInt();
                    ft = (c * 9 / 5) + 32;
                    System.out.println("the temp in fahrenheit is : " + ft);
                    break;
                case 3:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("invalid option. please try again");
                    x++;
            }
        }
    }
}
