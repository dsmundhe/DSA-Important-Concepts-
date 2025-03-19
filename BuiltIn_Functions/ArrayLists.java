package BuiltIn_Functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);

        list.add(60);
        list.add(60);
        list.add(40);
        list.add(40);
        list.add(20);
        list.add(20);
        list.add(20);

        int index=list.indexOf(20);
        System.out.println("index : "+index);
        list.add(2,500);


        System.out.println("Before Sort : "+list);
        Collections.sort(list);
        System.out.println("After Sort : "+list);

        System.out.println(count(list,list.size()-1));
    }

    public static int count(List<Integer> ar, int n){
        Collections.sort(ar);
         int counter=0;
         for(int i=0;i<n;i++){
             if(ar.get(i).equals(ar.get(i+1))){
                 counter++;
                 i++;
             }
         }
         return counter;
    }
    }

