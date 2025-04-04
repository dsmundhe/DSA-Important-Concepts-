package Queue;

import java.util.Stack;

public class QueueUsingStacksAddFirst {
    private Stack<Integer> stackA;
    private Stack<Integer> stackB;

    QueueUsingStacksAddFirst(){
        this.stackA=new Stack<>();
        this.stackB=new Stack<>();
    }

    public void add(int item){
        while (!stackA.isEmpty()){
            stackB.push(stackA.pop());
        }
        stackA.push(item);
        while (!stackB.isEmpty()) {
            stackA.push(stackB.pop());
        }
    }

    public void remove(){
        if(stackA.isEmpty()){
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.println("Poped : "+stackA.pop());
    }
    public boolean isEmpty(){
        return stackA.isEmpty();
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.println(stackA);
    }
}
