package Practice;

public class LinklistMain {
    public static void main(String[] args) {
        CustomLinkedList list=new CustomLinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);

        //insert at last
        list.insertLast(28);

        list.display();
    }
}
