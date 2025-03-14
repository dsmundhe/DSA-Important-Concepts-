package Recursion;

public class MazeProblem {
    public static void main(String[] args) {
        mazeFun("",3,3);
    }

    public static void mazeFun(String p,int row,int col){
        if(row==0 && col==0){
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
