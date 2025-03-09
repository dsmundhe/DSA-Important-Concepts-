package bitwiseOpp;

public class UniqueNum {
    public static void main(String[] args) {
        int[] arr={5,4,2,1,1,2,5,4,6};
        int[] arr1={5,5,5,5,1,1,1,1,10};

        //

        int unique=0;
        for(int val : arr1){
            unique ^= val;
        }
        System.out.println(unique);
    }
}
