import java.util.LinkedList;
import java.util.Queue;

public class RangeSumOfBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = null;
        root.right.right = new TreeNode(18);
       // System.out.println(rangeSumBST(root, 7,15));
        System.out.println(rangeSumBST1(root, 7,15));
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        int count =0;
        if (root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        if(root.val >= low && root.val <= high)
        {
            count += root.val;
        }
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i =0; i < size; i++){
                TreeNode currentNode = queue.poll();
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                    if(currentNode.left.val >= low && currentNode.left.val <= high)
                    {
                        count += currentNode.left.val;
                    }
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                    if(currentNode.right.val >= low && currentNode.right.val <= high)
                    {
                        count += currentNode.right.val;
                    }
                }

            }
        }
        return count;
    }

    public static int rangeSumBST1(TreeNode root, int low, int high) {

        if (root == null){
            return 0;
        }
        int count =0;
        if(root.val >= low && root.val <= high)
        {
            count += root.val;
        }
        // Recursively explore the left and right subtrees if they can possibly contain values in the range
        if (root.val > low) {
            count += rangeSumBST1(root.left, low, high);
        }
        if (root.val < high) {
            count += rangeSumBST1(root.right, low, high);
        }

        return count;
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