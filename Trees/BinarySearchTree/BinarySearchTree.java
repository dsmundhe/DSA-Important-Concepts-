package Trees.BinarySearchTree;

import Trees.BinaryTree.BinaryTree;

public class BinarySearchTree {

    private static class Node{
         int val;
         Node left;
         Node right;
         Node height;

         Node(int val){
             this.val=val;
         }
    }

    //Root Node declaration
    private Node root;

    BinarySearchTree(){

    }

    //insert Root Node
    public void insertRootNode(int val){
        root=new Node(val);
    }

    //insert Fun;
    public void insert(int val){
        insert(val,root);
    }
    //insert At position
    private void insert(int val,Node node){
        if(node==null){
            return;
        }
        if( val>node.val){
           if(node.right==null){
               node.right=new Node(val);
           }else {
               insert(val,node.right);
           }
        }else {
            if(node.left==null){
                node.left=new Node(val);
            }else {
                insert(val,node.left);
            }
        }
    }

    //display fun
    public void display(){
        display(root,0);
    }
    public void display(Node node, int level){
        if(node==null){
            return;
        }
        display(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.val);
        } else {
            System.out.println(node.val);
        }

        display(node.left, level + 1);
    }
}
