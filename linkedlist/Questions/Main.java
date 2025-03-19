package linkedlist.Questions;

import linkedlist.Singly_LinkedList.SLL;

public class Main {
    public static void main(String[] args) {


        //remove duplicates'
        SLL list=new SLL();

        list.insertLast(10);
        list.insertLast(10);
        list.insertLast(10);
        list.insertLast(10);
        list.insertLast(10);
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(20);
        list.insertLast(20);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(40);
        list.insertLast(40);
        list.insertLast(40);


//        list.display();
//        list.duplicates();
//        list.display();
//


        //merger two sorted lists

        SLL list1=new SLL();
        list1.insertLast(10);
        list1.insertLast(10);
        list1.insertLast(20);
        list1.insertLast(30);

        SLL list2 =new SLL();
        list2.insertLast(20);
        list2.insertLast(20);
        list2.insertLast(30);
        list2.insertLast(40);

        //Display lists
        list1.display();
        list2.display();

        //Merge lists
        SLL.mergeLists(list1,list2);


    }
}
