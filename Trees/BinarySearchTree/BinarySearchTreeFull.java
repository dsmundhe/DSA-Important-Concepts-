package Trees.BinarySearchTree;

public class BinarySearchTreeFull {
    private class Node{
        int value;
        Node left;
        Node right;
        int height;

        Node(int value){
            this.value=value;
        }
    }

    //root node
    private Node root;

    //insert value;
    public void insert(int value){
        root=insert(value,root);
    }
    //recursive insert
    private Node insert(int value,Node node){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(node.value >value){
            node.left=insert(value,node.left);
        }
        if(node.value<value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(getHeight(node.left),getHeight(node.right))+1;
        return node;
    }
    //getHeight
    public int getHeight(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }


    //insert via Array
    public void populate(int[] arr){
        for (int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
    }


    //insert sorted Array
    public void insertSortedArr(int[] arr){
        insertSortedArr(arr,0,arr.length);
    }
    private void insertSortedArr(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid=start + (end-start)/2;
        insert(arr[mid]);
        insertSortedArr(arr,start,mid);
        insertSortedArr(arr,mid+1,arr.length);
    }

    //traversal of Binary Search Tree

    //preorder traversal
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value+ " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //inorder traversal
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+ " ");
        inOrder(node.right);
    }

    //postorder traversal
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }


    //find value
    public boolean findVal(int value){
        return findVal(value,root);
    }
    private boolean findVal(int value,Node node){
        if(node==null){
            return false;
        }
        if(node.value==value){
            return true;
        }
        if(node.value > value){
            return findVal(value,node.left);
        }else{
            return findVal(value,node.right);
        }
    }


    //display fun
    public void display(){
        display(root," Root Val : ");
    }
    //recursive display
    private void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(node.value + details);
        display(node.left , " Left node of : "+node.value);
        display(node.right," Right node of "+node.value);
    }
}
