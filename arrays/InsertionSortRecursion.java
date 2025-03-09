package arrays;

import java.util.Arrays;

public class InsertionSortRecursion {
    public static void main(String[] args) {
        int[] arr={8,7,9,4,6,5,3,2,1};
        System.out.println(Arrays.toString(inSortFun(arr,0)));
    }

    public static int[] inSortFun(int[] arr,int counter){
        if(counter==arr.length-1){
            return arr;
        }
//        for (int i = counter+1; i >0 ; i--) {
//            if(arr[i]<arr[i-1]){
//                int temp=arr[i];
//                arr[i]=arr[i-1];
//                arr[i-1]=temp;
//            }
//        }

        arr=innerSort(arr,counter+1);
        return inSortFun(arr,counter+1);
    }
    public static int[] innerSort(int[] arr,int count){
     if(count ==0){
         return arr;
     }
        if(arr[count]<=arr[count-1]){
            int temp=arr[count];
            arr[count]=arr[count-1];
            arr[count-1]=temp;
        }
        return innerSort(arr,count-1);

    }
}
