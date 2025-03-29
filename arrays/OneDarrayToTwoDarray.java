package arrays;

import java.util.Arrays;

public class OneDarrayToTwoDarray {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,3,3,3};
        int m=3;
        int n=3;
        int count=0;
        int[][] twoDarr=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                twoDarr[i][j]=arr[count];
                count++;
            }
        }
        for(int i=0;i<m;i++){
            System.out.println(Arrays.toString(twoDarr[i]));
        }
    }
}
