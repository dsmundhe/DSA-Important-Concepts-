package basic_questions;

public class CoupponByeOrNot {

    public static void main(String[] args) {
        int[] basics={3,30,5};
        int[] items={50,60,50};
        System.out.println(coupponSum(items,basics[2]));
        System.out.println(totalSum(items));
        if(totalSum(items) > (coupponSum(items,basics[2])+basics[1])){
            System.out.println("Couppon");
        }
        if(totalSum(items) <= (coupponSum(items,basics[2])+basics[1])){
            System.out.println("No Cuppon");
        }


    }
    public static int coupponSum(int[] arr,int y){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>y){
                sum+=arr[i]-y;
            }
        }
        return sum;
    }

    public static int totalSum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
