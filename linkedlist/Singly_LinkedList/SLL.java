package linkedlist.Singly_LinkedList;


//SSL -> Singly Linked-List

public class SLL {
    public Node head;
    public Node tail;
    private int size;

    public SLL(){
        this.size=0;
    }

    //Insert at first index
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    //display List
    public void display(){
        Node temp=head;
        while (temp !=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println(" END!");
    }


    //Insert at last index
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

    //insert by index
    public void insert(int index,int val){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp=getNode(index-1);
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    //delete first
    public void deleteFirst(){
        head=head.next;

        if(head==null){
            tail=head;
        }
        size--;

    }

    //delete last
    public void deleteLast(){
        if(size<=1){
            deleteFirst();
            return;
        }
        Node secondLastNode=getNode(size-2);
        tail=secondLastNode;
        tail.next=null;
        size--;
    }

    //delete by index

    public void delete(int index){
        if(index <0 || index >=size){
            throw new IndexOutOfBoundsException("Index our of bound!");
        }
        if(index==0){
            deleteFirst();
        }
        if(index==size-1){
            deleteLast();
        }

        Node prevNode=getNode(index-1);
        if(prevNode==null || prevNode.next==null){
            return;
        }
        prevNode.next=prevNode.next.next;
        size--;

    }

    //find Node
    public int findNode(int val){
        Node node=head;
        while (node !=null){
            if(node.value==val){
                return val;
            }
            node=node.next;
        }
        return -1;
    }

    //get node
    public Node getNode(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
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
