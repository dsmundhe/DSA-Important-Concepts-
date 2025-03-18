package linkedlist.Doubly_LinkedList;

public class Main {
    public static void main(String[] args) {
        DLL dlist=new DLL();
        dlist.insertFirst(10);
        dlist.insertFirst(20);
        dlist.insertFirst(30);
        dlist.insertFirst(40);
        dlist.insertFirst(50);

        //insert at last
        dlist.insertLast(60);
        dlist.insertLast(28);

        //insert at index
        dlist.insert(2,55);
        dlist.insert(2,100);

        dlist.display();

        //delete first
        dlist.deleteFirst();
        dlist.deleteFirst();
        dlist.display();

        //delete last
        dlist.deleteLast();
        dlist.display();

        //delete by index
        dlist.delete(3);
        dlist.delete(3);
        dlist.display();


    }
}
