package Stack.Questions;

import java.util.Arrays;
import java.util.Stack;

public class GameOfTwoStacks {
    public static void main(String[] args) {
        Stack<Integer> stackA=new Stack<>();
        Stack<Integer>stackB=new Stack<>();
        stackA.push(1);
        stackA.push(6);
        stackA.push(4);
        stackA.push(2);
        stackA.push(4);
        System.out.println(stackA);
        stackB.push(5);
        stackB.push(8);
        stackB.push(1);
        stackB.push(2);
        System.out.println(stackB);
        int maxSum=10;
        System.out.println(countFun(stackA,stackB,maxSum));

        int[] arrA={4,2,4,6,1};
        int[] arrB={2,1,8,5};
        System.out.println("Count : "+gameOfTwo(arrA,arrB,maxSum));

    }
    //Optimized and Solve Edges cases
   //using arrays
public static int gameOfTwo(int[] arrA,int[] arrB,int max){
        return gameTwo(arrA,arrB,max,0,0)-1;
}

public static int gameTwo(int[] arrA,int[] arrB,int max,int sum,int count){
        if(sum>max){
            return count;
        }
        if(arrA.length==0|| arrB.length==0){
            return count;
        }
        int num1=gameTwo(Arrays.copyOfRange(arrA,1,arrA.length),arrB,max, sum+arrA[0],count+1);
        int num2=gameTwo(arrA,Arrays.copyOfRange(arrB,1,arrB.length),max,sum+arrB[0],count+1);

        return Math.max(num1,num2);
}

    //not optimized and not solve edge cases
    public static int countFun(Stack<Integer> A,Stack<Integer>B,int maxSum){
        int sum=0;
        int count=0;
        while (!A.isEmpty() && !B.isEmpty()){
            int numA=A.peek();
            int numB=B.peek();
            if(numA<numB){
                if((sum+numA)<=maxSum){
                    sum+=numA;
                    A.pop();
                    count++;
                }else{
                    return count;
                }
            }else{
                if((sum+numB)<=maxSum){
                    sum+=numB;
                    B.pop();
                    count++;
                }else{
                    return count;
                }
            }
        }

        while (!A.isEmpty()){
            int numA=A.peek();
            if((sum+=numA)<=maxSum){
                sum+=numA;
                A.pop();
                count++;
            }else{
                return count;
            }
        }

        while (!B.isEmpty()){
            int numB=B.peek();
            if((sum+numB)<=maxSum){
                sum+=numB;
                B.pop();
                count++;
            }else {
                return count;
            }
        }

        return count;
    }
}
