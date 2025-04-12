package arrays.two_d;

public class NumberPositionInArray {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        int n=3;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print((n*i)+j + " ");
            }
            System.out.println();
        }
    }
}
