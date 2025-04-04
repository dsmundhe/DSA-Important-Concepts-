package Queue;

public class CustomQueue {
     protected  int[] data;
     protected static final int DEFAULT_SIZE=10;
     protected int ptr =0;
     CustomQueue(){
         int[] temp=new int[DEFAULT_SIZE];
         this.data=temp;
     }
     CustomQueue(int size){
         int[] temp=new int[size];
         this.data=temp;
     }

     //insert item
    public void insert(int item){
         if(isFull()){
             System.out.println("Queue is Full!");
             return;
         }
         data[ptr++]=item;
    }

    //remove element
    public void remove(){
         if(isEmpty()){
             System.out.println("Queue is Empty!");
             return;
         }
         for(int i=1;i< ptr;i++){
             data[i-1]=data[i];
         }
         ptr--;
    }

    public void display(){
         if(isEmpty()){
             System.out.println("Queue is Empty!");
             return;
         }
       for(int i = 0; i< ptr; i++){
           System.out.print(data[i] + " <- ");
       }
        System.out.println("End!");
    }

     public boolean isFull(){
         return ptr ==data.length-1;
     }
     public boolean isEmpty(){
         return ptr ==0;
     }
}
