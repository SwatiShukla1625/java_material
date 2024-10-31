package ArrayPractise;

public class SumOf2DArray {

        public static int sumOf2DArray(int[][] array) {
            int totalSum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    totalSum += array[i][j];
                }
            }
            return totalSum;
        }

        public static void main(String[] args) {
            int[][] exampleArray = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int result = sumOf2DArray(exampleArray);
            System.out.println("Sum of all elements: " + result);
        }
    }


