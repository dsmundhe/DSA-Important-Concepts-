package linkedlist;

public class ListClass {
    public static void main(String[] args) {
        LinkList list=new LinkList();


        //insert first
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);

        //display(
        list.display();

        //insert at last
        list.insertLast(5);
        System.out.println();
        list.display();

        //insert at index
        list.insert(1,55);
        System.out.println();
        list.display();

        //delete first
        list.deleteFirst();
        System.out.println();
        list.display();

        //delete last
        list.deleteLast();
        System.out.println();
        list.display();

        //delete by index
        list.delete(2);
        System.out.println();
        list.display();

    }
}
