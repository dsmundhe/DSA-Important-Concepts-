package arrays.two_d;

import java.util.Arrays;

public class RowAndColumnSum {
    public static void main(String[] args) {
        int[][] arr={
                {0,2,1},
                {1,1,1},
                {2,0,0}
        };

//         int[] rowSum=new int[arr.length];
//         int[] colSum=new int[arr[0].length];
//
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 rowSum[i]+= arr[i][j];
//                 colSum[j]+=arr[i][j];
//             }
//         }
//        System.out.println("Row Sum : "+Arrays.toString(rowSum));
//        System.out.println("Column Sum : "+Arrays.toString(colSum));


        charsGrid("chillout");
    }
    public static void charsGrid(String s){
        int row=(int) Math.sqrt(s.length());
        int col=0;
        if(row * (row+1)<s.length()){
            row++;
            col=row;
        }else{
            col=row+1;
        }

        char[][] chars=new char[row][col];
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                  if(count<s.length()){
                      chars[i][j]=s.charAt(count);
                      count++;
                  }else {
                      break;
                  }
            }
        }


        for(char[] arr:chars){
            System.out.println(Arrays.toString(arr));
        }

        String ansStr="";
        for(int i=0;i<col;i++){
            String ans="";
            for(int j=0;j<row;j++){

                    ans+=chars[j][i];

            }
            ansStr+=ans.trim();
            ansStr+=" ";
        }

        System.out.println(ansStr);
    }



}
