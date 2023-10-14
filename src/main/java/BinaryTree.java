import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    private Node root;

    class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value, Node left, Node right){
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    public BinaryTree(){
        Node node1 = new Node(6, null, null);
        Node node2 = new Node(9, null, null);
        Node node3 = new Node(5, null, null);
        Node node4 = new Node(100, null, null);

        root = new Node(8, node1, node2);
        node1.setLeft(node3);
        node1.setRight(node4);

        /*
                    8
                   / \
                  6   9
                 / \
                5  100

         */

    }

    public void traverse_iterative(){ // depth first traversal
        // first in last out (FILO)
        Stack<Node> nodeStack = new Stack<>();
        nodeStack.push(root);
        while (!nodeStack.empty()){
            Node node = nodeStack.pop();
            if (node == null)
                continue;
            System.out.println(node.value);
            nodeStack.push(node.right);
            nodeStack.push(node.left);
        }
    }
    // first in first out - breath first search
    public void traverse_iterative2(){
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()){
            Node node = nodeQueue.poll();
            if (node == null)
                continue;
            System.out.println(node.value);
            nodeQueue.add(node.left);
            nodeQueue.add(node.right);
        }
    }

    /*
    * output:
    8    8
    9    6
    6    5
    5    9
    * */

}
