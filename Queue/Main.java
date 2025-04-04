package Queue;

public class Main {
    public static void main(String[] args) {
        CustomQueue queue=new CustomQueue();

//        //insert item
//        queue.insert(10);
//        queue.insert(20);
//        queue.insert(30);
//        queue.insert(40);
//
//        queue.display();
//
//        //remove item
//        queue.remove();
//        queue.remove();
//        queue.display();

        //circular Queue
//        CircularQueue cQueue=new CircularQueue();
//        cQueue.add(10);
//        cQueue.add(20);
//        cQueue.add(30);
//        cQueue.add(40);
//        cQueue.add(40);
//        cQueue.add(60);
//        cQueue.display();
//
//        //remove
//        System.out.println(cQueue.remove());
//        System.out.println(cQueue.remove());
//
//        cQueue.display();

        //Queue using stacks

        //in this remove in o(n) and and o(1)
//        QueueUsingStacks queStks=new QueueUsingStacks();
//        queStks.add(10);
//        queStks.add(50);
//        queStks.add(88);
//        queStks.add(66);
//        queStks.display();
//        queStks.remove();
//        queStks.add(55);
//        queStks.display();
//        System.out.println(queStks.peek());
//        queStks.remove();

        QueueUsingStacksAddFirst addQueue=new QueueUsingStacksAddFirst();
       addQueue.display();
        addQueue.add(10);
        addQueue.add(20);
        addQueue.add(30);
        addQueue.add(40);
       addQueue.display();

       addQueue.remove();
       addQueue.display();

    }
}
