package ArrayPractise;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements you want in your array");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("enter the elements of the array");
        for (int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }
        int start = 0;
        int end = array.length-1;
        while(start<end){
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;
            start++;
            end--;
        }
        System.out.println("Display the elements of the array");
        for(int element : array){
            System.out.println(element);
        }
    }
}