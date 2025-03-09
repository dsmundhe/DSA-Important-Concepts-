package arrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,4,8,7,9,3,6,2,5};
       selSort(arr);
    }
    public static void selSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int maxIndex=0;
            for (int j = 0; j <arr.length-i ; j++) {
                if(arr[j]>arr[maxIndex]){
                    maxIndex=j;
                }
            }
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
