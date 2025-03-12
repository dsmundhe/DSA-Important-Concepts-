package linkedlist;

public class LL {
    private Node head;
    private Node tail;
    private int size;
   public LL(){
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

    //Insert Value at first
    public void insertFirst(int val){
       Node node=new Node(val);
       node.next=head;
       head=node;
       if(tail==null){
           tail=head;
       }
       size+=1;
    }

    //Display linklist
    public void display(){
       Node temp=head;
       while (temp !=null){
           System.out.print(temp.value + " -> ");
           temp=temp.next;
       }
        System.out.print(" END!");

    }

    //Insert At Last
    public void insertLast(int val){
       Node node=new Node(val);
       tail.next=node;
       tail=node;
       size++;
    }


    //Insert At index
    public void insert(int val,int index){
       if(index==0){
           insertFirst(val);
       }
       if(index ==size){
           insertLast(val);
       }

       Node temp=head;
        for (int i = 1; i <index ; i++) {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size+=1;
    }

    public int deleteFirst(){
       int val=head.value;
       head=head.next;
       if(head==null){
           tail=head;
       }
       size--;
       return val;
    }

    //get index
    public Node get(int index){
        Node node =head;
        for (int i = 0; i < index; i++) {
            node =node.next;
        }
        return node;
    }


    //delete Last
    public int deleteLast(){
       if(size<=1){
           deleteFirst();
       }

       Node secondeLast=get(size-2);
       int val=secondeLast.value;
       tail=secondeLast;
       tail.next=null;
       return val;
    }

    public int delete(int index){
       if(index==0)deleteFirst();
       if(index==size-1)return deleteLast();
       Node preve=get(index-1);
       int val=preve.value;
       preve.next=preve.next.next;
       size--;
       return val;

    }

    public int find(int value){
       Node temp=head;
       int index=0;
       while(temp!=null){
           if(temp.value ==value){
               return index;
           }
           index++;
           temp=temp.next;
       }
       return -1;
    }
}
