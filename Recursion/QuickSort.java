package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={7,8,5,9,4,6,3,2,1,0};
        System.out.println("Before Sort : "+Arrays.toString(arr));
        quickSortFun(arr,0,arr.length-1);
        System.out.println("After Sort : "+Arrays.toString(arr));
    }

    public static void quickSortFun(int[] arr,int low,int high) {
       if(low>=high)return;

       int start=low;
       int end=high;
       int pivot=start+(end-start)/2;
       while (start<=end){
           while (arr[start] < arr[pivot]){
               start++;
           }
           while (arr[end] > arr[pivot]){
               end--;
           }
           if(start<=end){
               int temp=arr[start];
               arr[start]=arr[end];
               arr[end]=temp;
               start++;
               end--;
           }
       }
       quickSortFun(arr,low ,end);
       quickSortFun(arr,start,high);
    }
}
