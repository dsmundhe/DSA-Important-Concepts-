package linkedlist;

public class Main {
    public static void main(String[] args) {
        LL list =new LL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertLast(100);
        list.insert(28,2);
        list.display();
    }
}
