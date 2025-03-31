package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) throws CustomException{

        //inbuilt collection of Stack
//        Stack<Integer> stack=new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//
//        //print stack
//        System.out.println(stack);
//
//        //get top element
//        System.out.println(stack.peek());
//
//        //remove to element
//        stack.pop();
//        System.out.println(stack);
//
//        //check weather stack is Empty or not
//        System.out.println(stack.isEmpty());
//
//        //initial capacity 10
//        System.out.println(stack.capacity());
//
//        //Find element
//        //it returns index of element
//        System.out.println( stack.search(40));

        //Now custom Stack

        CustomStack cStack=new CustomStack(5);
        cStack.push(10);
        cStack.push(20);
        cStack.push(30);
        cStack.push(40);
        cStack.push(50);
        cStack.push(60);
        cStack.display();

        System.out.println(cStack.peek());

        cStack.pop();
//        cStack.pop();
//        cStack.pop();
//        cStack.pop();
        cStack.display();
        System.out.println(cStack.peek());
    }
}
