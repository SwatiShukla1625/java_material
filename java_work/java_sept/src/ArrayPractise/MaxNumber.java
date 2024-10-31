package ArrayPractise;

public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 8, 9, 7, 15};
        int max = arr[0];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] >max){
                max = arr[i];

            }
        }
        System.out.println("the max number in the given array is :" + max);

    }

    public static class SumOf2DArray {
    }
}