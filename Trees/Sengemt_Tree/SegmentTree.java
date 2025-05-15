package Trees.Sengemt_Tree;


//for calculating sum of sub tree

public class SegmentTree {

    private class Node{
        int value;
        Node left;
        Node right;
        int sum;
        int height;

        Node(int value){
            this.value=value;
        }
    }
    //RootNode
    private Node rootNode;

    //insert Node
    public void insert(int value){
        rootNode=insert(rootNode,value);
        updateSum();
    }
    private Node insert(Node node,int value){
        if(node==null) {
            node = new Node(value);
            return node;
        }
        if(node.value >value){
            node.left=insert(node.left,value);
        }else{
            node.right=insert(node.right,value);
        }
        node.height=Math.max(getHeight(node.left),getHeight(node.right)+1);
        return node;
    }

    //insert Array

    public void populate(int[] arr){
        if(arr.length==0){
            return;
        }
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
    }

    public void updateSum(){
      updateSum(rootNode);
    }
    private void updateSum(Node node){
        if (node==null){
            return;
        }
        node.sum=getSum(node);
        updateSum(node.left);
        updateSum(node.right);
    }

    //getSum
    public int getSum(Node node){
            return getSum(node,0);
    }

    private int getSum(Node node, int sum){
        if(node==null){
            return 0;
        }

        return node.value + getSum(node.left,sum)+ getSum(node.right,sum);
    }


    //display
    public void display(){
        display(rootNode," Root Node : ");
    }
    private void display(Node node,String str){
        if(node==null){
            return;
        }
        System.out.println(node.value + str );
        display(node.left, " Left of "+ node.value + " Sum : "+ node.sum);
        display(node.right, " Left of "+ node.value + " Sum : " +node.sum);
    }

    public int getHeight(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

}
