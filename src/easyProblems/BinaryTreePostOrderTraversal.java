package easyProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostOrderTraversal {
    public static void main(String[] args) {
        // Create leaf nodes
        TreeNode leaf15 = new TreeNode(15);
        TreeNode leaf28 = new TreeNode(28);
        TreeNode leaf35 = new TreeNode(35);
        TreeNode leaf45 = new TreeNode(45);
        TreeNode leaf55 = new TreeNode(55);
        TreeNode leaf70 = new TreeNode(70);

        // Create internal nodes
        TreeNode node25 = new TreeNode(25, leaf15, leaf28);
        TreeNode node30 = new TreeNode(30, node25, leaf35);
        TreeNode node60 = new TreeNode(60, leaf55, leaf70);
        TreeNode node50 = new TreeNode(50, leaf45, node60);

        // Create root node
        TreeNode root = new TreeNode(40, node30, node50);

        System.out.println(postorderTraversal(root));
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        if(root == null){
            return output;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        while (!stack.isEmpty()){
            TreeNode current_node = stack.pop();
            output.add(0,current_node.val);
            if(current_node.left != null){
                stack.add(current_node.left);
            }
            if (current_node.right != null){
                stack.add(current_node.right);
            }
        }
        return output;

    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
