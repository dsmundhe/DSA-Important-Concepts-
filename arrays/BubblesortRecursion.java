package arrays;

import java.util.Arrays;

public class BubblesortRecursion {
    public static void main(String[] args) {
        int[] arr={5,7,8,4,9,6,3,1,2};
        System.out.println(Arrays.toString(bubbleSort(arr,0)));

    }
    public static int[] bubbleSort(int[] arr,int counter){
        if(counter ==arr.length){
            return arr;
        }
        arr=innerSort(arr,1,counter);
        return bubbleSort(arr,counter+1);
    }

    public static int[] innerSort(int[] arr,int i,int count){
        if(arr.length-count==i){
            return arr;
        }
        if(arr[i] <=arr[i-1]){
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }
        return innerSort(arr,i+1,count);
    }
}
