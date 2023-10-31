package Tree.root.traversal;

/**
 *
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [1,null,2,3]
 * Output: [1,3,2]
 * Example 2:
 *
 * Input: root = []
 * Output: []
 * Example 3:
 *
 * Input: root = [1]
 * Output: [1]
 *
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 *
 * https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 */
class Node {
    int data;
    Node left, right ;
    public Node(int _data){
        data = _data;
        left = right = null;
    }
}
public class InorderTraversal {
    Node root;

    void getInorderTraversal(Node node){
        if (node == null ) return ;

        getInorderTraversal(node.left);

        System.out.println("Current element => "+ node.data);

        getInorderTraversal(node.right);
    }

    public static void main(String[] args) {
        InorderTraversal myNode = new InorderTraversal();
        myNode.root = new Node(1);
        myNode.root.left = new Node(2);
        myNode.root.right = new Node(3);
        myNode.root.left.left = new Node(4);
        myNode.root.left.right = new Node(5);

        System.out.println("Inroder traversal ");

        //1 -> 2 ,3
        //      2-> 4,5
        myNode.getInorderTraversal(myNode.root);
        // 4,2,5,1,3
    }
}
