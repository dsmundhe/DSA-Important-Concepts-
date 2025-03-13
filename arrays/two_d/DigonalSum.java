package arrays.two_d;

public class DigonalSum {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,6,6},
                {7,8,11}
        };
        System.out.println("Difference : "+digonalSumFun(arr));
    }
    public static int digonalSumFun(int[][] arr){
        int sum1=0;
        int sum2=0;
        for (int i = 0; i <arr.length ; i++) {
             sum1+=arr[i][i];
             sum2+=arr[i][arr.length-i-1];
        }
        return Math.abs(sum1-sum2);
    }
}
