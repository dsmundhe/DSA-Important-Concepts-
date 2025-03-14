package basic_questions;

import java.util.ArrayList;
import java.util.List;

public class AllPossiblePaths {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 2, 3},
                {1, 3, 2},
                {1, 1, 0}};
        pathsFun(grid,0,0,0);
        System.out.println("List : "+pathsFunList(grid,0,0,0));
        List<Integer> ls=pathsFunList(grid,0,0,0);
        ArrayList<Integer> newList=new ArrayList<>();
        int count=0;
        int sum=0;
        for (Integer val:ls){
            if(!newList.contains(val)){
                count++;
                sum+=val;
                newList.add(val);
            }
        }
        System.out.println("Sum : "+sum);
        System.out.println("Total distinct paths : "+count);
    }

    public static List<Integer> pathsFunList(int[][] arr,int row,int col,int sum){
        if(row==arr.length-1 && col==arr.length-1){

            List<Integer> ls=new ArrayList<>();
            ls.add(sum+arr[row][col]);
            return ls;
        }
        ArrayList<Integer> list=new ArrayList<>();
        if(row<arr.length-1){
            list.addAll(pathsFunList(arr,row+1,col,sum+arr[row][col]));
        }
        if(col<arr.length-1){
            list.addAll(pathsFunList(arr,row,col+1,sum+arr[row][col]));
        }
        return list;
    }


    public static void pathsFun(int[][] arr,int row,int col,int sum){
        if(row==arr.length-1 && col==arr.length-1){
            System.out.println(sum+arr[row][col]);
            return;
        }

        if(row<arr.length-1){
            pathsFun(arr,row+1,col,sum+arr[row][col]);
        }
        if(col< arr.length-1){
             pathsFun(arr,row,col+1,sum+arr[row][col]);
        }
    }

}

