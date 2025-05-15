package Trees.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
//        BinarySearchTree bts=new BinarySearchTree();
//        bts.insertRootNode(10);
//        bts.insert(15);
//        bts.insert(6);
//        bts.insert(8);
//        bts.insert(11);
//        bts.insert(3);
//        bts.display();

        //BTS

        BTS bsTree=new BTS();
        int[] nums= {10,15,3,6,8,9};
        bsTree.populate(nums);
        bsTree.display();
        System.out.println(bsTree.balanced());



    }
}
