package numbers;

public class ProductOfTwoNum {
    public static void main(String[] args) {
        int x=10;
        int y=5;
        System.out.println(product(x,y));
    }
    public static int product(int x, int y){
        if(x == 0 || y==0){
            return 0;
        }
        return x*y;
    }
}
