package Practice;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int size;
    CustomLinkedList(){
        this.size=0;
    }

    //Insert at first
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    //Display LinkedList
    public void display(){
        Node temp=head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.print(" END!");
    }

    //insert at last
    public void insertLast(int val){
        Node node=new Node(val);
        if(tail==null){
            insertFirst(val);
            return;
        }
        tail.next=node;
        tail=node;
        size++;
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
