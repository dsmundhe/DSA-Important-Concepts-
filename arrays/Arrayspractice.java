package arrays;

import java.util.Arrays;

public class Arrayspractice {
    private static int[] arr;

    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        System.out.println("Orignal Array : "+Arrays.toString(arr));
        System.out.println("Reverse of Array : "+ Arrays.toString(revArr(arr)));
    }


    public static int[] revArr(int[] arr){
        
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
        return arr;
    }
}
