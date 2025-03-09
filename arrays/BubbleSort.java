package arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,4,2,6,3,5,7,8,9};
        System.out.println("Before Sort : " + Arrays.toString(arr));
        System.out.print("After Sort : ");
        bubbleSortFun(arr);
    }
    public static void bubbleSortFun(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j] < arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
