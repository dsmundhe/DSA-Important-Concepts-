package arrays;

//in this problem we have to return count of no of consecutive once
public class ConsiqutiveOnces {
    public static void main(String[] args) {
        int[] arr={0, 1, 1, 1};
        int count=0;
        int mainCount=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==1){
               count++;
           }else{
               if(count>=mainCount){
                   mainCount=count;
               }
               count=0;
           }
       }
        mainCount=Math.max(mainCount,count);
        System.out.println(mainCount);
    }
}
