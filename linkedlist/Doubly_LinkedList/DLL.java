package linkedlist.Doubly_LinkedList;

public class DLL {

    private Node head;

    //inset at first
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head==null){
            head=node;
            node.prev=null;
        }
        head.prev=node;
        head=node;

    }

    //insert at last
    public void insertLast(int val){
        Node temp=head;
        while (temp.next !=null){
            temp=temp.next;
        }
        Node node =new Node(val);
        if(head==null){
           insertFirst(val);
           return;

        }
         node.prev=temp;
        temp.next=node;
        node.next=null;

    }

    //insert at random by index
    public void insert(int index ,int val){
        Node temp=getNode(index-1);
        if(index==0){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        node.prev=temp;
        node.next=temp.next;
        temp.next.prev=node;
        temp.next=node;
    }


    //delete first
    public void deleteFirst(){
        if(head==null){
            return;
        }
        head=head.next;
        head.prev=null;

    }

    //delete last
    public void deleteLast(){
        if(head==null){
            return;
        }
        Node temp=head;
        while (temp.next != null){
            temp=temp.next;
        }

        temp.prev.next=null;
        temp.next=null;

    }

    //delete by index
    public void delete(int index){
        Node temp=getNode(index-1);

        if (temp == null || temp.next == null) {
            // Invalid index, do nothing or throw an exception
            return;
        }
        if(temp.next.next==null){
            deleteLast();
            return;
        }

        temp.next=temp.next.next;
        if(temp.next !=null){
            temp.next.prev=temp;
        }
    }

    //get Node
    public Node getNode(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    //display list
    public void display(){
        Node temp=head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("End!");
    }


    private class Node{
        private int val;
        private Node prev;
        private Node next;

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
}
