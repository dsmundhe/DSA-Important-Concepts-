package Queue;

import java.util.Stack;

public class QueueUsingStacks {
    protected int[] data;
    protected int DEFAULT_SIZE=10;

   private Stack<Integer> first=new Stack<>();
   private    Stack<Integer> second=new Stack<>();

    QueueUsingStacks(){
        int[] temp=new int[DEFAULT_SIZE];
        this.data=temp;
    }
    QueueUsingStacks(int size){
        int[] temp=new int[size];
        this.data=temp;
    }

    public void add(int item){
        first.push(item);
    }

    public void remove(){

        while (!first.isEmpty()){
            second.push(first.pop());
        }
        second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        System.out.println(first);
    }

    //get peek element
    public int peek(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int val=second.peek();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return val;

    }

    public void display(){
        System.out.println(first);
    }


}
