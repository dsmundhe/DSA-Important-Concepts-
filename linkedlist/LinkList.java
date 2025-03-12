package linkedlist;

public class LinkList {
    private Node tail;
    private Node head;
    private int size;
    public LinkList(){
        this.size=0;
    }

    public class Node{
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

    //insert first
    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    //display linklist
    public void display(){
        Node temp=head;
        while (temp !=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.print(" End!");
    }

    //insert at last
    public void insertLast(int value){
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    //insert at index
    public void insert(int index,int value){
        if(index==0){
            insertFirst(value);
        }
        if(index==size-1){
            insertLast(value);
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
    }

    //get index Node
    public Node get(int index){
        Node node=head;
        for (int i = 0; i <index; i++) {
            node=node.next;
        }
        return node;
    }

    //delete first
    public int deleteFirst(){
         int val=head.value;
         head=head.next;
         if(head==null){
             tail=head;
         }
         size--;
         return val;
    }

    public int deleteLast(){
        if(size<=1)return deleteFirst();
        Node secondLast=get(size-2);
         int value=secondLast.value;
         tail=secondLast;
         tail.next=null;
         return value;
    }

    public int delete(int index){
        if(index==0)return deleteFirst();
        if(index==size-1)return deleteLast();

        Node preve=get(index-1);
        int val=preve.value;
        preve.next=preve.next.next;
        size--;
        return val;

    }
}
