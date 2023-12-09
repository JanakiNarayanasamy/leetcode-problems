import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthOfNaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node child1 = new Node(2);
        Node child2 = new Node(3);
        Node child3 = new Node(4);
        Node grandchild1 = new Node(5);
        Node grandchild2 = new Node(6);
        Node grandchild3 = new Node(7);

        root.children = new LinkedList<>();
        child1.children = new LinkedList<>();
        child2.children = new LinkedList<>();
        child3.children = new LinkedList<>();

        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);

        child1.children.add(grandchild1);
        child2.children.add(grandchild2);
        child3.children.add(grandchild3);

        System.out.println(maxDepth(root));
    }
    public static int maxDepth(Node root) {
        if (root == null) return 0;

        int depth =0;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i =0; i < size; i++){
                Node currentNode = queue.poll();
                if (currentNode.children != null) {
                    for (Node child : currentNode.children) {
                        queue.offer(child);
                    }
                }
            }
            depth++;
        }
        return depth;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
