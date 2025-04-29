package Trees.BinarySearchTree;

public class BTS {

    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        Node(int value){
            this.value=value;
        }

    }

    //root node
    private Node root;

    //getHeight
    public int getHeight(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }

    //isEmpty()
    public boolean isEmpty(){
        return root==null;
    }

    //inset Value

    public void insert(int val){
        root=insert(val,root);
    }

    private Node insert(int val,Node node){
        if(node==null){
            node=new Node(val);
            return node;
        }
        if(node.value > val){
            node.left=insert(val,node.left);
        }
        if(node.value<val){
            node.right=insert(val,node.right);
        }
        node.height=Math.max(getHeight(node.right),getHeight(node.left))+1;
        return node;
    }

    //insert values via array
    public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            insert(nums[i]);
        }
    }

    //tree is Balanced;
    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(getHeight(node.left)-getHeight(node.right))<=1 && balanced(node.left) &&balanced(node.right);
    }



    //display
    public void display(){
        display(root,"Root Node : ");
    }

    private void display(Node node,String details){
        if(node==null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left , "Left child of "+node.value + " : " );
        display(node.right , "Left right of "+node.value + " : " );
    }
}
