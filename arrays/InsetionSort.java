package arrays;

import java.util.Arrays;

public class InsetionSort {
    public static void main(String[] args) {
        int[] arr={5,4,7,6,8,9,1,2,3};
        insertionSortFun(arr);
    }
    public static void insertionSortFun(int[] arr){
        for (int i = 0; i <arr.length -1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j-1]>=arr[j]){
                    int tmep=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=tmep;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
