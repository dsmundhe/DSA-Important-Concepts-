package linkedlist.Doubly_LinkedList;

public class Main {
    public static void main(String[] args) {
//        DLL dlist=new DLL();
//        dlist.insertFirst(10);
//        dlist.insertFirst(20);
//        dlist.insertFirst(30);
//        dlist.insertFirst(40);
//        dlist.insertFirst(50);
//
//        //insert at last
//        dlist.insertLast(60);
//        dlist.insertLast(28);
//
//        //insert at index
//        dlist.insert(2,55);
//        dlist.insert(2,100);
//
//        dlist.display();
//
//        //delete first
//        dlist.deleteFirst();
//        dlist.deleteFirst();
//        dlist.display();
//
//        //delete last
//        dlist.deleteLast();
//        dlist.display();
//
//        //delete by index
//        dlist.delete(3);
//        dlist.delete(3);
//        dlist.display();


        //doubly linked list practice
        DoubbyLinkedList dbList=new DoubbyLinkedList();

        //insert at first
        dbList.insertFirst(10);
        dbList.insertFirst(20);
        dbList.insertFirst(30);
        dbList.insertFirst(40);
        dbList.insertFirst(50);
        dbList.insertFirst(60);
        dbList.insertFirst(500);
        dbList.display();

        //insert at last
        dbList.insertLast(28);
        dbList.insertLast(55);

        dbList.display();

        //insert by index
        dbList.insert(66,2);
        dbList.insert(86,3);
        dbList.insert(77,4);
        dbList.display();

        //Delete first
        dbList.deleteFirst();
        dbList.deleteFirst();
        dbList.deleteFirst();
        dbList.display();

        //delete last
        dbList.deleteLast();
        dbList.deleteLast();
        dbList.deleteLast();
        dbList.display();

        //delete by index
        dbList.delete(4);
        dbList.display();

        //dbList print in reverse order
        dbList.displayRev();

        //find Node
        dbList.findNode(50);

    }
}
