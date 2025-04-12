package Games;

import java.util.*;

public class TickTocToi {
    public static void main(String[] args) {

       int[] arrX=new int[3];
       int[] arrO=new int[3];
       int n=3;
        Scanner sc=new Scanner(System.in);
        int[][] possibleAns={
                {0,1,2},
                {3,4,5},
                {6,7,8},
                {0,3,6},
                {1,4,7},
                {2,5,8},
                {0,4,8},
                {2,4,6}
        };
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(getNum(i,n,j) + " ");
            }
            System.out.println();
        }
        int xCount=0;
        int oCount=0;

        while (xCount<3 ||oCount<3){
//            System.out.print("Enter I : ");
//            int i=sc.nextInt();
//            System.out.print("Enter J : ");
//            int j=sc.nextInt();
            System.out.print("Enter Position : ");
            int num=sc.nextInt();
            System.out.print("Enter Char : (X , O) :- ");
            String ch=sc.next();


            if(ch.charAt(0)=='X'){
                arrX[xCount]=num;
                xCount++;
            }else{
                arrO[oCount]=num;
                oCount++;
            }
            if(isWin(arrX,possibleAns)){
                System.out.println("X win!");
                return;
            }else if(isWin(arrO,possibleAns)){
                System.out.println("O win!");
                return;
            }else if(oCount==3 ||xCount==3){
                System.out.println("Math Draw !");
                return;
            }


        }


    }

    public static int getNum(int i,int n,int j){
        return (n*i)+j;
    }

    public static boolean isWin(int[] ans,int[][] result){
        for(int[] arr:result){
            if(Arrays.equals(ans,arr)){
                return true;
            }
        }
        return false;
    }
}
