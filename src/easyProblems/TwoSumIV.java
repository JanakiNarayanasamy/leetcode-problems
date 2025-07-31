package easyProblems;

import java.util.HashSet;
import java.util.Set;

public class TwoSumIV {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        System.out.println(findTarget(root, 9));
    }


    public static boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return dfs(root, k, set);
    }

    public static boolean dfs(TreeNode node, int k, Set<Integer> set){
        if(node == null) return false;

        if(set.contains(k - node.val)){
            return true;
        }

        set.add(node.val);

        return dfs(node.left, k, set) || dfs(node.right, k, set);
    }
}
