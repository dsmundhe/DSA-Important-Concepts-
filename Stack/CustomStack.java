package Stack;

import java.util.Arrays;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE =10;
    private int ptr=-1;

    CustomStack(){
        int[] temp=new int[DEFAULT_SIZE];
        this.data=temp;
    }
    CustomStack(int size){
        int[] temp=new int[size];
        this.data=temp;
    }

    //push item
    public boolean push(int item){

//        if(isFull()){
//            System.out.println("Stack is Full!");
//            return false;
//        }

        //lets make it dynamic
        if(isFull()){
            int[] temp=new int[data.length *2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    //peek item
    public int peek() throws CustomException{
        if(isEmpty()){
             throw new CustomException("Stack is Empty!");
        }
        return data[ptr];
    }

    //pop item
    public void pop() throws CustomException {
        if(isEmpty()){
             throw new CustomException("Stack is Empty!");
        }
        ptr--;
    }

    //display stack
    public void display() throws CustomException{
        if(isEmpty()){
            throw new CustomException("Stack is Empty!");
        }
        int[] temp=new int[ptr+1];
        for(int i=0;i<=ptr;i++){
            temp[i]=data[i];
        }
        System.out.println(Arrays.toString(temp));
    }

    public boolean isEmpty(){
        return ptr==-1;
    }
    public boolean isFull(){
        return ptr==data.length-1;
    }
}
