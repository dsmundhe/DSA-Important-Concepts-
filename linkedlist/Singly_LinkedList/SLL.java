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

    //insert using recursion
    public void insertRec(int val,int index){
        head=insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node){
        if(index==0){
            Node temp=new Node(val,node);
            size++;
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
        return node;
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



    //Questions

    //remove duplicates

    //Q-1  remove duplicates
    public void duplicates(){
        Node temp=head;

        while (temp.next !=null){
            if(temp.next != null && temp.value ==temp.next.value){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
    }


    //Q-2 Merge Two sorted Lists
    public static SLL mergeLists(SLL list1,SLL list2){
        Node head1=list1.head;
        Node head2=list2.head;
        SLL list=new SLL();
         while (head1 !=null && head2 !=null){
             if(head1.value < head2.value){
                 list.insertLast(head1.value);
                 head1=head1.next;
             }else {
                 list.insertLast(head2.value);
                 head2=head2.next;
             }
         }
         while (head1 != null){
             list.insertLast(head1.value);
             head1=head1.next;
         }
         while (head2 != null){
             list.insertLast(head2.value);
             head2=head2.next;
         }
        return list;
    }


    //find middle of linkedList
    public static int findMid(SLL list){
        Node slow=list.head;
        Node fast=list.head;
        while (fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.value;
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
