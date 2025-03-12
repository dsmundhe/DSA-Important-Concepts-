package linkedlist;

public class Main {
    public static void main(String[] args) {
        LL list=new LL();

        //insert at first
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);

        //insert at last
        list.insertLast(100);

        //insert at index
        list.insert(28,1);
        list.display();

        //delete first
        System.out.println();
        list.deleteFirst();
        list.display();

        //delete Last
        System.out.println();
        list.deleteLast();
        list.display();

        //delete by index
        System.out.println();
        list.delete(2);
        list.delete(2);
        list.display();

        //Find node
        System.out.println();
        System.out.println(list.find(10));;

    }
}
