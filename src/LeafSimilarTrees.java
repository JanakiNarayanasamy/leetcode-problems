import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(9);;
        root.right.right = new TreeNode(8);

        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(7);
        root1.right.left = new TreeNode(4);
        root1.right.right = new TreeNode(2);
        root1.right.right.left = new TreeNode(8);
        root1.right.right.right = new TreeNode(9);

        System.out.println(leafSimilar(root,root1));
    }
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1= new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        checkTree(root1,list1);
        checkTree(root2, list2);
        System.out.println(list1);
        System.out.println(list2);
        if (list1.equals(list2)){
            return true;
        }else {
            return false;
        }
    }

    private static void checkTree(TreeNode root1,List<Integer> list ){

        if(root1.left == null && root1.right == null){
            list.add(root1.val);
        }else {
            checkTree(root1.left,list);
            checkTree(root1.right,list);
        }
    }
}
