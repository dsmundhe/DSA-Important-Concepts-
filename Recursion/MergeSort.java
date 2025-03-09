package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={8,7,9,6,5,4,2,3,1,0};
        System.out.println("Before Sort : "+Arrays.toString(arr));
        System.out.println("After Sort : "+Arrays.toString(mergeSortFun(arr)));

    }

    public static int[] mergeSortFun(int[] arr){
        if(arr.length==1)return arr;

        int mid=arr.length/2;
        int left[]=mergeSortFun(Arrays.copyOfRange(arr,0,mid));
        int right[]=mergeSortFun(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    public static int[] merge(int[] left,int[] right){
        int i=0;
        int j=0;
        int k=0;
        int[] mixArr=new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mixArr[k]=left[i];
                i++;
            }else{
                mixArr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            mixArr[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            mixArr[k]=right[j];
            j++;
            k++;
        }
        return mixArr;
    }
}
