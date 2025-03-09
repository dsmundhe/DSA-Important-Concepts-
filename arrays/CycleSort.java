package arrays;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr={5,8,4,6,1,2,3,7};
       cySort(arr);
    }
    public static void cySort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct=arr[i]-1;
            if(arr[i] != arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
