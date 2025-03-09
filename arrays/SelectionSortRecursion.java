package arrays;

import java.util.Arrays;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        int[] arr={8,7,9,4,5,6,3,2,1};
        System.out.println(Arrays.toString(selSort(arr,0)));
    }
    public static int[] selSort(int[] arr,int couter){
        if(couter==arr.length){
            return arr;
        }
        int maxIndex=0;
        for (int i = 0; i < arr.length-couter; i++) {
           if(arr[i] > arr[maxIndex]){
               maxIndex=i;
           }
        }
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[arr.length-1-couter];
        arr[arr.length-1-couter]=temp;
        return selSort(arr,couter+1);
    }
}
