package ArrayPractise;

import java.util.Scanner;


public class SumArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            int[] array = new int[n];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }


            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            System.out.println("The sum of the array elements is: " + sum);

        }
    }
