package Stack.Questions;

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



    }
    //Optimized and Solve Edges cases
   //using arrays

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
