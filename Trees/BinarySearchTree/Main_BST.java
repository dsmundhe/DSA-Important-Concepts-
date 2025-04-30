package Trees.BinarySearchTree;

public class Main_BST {
    public static void main(String[] args) {
        BinarySearchTreeFull bst=new BinarySearchTreeFull();
        int[] nums={10,9,13,8,15};
        bst.populate(nums);
        bst.display();
        System.out.print("Preorder : ");
        bst.preOrder();
        System.out.println();

        System.out.print("Inorder : ");
        bst.inOrder();
        System.out.println();

        System.out.print("Postorder : ");
        bst.postOrder();
        System.out.println();

        //find val is present
        int val=10;
        System.out.println("IS " + val +" Present : "+ bst.findVal(val));

    }
}
