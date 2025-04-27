package Trees.BinaryTree;

import javax.swing.*;
import java.util.Scanner;

public class BinaryTree {

    private static  class Node{
        Node left;
        Node right;
        int value;

        public Node(int value){
            this.value=value;
        }
    }

    private Node root;


    public void populate(Scanner scanner ){
        System.out.print("Enter the Root Node : ");
        int val=scanner.nextInt();
        root=new Node(val);
        populate(root,scanner);
    }
    public void populate(Node node, Scanner scanner){

        //for left
        System.out.print("Do you want to insert value left of "+node.value  + " true/false : ");
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.print("Enter the Value : ");
            int val=scanner.nextInt();
            node.left=new Node(val);
            populate(node.left,scanner);
        }

        //same for right
        System.out.print("Do you want to insert value right of "+node.value + " true/false  : ");
        boolean right=scanner.nextBoolean();
        if(right){
            System.out.print("Enter the Value : ");
            int val=scanner.nextInt();
            node.right=new Node(val);
            populate(node.right,scanner);


        }

    }

    public void display(){
        display(root,0);
    }
    public void display(Node node,int level){
        if(node==null){
            return;
        }
        display(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }

        display(node.left, level + 1);
    }
}
