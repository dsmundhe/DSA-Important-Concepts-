package arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90};
        int target=90;
        System.out.println("The index of Target Element : " + binSearch(arr,target));
    }
    public static int binSearch(int arr[],int target){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==target){
                return m;
            }else if(arr[m]>target){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return -1;
    }
}
