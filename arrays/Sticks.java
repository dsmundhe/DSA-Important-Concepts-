package arrays;
import java.util.ArrayList;
import java.util.List;

public class Sticks {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0,5);
        list.add(0,4);
        list.add(0,4);
        list.add(0,2);
        list.add(0,2);
        list.add(0,8);

        System.out.println(list);

        System.out.println(cutTheSticks(list));
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {
        // Write your code here
        List<Integer>ls=new ArrayList<>();
            int min=minNum(arr);
        for (int j = 0; j < arr.size(); j++) {
            int count=nonZeros(arr);
            if(count==0){
                return ls;
            }
          if(!ls.contains(count)){
              ls.add(count);
          }
            for(int i=0;i<arr.size();i++){
                if(arr.get(i)>=min){
                    int rem=arr.get(i)-min;
                    arr.remove(i);
                    arr.add(i,rem);
                }
            }

        }

        return ls;

    }

    //count no of non zeros
    public static int nonZeros(List<Integer> arr){
        int count=0;
        for(Integer val :arr){
            if(val>=1){
                count++;
            }
        }
        return count;
    }

    //find min num
    public static int minNum(List<Integer> arr){
        int min=arr.get(0);
        for(int i=0;i<arr.size();i++){
            if( arr.get(i) !=0 && arr.get(i)<min){
                min=arr.get(i);
            }
        }
        return min;
    }

}
