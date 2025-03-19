package linkedlist.Circular_LinkedList;

public class CLL {

    private Node head;
    private Node tail;
    private int size;

   public CLL(){
        this.size=0;
    }

    //insert at first
    public void insertFirst(int val){
       Node node=new Node(val);
       if(head==null){
           head=node;
           tail=head;
       }
       node.next=head;
       head=node;
       tail.next=head;
       size++;
    }

    public void display(){
       Node temp=head;

       if(temp !=null){
           do{
               System.out.print(temp.val + " -> ");
               temp=temp.next;
           }while (temp !=head);
       }
        System.out.print(" End!");
    }


    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }
}
