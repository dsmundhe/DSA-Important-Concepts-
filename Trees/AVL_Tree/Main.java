package Trees.AVL_Tree;

public class Main {
    public static void main(String[] args) {
        AVL tree=new AVL();
        int[] nums={10,15,12,9,8,13,14};
        int[] sorted={1,2,3,4,5,6,7,8,9,12,13,15};
//        tree.insertArr(nums);
        tree.insertArr(sorted);
        tree.display();
        System.out.println("Height of Tree : "+tree.height());
    }
}
