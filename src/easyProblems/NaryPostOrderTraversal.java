package easyProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NaryPostOrderTraversal {
    public static List<Integer> postorder(Node root) {
        List<Integer> output = new ArrayList<>();
        if(root == null){
            return output;
        }
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()){
            Node current_node = stack.pop();
            output.add(0,current_node.val);
            if(!current_node.children.isEmpty()){
                for(Node node : current_node.children){
                    stack.add(node);
                }
            }
        }
        return output;
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
};