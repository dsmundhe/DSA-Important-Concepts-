package linkedlist.Singly_LinkedList;

public class Main {
    public static void main(String[] args) {
        SLL list=new SLL();

//        //insert at first intdex
//        list.insertFirst(10);
//        list.insertFirst(20);
//        list.insertFirst(30);
//        list.insertFirst(40);
//
//        //display list
//        list.display();
//
//        //insert at last index
//        list.insertLast(100);
//        list.display();
//
//
//        //insert at index
//        list.insert(1,50);
//        list.display();
//
//        // delete first
//        list.deleteFirst();
//        list.display();
//
//        list.deleteLast();
//        list.display();
//
//        //delete by index
//        list.delete(2);
//        list.display();
//
//        //find node
//        System.out.println("Node Val : "+list.findNode(30));
//
//        list.insertRec(55,1);
//        list.display();


        //practice of linkedlist
        SinglyLinkedList sList=new SinglyLinkedList();

        //insert first
        sList.insertFirst(10);
        sList.insertFirst(20);
        sList.insertFirst(30);
        sList.insertFirst(40);
        sList.insertFirst(50);

        //display linked list
        sList.display();

        //insert at last
        sList.insertLast(100);
        sList.insertLast(28);
        sList.display();

        //insert by index
        sList.insert(66,1);
        sList.insert(88,5);
        sList.display();


        //find value
        sList.findNode(66);
        sList.display();


        //delete first
        sList.deleteFirst();
        sList.deleteFirst();
        sList.display();

        //delete last
        sList.display();
        sList.deleteLast();
        sList.deleteLast();
        sList.deleteLast();
        sList.display();

        //delete by index
        sList.delete(2);
        sList.delete(2);
        sList.display();

    }
}
