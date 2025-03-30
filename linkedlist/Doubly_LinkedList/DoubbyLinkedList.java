package linkedlist.Doubly_LinkedList;

public class DoubbyLinkedList {
    private Node head;


    //insert first
    public void insertFirst(int val){
        Node node=new Node(val);
        node.preve=null;
        if(head==null){
            head=node;
            return;
        }
        head.preve=node;
        node.next=head;
        head=node;
    }

    //insert at last
    public void insertLast(int val){
        if(head==null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        Node temp=head;
        while (temp.next !=null){
            temp=temp.next;
        }
        temp.next=node;
        node.preve=temp;
        node.next=null;
    }

    //insert by index
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        Node temp=getNode(index-1);
        if(temp.next==null){
            insertLast(val);
            return;
        }
        Node node=new Node(val);
        node.next=temp.next;
        node.preve=temp;
        temp.next.preve=node;
        temp.next=node;
    }

    //delete first
    public void deleteFirst(){
        if(head==null){
            return;
        }
        head=head.next;
        head.preve=null;
    }

    //delete last
    public void deleteLast(){
        if(head==null){
            return;
        }
        if(head.next ==null){
            deleteFirst();
            return;
        }
        Node temp=head;
        while (temp.next !=null){
            temp=temp.next;
        }
        Node node=temp.preve;
        node.next=null;
        temp.preve=null;

    }

    //delete by index
    public void delete(int index){
        if(head==null){
            return;
        }
        if(index==0){
            deleteFirst();
            return;
        }
        Node temp=getNode(index);
        if(temp.next==null){
            deleteLast();
            return;
        }
        Node p=temp.preve;
        Node n=temp.next;
        p.next=n;
        n.preve=p;

    }

    //display reverse
    public void displayRev(){
        Node temp=head;
        while (temp.next !=null){
            temp=temp.next;
        }
        while (temp !=null){
            System.out.print(temp.val + " -> ");
            temp=temp.preve;
        }
        System.out.println("End!");
    }

    //getNode by index
    public Node getNode(int index){
        Node temp=head;
        while (index!=0){
            temp=temp.next;
            index--;
        }
        return temp;
    }

    //display list
    public void display(){
        Node temp=head;
        while (temp !=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("End!");
    }

    //find Node
    public void findNode(int val){
        Node temp=head;
        while (temp !=null){
            if(temp.val==val){
                System.out.println(val + " Present!");
                return;
            }
            temp=temp.next;
        }
        System.out.println(val + " Not Present!");
    }

    class Node{
        private int val;
        Node next;
        Node preve;

        Node(int val){
            this.val=val;
        }

        Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }
}
