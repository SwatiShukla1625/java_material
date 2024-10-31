package ArrayPractise;

public class MinNumber {
    public static void main(String[] args) {
        int [] arr = {4,8,6,1,5};
        int min = arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("the min number in the array is " + min) ;
    }
}
