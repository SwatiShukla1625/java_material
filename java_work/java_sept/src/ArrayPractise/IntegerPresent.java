package ArrayPractise;

import java.util.Scanner;

public class IntegerPresent {
    public static void main(String[] args) {
        int[] array = {1,8,7,6,5,3};
        int target = 5;
        boolean found = false;

        for(int element : array){
            if(element==target){
                found = true;
            }
        }
        System.out.println("element " + target + ", found " + found);
    }
}
