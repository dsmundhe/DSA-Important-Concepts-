package Stack.Questions;

import java.util.Stack;

public class LargestAreamHistogramOptimized {
    public static void main(String[] args) {
        int[] histogram={2,1,5,6,2,3};
        System.out.println("Largest area : "+largestArea(histogram));
        System.out.println("Largest Area : "+largestAreaFun(histogram));
    }


    //for practice
    public static int largestAreaFun(int[] arr){
        Stack<Integer> stack=new Stack<>();
        int max=0;
        stack.push(0);
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i]<arr[stack.peek()]){
                max=getMax(arr,stack,max,i);
            }
            stack.push(i);
        }
        int i=arr.length;
        while (!stack.isEmpty()){
            max=getMax(arr,stack,max,i);
        }
        return max;
    }

    public static int maxFun(int[] arr,Stack<Integer>stack,int max,int i){
        int area;
        int popped=stack.pop();
        if(stack.isEmpty()){
            area=arr[popped]*i;
        }else {
            area=arr[popped]*(i-1-stack.peek());
        }
        return Math.max(area,max);
    }



    //original fun
    public static int largestArea(int[] arr){
        Stack<Integer> stack=new Stack<>();
        int max=0;
        stack.push(0);
        for (int i = 1; i <arr.length ; i++) {
            while (!stack.isEmpty() && arr[i]<arr[stack.peek()]){
                max=getMax(arr,stack,max,i);
            }
            stack.push(i);
        }
        int i=arr.length;
        while (!stack.isEmpty()){
            max=getMax(arr,stack,max,i);
        }
        return  max;
    }
    public static int getMax(int[] arr,Stack<Integer> stack,int max,int i){

        int area;
        int popped=stack.pop();
        if(stack.isEmpty()){
            area=arr[popped]*i;
        }else {
            area=arr[popped]*(i-1-stack.peek());
        }
return Math.max(area,max);
    }
}
