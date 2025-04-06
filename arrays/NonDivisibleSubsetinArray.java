package arrays;

import java.util.ArrayList;

public class NonDivisibleSubsetinArray {
    public static void main(String[] args) {
        int[] arr={19,10,12,10,24,25,22};
        int k=3;
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                ArrayList<Integer> ls=new ArrayList<>();
                int num=sum(arr[i],arr[j]);
                if(num %k!=0){
                    ls.add(arr[i]);
                    ls.add(arr[j]);
                    list.add(ls);
                }
            }
        }
        System.out.println(list);
    }

    public static int sum(int a,int b){
        return a+b;
    }
}
