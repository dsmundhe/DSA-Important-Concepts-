package arrays;

public class IsSortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println("Is this Sorted : "+isSortedFun(arr,1));
    }

    public static boolean isSortedFun(int[] arr,int counter){
        if(counter>=arr.length){
            return true;
        }
        if(arr[counter]<arr[counter-1]){
            return false;
        }
        return isSortedFun(arr,counter+1);
    }
}
