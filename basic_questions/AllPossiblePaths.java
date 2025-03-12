package basic_questions;

public class AllPossiblePaths {
    public static void main(String[] args) {
        int[][] grid={
                {0 ,2 ,3},
                {1 ,3 ,2},
                {1 ,1, 0}
        };
        System.out.println(moneyFun(grid,0,0,0));
    }

    public static int moneyFun(int[][] arr,int i,int j,int sum){
       sum+=arr[i][j];
        if(i==arr.length-1 && j== arr[0].length-1){
            return sum;
        }

        if(i+1<arr.length){
            moneyFun(arr,i+1,j,sum);
        }
        if(j+1<arr.length){
            moneyFun(arr,i,j+1,sum);
        }
        return sum;
    }
}
