package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeProblem {
    public static void main(String[] args) {
//        mazeFun("",3,3);

        //List of paths
        System.out.println("Paths : "+mazeFunList("",3,3));

        System.out.println("Total Possible paths : "+ count(3,3));
    }


    //count paths
    public static int count(int row,int col){

        //after every row or col becomes one that mean pointer at last line that's we used OR operator
        if(row==1 || col==1){
            return 1;
        }
        int left=count(row-1,col);
        int right=count(row,col-1);
        return left+right;
    }

    public static ArrayList<String> mazeFunList(String p, int row,int col){
        if(row==1 && col==1){
            ArrayList<String>ls=new ArrayList<>();
            ls.add(p);
            return ls;
        }
        ArrayList<String> list=new ArrayList<>();
        if(row>0){
            list.addAll(mazeFunList(p+'D',row-1,col));
        }
        if(col>0){
            list.addAll(mazeFunList(p+'R',row,col-1));
        }
        return list;
    }

    public static void mazeFun(String p,int row,int col){
        if(row==1 && col==1){
            if(p.length()==4){
                System.out.println(p);
            }
            return;
        }
         if(row==1 && col==1){
             mazeFun(p,row-1,col-1);
         }else{
             if(row>0 ){
                 mazeFun(p+'D',row-1,col);
             }
             if(col>0 ){
                 mazeFun(p+'R',row,col-1);
             }
         }
    }
}
