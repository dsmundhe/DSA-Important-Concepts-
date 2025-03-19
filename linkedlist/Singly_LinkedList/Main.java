package linkedlist.Singly_LinkedList;

public class Main {
    public static void main(String[] args) {
        SLL list=new SLL();

        //insert at first intdex
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        //display list
        list.display();

        //insert at last index
        list.insertLast(100);
        list.display();


        //insert at index
        list.insert(1,50);
        list.display();

        // delete first
        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        //delete by index
        list.delete(2);
        list.display();

        //find node
        System.out.println("Node Val : "+list.findNode(30));



        list.insertRec(55,1);
        list.display();

    }
}
