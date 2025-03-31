package linkedlist.Singly_LinkedList;

public class SinglyLinkedList {
    Node head;
    Node tail;
    int size;
    SinglyLinkedList(){
        this.size=0;
    }

    //insert at first
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(head.next==null){
            tail=head;
        }
        size++;
    }

    //insert at last
    public void insertLast(int val){
        if(head ==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
      tail=node;
      size++;
    }

    //insert by index
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=getNode(index-1);
        Node node=new Node(val);
        node.next=temp.next;
        temp.next=node;
        size++;
    }

    //find node
    public void findNode(int val){
        Node temp=head;
        while (temp !=null){
            if(temp.val==val){
                System.out.println(val + " Present!");
                return;
            }
            temp=temp.next;
        }
        System.out.println(val + " Not present!");

    }

    //get Index
    public Node getNode(int index){
        Node temp=head;
        while (index !=0){
            temp=temp.next;
            index--;
        }
        return temp;
    }

    //delete first
    public void deleteFirst(){
        if(head ==null){
            return;
        }
        if(head.next==null){
            head=null;
            tail=head;
            return;
        }
        head=head.next;
        size--;
    }

    //delete last
    public void deleteLast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            deleteFirst();
            return;
        }
        Node temp=getNode(size-2);
        tail=temp;
       temp.next=null;
       tail.next=null;
       size--;

    }

    //delete by index
    public void delete(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size){
            deleteLast();
            return;
        }
        Node temp=getNode(index-1);
        temp.next=temp.next.next;
        size--;
    }

    //reverse linked list
 public void reverseList(){
        Node current=head;
        Node preve=null;
        while (current!=null){
            Node next=current.next;
            current.next=preve;
            preve=current;
            current=next;
        }
        head=preve;
 }

 //find mid
    //using two pointers ( slow and fast ) pointer

 public void midNode(){
      if(head ==null){
          System.out.println("null");
          return;
      }
      Node slow=head;
      Node fast=head;
      while (fast !=null && fast.next !=null){
          slow=slow.next;
          fast=fast.next.next;
      }
     System.out.println("Mid value : "+slow.val);
 }

    //display list
    public void display(){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println(" End!");
    }

    public class Node{
        private Node next;
        private int val;

        public Node(int val){
            this.val=val;
        }

        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }

    }
}
