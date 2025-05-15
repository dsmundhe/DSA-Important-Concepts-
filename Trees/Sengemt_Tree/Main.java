package Trees.Sengemt_Tree;

public class Main {
    public static void main(String[] args){
        SegmentTree tree=new SegmentTree();
        int[] nums={10,8,11,9,16,15,7,3};
        tree.populate(nums);
        tree.display();
    }
}
