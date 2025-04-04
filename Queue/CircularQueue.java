package Queue;

import java.util.Arrays;

public class CircularQueue {
    protected int[] data;
    protected int f=0;
    protected int e=0;
    protected int size=0;
    private static final int DEFAULT_SIZE=5;

    CircularQueue(){
        int[] temp=new int[DEFAULT_SIZE];
        this.data=temp;
    }
    CircularQueue(int size){
        int[] temp=new int[size];
        this.data=temp;
    }

    public void add(int item){

        data[e]=item;
         e=(e+1) %data.length;
         size++;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return -1;
        }
        int removed=data[f++];
        f=f%data.length;
        size--;
        return removed;
    }

    //get front
    public int getFront(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return -1;
        }
        return data[f];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
            return;
        }
//        int i=f;
//        do{
//            System.out.print(data[i] + " <- ");
//            i=(i+1) %data.length;
//        } while(i != e );

        int i=f;
        for(int count=0;count<size;count++){
            System.out.print(data[i] + " <- ");
             i = (i+1) % data.length;
        }
        System.out.println("End!");
    }

    public boolean isFull(){
        return size==data.length;
    }

    public boolean isEmpty(){
        return size==0;
    }

}
