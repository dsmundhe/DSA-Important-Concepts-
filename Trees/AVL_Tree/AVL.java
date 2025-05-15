package Trees.AVL_Tree;

public class AVL {

    private class Node{
        int value;
        Node left;
        Node right;
        int height;

        Node(int value){
            this.value=value;
        }
    }

    //Root Node
    private Node rootNode;

    //insert Node
    public void insert(int val){
            rootNode=insert(rootNode,val);
    }
    private Node insert(Node node,int value){
        if(node==null){
            node =new Node(value);
            return node;
        }
        if(node.value > value){
            node.left=insert(node.left,value);
        }else{
            node.right=insert(node.right,value);
        }
        node.height=Math.max(getHeight(node.left),getHeight(node.right))+1;
        return rotate(node);
    }

    //actual self balancing function
    private Node rotate(Node node){
        if(getHeight(node.left)-getHeight(node.right) >1){
            if(getHeight(node.left.left)-getHeight(node.left.right)>0){
                return rightRoatate(node);
            }
            if(getHeight(node.left.left)-getHeight(node.left.right)<0){
                node.left=leftRotate(node.left);
                return rightRoatate(node);
            }
        }
        if(getHeight(node.left)-getHeight(node.right)<-1){
            if(getHeight(node.right.left)-getHeight(node.right.right)<0){
                return leftRotate(node);
            }
            if(getHeight(node.right.left)-getHeight(node.right.right)>0){
                node.right=rightRoatate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    //right Rotate
    private Node rightRoatate(Node p){
        Node c=p.left;
        Node t=c.right;

        p.left=t;
        c.right=p;
        p.height=Math.max(getHeight(p.left),getHeight(p.right)+1);
        c.height=Math.max(getHeight(c.left),getHeight(c.right)+1);
        return c;
    }

    //left Rotate
    private Node leftRotate(Node c){
        Node p=c.right;
        Node t=p.left;
        c.right=t;
        p.left=c;

        p.height=Math.max(getHeight(p.left),getHeight(p.right)+1);
        c.height=Math.max(getHeight(c.left),getHeight(c.right)+1);

        return p;
    }


    //display
    public void display(){
        display(rootNode," Root Node : ");
    }
    private void display(Node node,String str){
        if(node==null){
            return;
        }
        System.out.println(node.value + str);
        display(node.left, " Left Node of " + node.value);
        display(node.right," Right Node of " + node.value);
    }

    //insert via array
    public void insertArr(int[] arr){
        if(arr.length==0){
            return;
        }
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
        System.out.println("Array inserted!");
    }

    //populate sorted array
    public void populate(int[] arr){
        if(arr.length==0){
            return;
        }
        populate(arr,0,arr.length);
    }
    private void populate(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid=start + (end-start)/2;
        insert(arr[mid]);
        populate(arr,start,mid);
        populate(arr,mid+1,end);
    }

    //isBalanced
    public boolean isBalanced(){
        return isBalanced(rootNode);
    }
    private boolean isBalanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(getHeight(node.left)- getHeight(node.right) )<=1 && isBalanced(node.left) && isBalanced(node.right);
    }

    //getHeight
    public int getHeight(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    //Height
    public int height(){
        return rootNode.height;
    }

    //isEmpty
    public boolean isEmpty(){
        return rootNode==null;
    }
}
